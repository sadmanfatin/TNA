package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 27 15:53:26 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxTnaHEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        TnaHId {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getTnaHId();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setTnaHId((Number)value);
            }
        }
        ,
        PocId {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getPocId();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setPocId((Number)value);
            }
        }
        ,
        SystemId {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getSystemId();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setSystemId((Number)value);
            }
        }
        ,
        BuyerId {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getBuyerId();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        TnaDateId {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getTnaDateId();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setTnaDateId((Number)value);
            }
        }
        ,
        DTnaDateId {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getDTnaDateId();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setDTnaDateId((Number)value);
            }
        }
        ,
        DayDifference {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getDayDifference();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setDayDifference((Number)value);
            }
        }
        ,
        DependencyValue {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getDependencyValue();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setDependencyValue((Number)value);
            }
        }
        ,
        DependencyType {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getDependencyType();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setDependencyType((String)value);
            }
        }
        ,
        TnaVersionId {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getTnaVersionId();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setTnaVersionId((Number)value);
            }
        }
        ,
        FabricCountry {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getFabricCountry();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setFabricCountry((String)value);
            }
        }
        ,
        TnaDateValue {
            public Object get(XxTnaHEOImpl obj) {
                return obj.getTnaDateValue();
            }

            public void put(XxTnaHEOImpl obj, Object value) {
                obj.setTnaDateValue((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(XxTnaHEOImpl object);

        public abstract void put(XxTnaHEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int TNAHID = AttributesEnum.TnaHId.index();
    public static final int POCID = AttributesEnum.PocId.index();
    public static final int SYSTEMID = AttributesEnum.SystemId.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int TNADATEID = AttributesEnum.TnaDateId.index();
    public static final int DTNADATEID = AttributesEnum.DTnaDateId.index();
    public static final int DAYDIFFERENCE = AttributesEnum.DayDifference.index();
    public static final int DEPENDENCYVALUE = AttributesEnum.DependencyValue.index();
    public static final int DEPENDENCYTYPE = AttributesEnum.DependencyType.index();
    public static final int TNAVERSIONID = AttributesEnum.TnaVersionId.index();
    public static final int FABRICCOUNTRY = AttributesEnum.FabricCountry.index();
    public static final int TNADATEVALUE = AttributesEnum.TnaDateValue.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxTnaHEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.XxTnaHEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for TnaHId, using the alias name TnaHId.
     * @return the TnaHId
     */
    public Number getTnaHId() {
        return (Number)getAttributeInternal(TNAHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnaHId.
     * @param value value to set the TnaHId
     */
    public void setTnaHId(Number value) {
        setAttributeInternal(TNAHID, value);
    }

    /**
     * Gets the attribute value for PocId, using the alias name PocId.
     * @return the PocId
     */
    public Number getPocId() {
        return (Number)getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PocId.
     * @param value value to set the PocId
     */
    public void setPocId(Number value) {
        setAttributeInternal(POCID, value);
    }

    /**
     * Gets the attribute value for SystemId, using the alias name SystemId.
     * @return the SystemId
     */
    public Number getSystemId() {
        return (Number)getAttributeInternal(SYSTEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SystemId.
     * @param value value to set the SystemId
     */
    public void setSystemId(Number value) {
        setAttributeInternal(SYSTEMID, value);
    }

    /**
     * Gets the attribute value for BuyerId, using the alias name BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number)getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuyerId.
     * @param value value to set the BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for TnaDateId, using the alias name TnaDateId.
     * @return the TnaDateId
     */
    public Number getTnaDateId() {
        return (Number)getAttributeInternal(TNADATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnaDateId.
     * @param value value to set the TnaDateId
     */
    public void setTnaDateId(Number value) {
        setAttributeInternal(TNADATEID, value);
    }

    /**
     * Gets the attribute value for DTnaDateId, using the alias name DTnaDateId.
     * @return the DTnaDateId
     */
    public Number getDTnaDateId() {
        return (Number)getAttributeInternal(DTNADATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DTnaDateId.
     * @param value value to set the DTnaDateId
     */
    public void setDTnaDateId(Number value) {
        setAttributeInternal(DTNADATEID, value);
    }


    /**
     * Gets the attribute value for DayDifference, using the alias name DayDifference.
     * @return the DayDifference
     */
    public Number getDayDifference() {
        return (Number)getAttributeInternal(DAYDIFFERENCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DayDifference.
     * @param value value to set the DayDifference
     */
    public void setDayDifference(Number value) {
        setAttributeInternal(DAYDIFFERENCE, value);
    }


    /**
     * Gets the attribute value for DependencyValue, using the alias name DependencyValue.
     * @return the DependencyValue
     */
    public Number getDependencyValue() {
        return (Number)getAttributeInternal(DEPENDENCYVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DependencyValue.
     * @param value value to set the DependencyValue
     */
    public void setDependencyValue(Number value) {
        setAttributeInternal(DEPENDENCYVALUE, value);
    }

    /**
     * Gets the attribute value for DependencyType, using the alias name DependencyType.
     * @return the DependencyType
     */
    public String getDependencyType() {
        return (String)getAttributeInternal(DEPENDENCYTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DependencyType.
     * @param value value to set the DependencyType
     */
    public void setDependencyType(String value) {
        setAttributeInternal(DEPENDENCYTYPE, value);
    }

    /**
     * Gets the attribute value for TnaVersionId, using the alias name TnaVersionId.
     * @return the TnaVersionId
     */
    public Number getTnaVersionId() {
        return (Number)getAttributeInternal(TNAVERSIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnaVersionId.
     * @param value value to set the TnaVersionId
     */
    public void setTnaVersionId(Number value) {
        setAttributeInternal(TNAVERSIONID, value);
    }

    /**
     * Gets the attribute value for FabricCountry, using the alias name FabricCountry.
     * @return the FabricCountry
     */
    public String getFabricCountry() {
        return (String)getAttributeInternal(FABRICCOUNTRY);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabricCountry.
     * @param value value to set the FabricCountry
     */
    public void setFabricCountry(String value) {
        setAttributeInternal(FABRICCOUNTRY, value);
    }

    /**
     * Gets the attribute value for TnaDateValue, using the alias name TnaDateValue.
     * @return the TnaDateValue
     */
    public Date getTnaDateValue() {
        return (Date)getAttributeInternal(TNADATEVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnaDateValue.
     * @param value value to set the TnaDateValue
     */
    public void setTnaDateValue(Date value) {
        setAttributeInternal(TNADATEVALUE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param tnaHId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number tnaHId) {
        return new Key(new Object[]{tnaHId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        oracle.jbo.server.SequenceImpl s =
        new oracle.jbo.server.SequenceImpl("XX_TNA_H_S",  getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        this.setTnaHId(sVal);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
