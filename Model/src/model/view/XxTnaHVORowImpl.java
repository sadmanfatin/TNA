package model.view;

import java.math.BigDecimal;

import java.sql.Date;

import model.entity.XxTnaHEOImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jul 02 20:17:30 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxTnaHVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        TnaHId {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getTnaHId();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setTnaHId((Number)value);
            }
        }
        ,
        PocId {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getPocId();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setPocId((Number)value);
            }
        }
        ,
        SystemId {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getSystemId();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setSystemId((Number)value);
            }
        }
        ,
        BuyerId {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getBuyerId();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        TnaDateId {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getTnaDateId();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setTnaDateId((Number)value);
            }
        }
        ,
        TnaDateName {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getTnaDateName();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setTnaDateName((String)value);
            }
        }
        ,
        DTnaDateId {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getDTnaDateId();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setDTnaDateId((Number)value);
            }
        }
        ,
        DTnaDateName {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getDTnaDateName();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setDTnaDateName((String)value);
            }
        }
        ,
        DayDifference {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getDayDifference();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setDayDifference((Number)value);
            }
        }
        ,
        DependencyType {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getDependencyType();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setDependencyType((String)value);
            }
        }
        ,
        DependencyValue {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getDependencyValue();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setDependencyValue((Number)value);
            }
        }
        ,
        TnaVersionId {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getTnaVersionId();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setTnaVersionId((Number)value);
            }
        }
        ,
        FabricCountry {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getFabricCountry();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setFabricCountry((String)value);
            }
        }
        ,
        TnaDateValue {
            public Object get(XxTnaHVORowImpl obj) {
                return obj.getTnaDateValue();
            }

            public void put(XxTnaHVORowImpl obj, Object value) {
                obj.setTnaDateValue((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(XxTnaHVORowImpl object);

        public abstract void put(XxTnaHVORowImpl object, Object value);

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
    public static final int TNADATENAME = AttributesEnum.TnaDateName.index();
    public static final int DTNADATEID = AttributesEnum.DTnaDateId.index();
    public static final int DTNADATENAME = AttributesEnum.DTnaDateName.index();
    public static final int DAYDIFFERENCE = AttributesEnum.DayDifference.index();
    public static final int DEPENDENCYTYPE = AttributesEnum.DependencyType.index();
    public static final int DEPENDENCYVALUE = AttributesEnum.DependencyValue.index();
    public static final int TNAVERSIONID = AttributesEnum.TnaVersionId.index();
    public static final int FABRICCOUNTRY = AttributesEnum.FabricCountry.index();
    public static final int TNADATEVALUE = AttributesEnum.TnaDateValue.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxTnaHVORowImpl() {
    }

    /**
     * Gets XxTnaHEO entity object.
     * @return the XxTnaHEO
     */
    public XxTnaHEOImpl getXxTnaHEO() {
        return (XxTnaHEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for TNA_H_ID using the alias name TnaHId.
     * @return the TNA_H_ID
     */
    public Number getTnaHId() {
        return (Number)getAttributeInternal(TNAHID);
    }

    /**
     * Sets <code>value</code> as attribute value for TNA_H_ID using the alias name TnaHId.
     * @param value value to set the TNA_H_ID
     */
    public void setTnaHId(Number value) {
        setAttributeInternal(TNAHID, value);
    }

    /**
     * Gets the attribute value for POC_ID using the alias name PocId.
     * @return the POC_ID
     */
    public Number getPocId() {
        return (Number)getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as attribute value for POC_ID using the alias name PocId.
     * @param value value to set the POC_ID
     */
    public void setPocId(Number value) {
        setAttributeInternal(POCID, value);
    }

    /**
     * Gets the attribute value for SYSTEM_ID using the alias name SystemId.
     * @return the SYSTEM_ID
     */
    public Number getSystemId() {
        return (Number)getAttributeInternal(SYSTEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for SYSTEM_ID using the alias name SystemId.
     * @param value value to set the SYSTEM_ID
     */
    public void setSystemId(Number value) {
        setAttributeInternal(SYSTEMID, value);
    }

    /**
     * Gets the attribute value for BUYER_ID using the alias name BuyerId.
     * @return the BUYER_ID
     */
    public Number getBuyerId() {
        return (Number)getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as attribute value for BUYER_ID using the alias name BuyerId.
     * @param value value to set the BUYER_ID
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for TNA_DATE_ID using the alias name TnaDateId.
     * @return the TNA_DATE_ID
     */
    public Number getTnaDateId() {
        return (Number)getAttributeInternal(TNADATEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TNA_DATE_ID using the alias name TnaDateId.
     * @param value value to set the TNA_DATE_ID
     */
    public void setTnaDateId(Number value) {
        setAttributeInternal(TNADATEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TnaDateName.
     * @return the TnaDateName
     */
    public String getTnaDateName() {
        return (String) getAttributeInternal(TNADATENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TnaDateName.
     * @param value value to set the  TnaDateName
     */
    public void setTnaDateName(String value) {
        setAttributeInternal(TNADATENAME, value);
    }

    /**
     * Gets the attribute value for D_TNA_DATE_ID using the alias name DTnaDateId.
     * @return the D_TNA_DATE_ID
     */
    public Number getDTnaDateId() {
        return (Number)getAttributeInternal(DTNADATEID);
    }

    /**
     * Sets <code>value</code> as attribute value for D_TNA_DATE_ID using the alias name DTnaDateId.
     * @param value value to set the D_TNA_DATE_ID
     */
    public void setDTnaDateId(Number value) {
        setAttributeInternal(DTNADATEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DTnaDateName.
     * @return the DTnaDateName
     */
    public String getDTnaDateName() {
        return (String) getAttributeInternal(DTNADATENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DTnaDateName.
     * @param value value to set the  DTnaDateName
     */
    public void setDTnaDateName(String value) {
        setAttributeInternal(DTNADATENAME, value);
    }

    /**
     * Gets the attribute value for DAY_DIFFERENCE using the alias name DayDifference.
     * @return the DAY_DIFFERENCE
     */
    public Number getDayDifference() {
        return (Number)getAttributeInternal(DAYDIFFERENCE);
    }

    /**
     * Sets <code>value</code> as attribute value for DAY_DIFFERENCE using the alias name DayDifference.
     * @param value value to set the DAY_DIFFERENCE
     */
    public void setDayDifference(Number value) {
        setAttributeInternal(DAYDIFFERENCE, value);
    }

    /**
     * Gets the attribute value for DEPENDENCY_TYPE using the alias name DependencyType.
     * @return the DEPENDENCY_TYPE
     */
    public String getDependencyType() {
        return (String) getAttributeInternal(DEPENDENCYTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPENDENCY_TYPE using the alias name DependencyType.
     * @param value value to set the DEPENDENCY_TYPE
     */
    public void setDependencyType(String value) {
        setAttributeInternal(DEPENDENCYTYPE, value);
    }

    /**
     * Gets the attribute value for DEPENDENCY_VALUE using the alias name DependencyValue.
     * @return the DEPENDENCY_VALUE
     */
    public Number getDependencyValue() {
        return (Number)getAttributeInternal(DEPENDENCYVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPENDENCY_VALUE using the alias name DependencyValue.
     * @param value value to set the DEPENDENCY_VALUE
     */
    public void setDependencyValue(Number value) {
        setAttributeInternal(DEPENDENCYVALUE, value);
    }

    /**
     * Gets the attribute value for TNA_VERSION_ID using the alias name TnaVersionId.
     * @return the TNA_VERSION_ID
     */
    public Number getTnaVersionId() {
        return (Number) getAttributeInternal(TNAVERSIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for TNA_VERSION_ID using the alias name TnaVersionId.
     * @param value value to set the TNA_VERSION_ID
     */
    public void setTnaVersionId(Number value) {
        setAttributeInternal(TNAVERSIONID, value);
    }

    /**
     * Gets the attribute value for FABRIC_COUNTRY using the alias name FabricCountry.
     * @return the FABRIC_COUNTRY
     */
    public String getFabricCountry() {
        return (String) getAttributeInternal(FABRICCOUNTRY);
    }

    /**
     * Sets <code>value</code> as attribute value for FABRIC_COUNTRY using the alias name FabricCountry.
     * @param value value to set the FABRIC_COUNTRY
     */
    public void setFabricCountry(String value) {
        setAttributeInternal(FABRICCOUNTRY, value);
    }

    /**
     * Gets the attribute value for TNA_DATE_VALUE using the alias name TnaDateValue.
     * @return the TNA_DATE_VALUE
     */
    public Date getTnaDateValue() {
        return (Date) getAttributeInternal(TNADATEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for TNA_DATE_VALUE using the alias name TnaDateValue.
     * @param value value to set the TNA_DATE_VALUE
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
}
