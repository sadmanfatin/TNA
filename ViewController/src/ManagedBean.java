import java.sql.CallableStatement;

import javax.faces.event.ActionEvent;

import model.service.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class ManagedBean {
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
        
        String fobId = (String)currentRow.getAttribute("FobId");
        
        
        populateTnaForStyleWashFabric(fobId);
        
    }

    private void populateTnaForStyleWashFabric(String fobId) {
        
        String statement = "BEGIN APPS.CREATE_TNA_VERSION(:1) END;";
        
        CallableStatement cs = appM.getDBTransaction().createCallableStatement(statement, 1);
      
     
        try {
            cs.setInt(1, Integer.parseInt(fobId));
            cs.execute();
        } catch (Exception e) {
           e.printStackTrace() ;
        }
        
    }
}
