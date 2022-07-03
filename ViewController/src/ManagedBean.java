import java.sql.CallableStatement;

import java.sql.SQLException;

import java.util.Calendar;

import java.util.Date;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import model.service.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;


public class ManagedBean {
    private RichTable tnaHTable;

    public ManagedBean() {
    }
    
    AppModuleImpl appM = getAppModuleImpl();

    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }

    public void populateTna(ActionEvent actionEvent) {
        // Add event code here...
        
        ViewObject pocVo = appM.getPocStyleWashFabricVO1();
        
        Row currentRow = pocVo.getCurrentRow();
        
        
        
        
        String pocId =  currentRow.getAttribute("PocId").toString();
        String systemId =  currentRow.getAttribute("SystemId").toString();
        String fabricSupplierCountry = (String)currentRow.getAttribute("FabricSupplierCountry");
        
        populateTnaForStyleWashFabric(pocId, systemId, fabricSupplierCountry);
        
    }

    private void populateTnaForStyleWashFabric(String pocId, String systemId, String fabricSupplierCountry) {
        
        String statement = "BEGIN APPS.CREATE_TNA_VERSION(:1, :2, :3); END;";
        
        CallableStatement cs = appM.getDBTransaction().createCallableStatement(statement, 1);
      
     
        try {
            cs.setInt(1, Integer.parseInt(pocId));
            cs.setInt(2, Integer.parseInt(systemId));
            cs.setString(3, fabricSupplierCountry);
            
            cs.execute();
            cs.close();
        } catch (Exception e) {
           e.printStackTrace() ;
        }
    
    }

    public void changeDependantTnaDates(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
         Date newTnaDate = (Date)valueChangeEvent.getNewValue();
        
         ViewObject tnahVo = appM.getXxTnaHVO1();
         Row currentRow = tnahVo.getCurrentRow();
        oracle.jbo.domain.Number tnaDateId = (oracle.jbo.domain.Number)currentRow.getAttribute("TnaDateId");
         System.out.println("tnaDateName  "+ currentRow.getAttribute("TnaDateName") );
         try {
            updateDependingTnaDates(tnaDateId, newTnaDate);
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

         
         
                          
    }

    private void updateDependingTnaDates(oracle.jbo.domain.Number tnaDateId, Date newTnaDate) {
                        
       System.out.println("================= in update updateDependingTnaDates ========================");                 
                        
        Row[] dependingTnaRows =  appM.getXxTnaHVO1().getFilteredRows("DTnaDateId", tnaDateId);
        Date newDate    = null;
       
       
      //  oracle.jbo.domain.Number dTnaDateId = null;
       oracle.jbo.domain.Number depedencyValue = null;


        for (Row row : dependingTnaRows) {

            System.out.println("================= for (Row row : dependingTnaRows) ========================");

            tnaDateId = (Number)row.getAttribute("TnaDateId");
            depedencyValue = (Number)row.getAttribute("DependencyValue");

            newDate = addDays(newTnaDate, depedencyValue.intValue());

            System.out.println(" =========== tna date " +
                               row.getAttribute("TnaDateName") +
                               " ======   depedencyValue ===== " +
                               depedencyValue + " ==== newDate " + newDate);
            try {
                row.setAttribute("TnaDateValue", newDate);
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            }

            try {
                updateDependingTnaDates(tnaDateId, newDate);
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            }

            

        }

        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getTnaHTable());

    }
    public  Date addDays(Date newTnaDate, int days) {
         //java.sql.Date sqlDate = (java.sql.Date)newTnaDate.getValue();
          Calendar c = Calendar.getInstance();
          c.setTime(newTnaDate);
          c.add(Calendar.DATE, days);
       // try {
            newTnaDate = new Date(c.getTimeInMillis());
       // } catch (SQLException e) {
       //     ;
       // }
       return newTnaDate;
        
    }

    public void setTnaHTable(RichTable tnaHTable) {
        this.tnaHTable = tnaHTable;
    }

    public RichTable getTnaHTable() {
        return tnaHTable;
    }
}
