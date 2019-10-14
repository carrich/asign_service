/**
 * District.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service11;

public class District  implements java.io.Serializable {
    private long createdAt;

    private long deletedAt;

    private long id;

    private java.lang.String name;

    private service11.Place[] places;

    private int status;

    private long updatedAt;

    public District() {
    }

    public District(
           long createdAt,
           long deletedAt,
           long id,
           java.lang.String name,
           service11.Place[] places,
           int status,
           long updatedAt) {
           this.createdAt = createdAt;
           this.deletedAt = deletedAt;
           this.id = id;
           this.name = name;
           this.places = places;
           this.status = status;
           this.updatedAt = updatedAt;
    }


    /**
     * Gets the createdAt value for this District.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this District.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the deletedAt value for this District.
     * 
     * @return deletedAt
     */
    public long getDeletedAt() {
        return deletedAt;
    }


    /**
     * Sets the deletedAt value for this District.
     * 
     * @param deletedAt
     */
    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }


    /**
     * Gets the id value for this District.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this District.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this District.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this District.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the places value for this District.
     * 
     * @return places
     */
    public service11.Place[] getPlaces() {
        return places;
    }


    /**
     * Sets the places value for this District.
     * 
     * @param places
     */
    public void setPlaces(service11.Place[] places) {
        this.places = places;
    }

    public service11.Place getPlaces(int i) {
        return this.places[i];
    }

    public void setPlaces(int i, service11.Place _value) {
        this.places[i] = _value;
    }


    /**
     * Gets the status value for this District.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this District.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the updatedAt value for this District.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this District.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof District)) return false;
        District other = (District) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.createdAt == other.getCreatedAt() &&
            this.deletedAt == other.getDeletedAt() &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.places==null && other.getPlaces()==null) || 
             (this.places!=null &&
              java.util.Arrays.equals(this.places, other.getPlaces()))) &&
            this.status == other.getStatus() &&
            this.updatedAt == other.getUpdatedAt();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getCreatedAt()).hashCode();
        _hashCode += new Long(getDeletedAt()).hashCode();
        _hashCode += new Long(getId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPlaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getStatus();
        _hashCode += new Long(getUpdatedAt()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(District.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example/", "district"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deletedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("places");
        elemField.setXmlName(new javax.xml.namespace.QName("", "places"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "place"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
