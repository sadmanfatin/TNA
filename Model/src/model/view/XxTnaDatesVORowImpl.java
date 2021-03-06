package model.view;

import model.entity.XxTnaDatesEOImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 23 17:44:10 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxTnaDatesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        TnaDateId {
            public Object get(XxTnaDatesVORowImpl obj) {
                return obj.getTnaDateId();
            }

            public void put(XxTnaDatesVORowImpl obj, Object value) {
                obj.setTnaDateId((Number)value);
            }
        }
        ,
        TnaDateName {
            public Object get(XxTnaDatesVORowImpl obj) {
                return obj.getTnaDateName();
            }

            public void put(XxTnaDatesVORowImpl obj, Object value) {
                obj.setTnaDateName((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(XxTnaDatesVORowImpl object);

        public abstract void put(XxTnaDatesVORowImpl object, Object value);

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
    public static final int TNADATEID = AttributesEnum.TnaDateId.index();
    public static final int TNADATENAME = AttributesEnum.TnaDateName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxTnaDatesVORowImpl() {
    }

    /**
     * Gets XxTnaDatesEO entity object.
     * @return the XxTnaDatesEO
     */
    public XxTnaDatesEOImpl getXxTnaDatesEO() {
        return (XxTnaDatesEOImpl)getEntity(0);
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
     * Gets the attribute value for TNA_DATE_NAME using the alias name TnaDateName.
     * @return the TNA_DATE_NAME
     */
    public String getTnaDateName() {
        return (String) getAttributeInternal(TNADATENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TNA_DATE_NAME using the alias name TnaDateName.
     * @param value value to set the TNA_DATE_NAME
     */
    public void setTnaDateName(String value) {
        setAttributeInternal(TNADATENAME, value.trim());
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
