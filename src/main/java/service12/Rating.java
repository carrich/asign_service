/**
 * Rating.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service12;

public class Rating  implements java.io.Serializable {
    private long createdAt;

    private long deletedAt;

    private long id;

    private service12.Member member;

    private long pid;

    private service12.Place place;

    private long updatedAt;

    private int value;

    public Rating() {
    }

    public Rating(
           long createdAt,
           long deletedAt,
           long id,
           service12.Member member,
           long pid,
           service12.Place place,
           long updatedAt,
           int value) {
           this.createdAt = createdAt;
           this.deletedAt = deletedAt;
           this.id = id;
           this.member = member;
           this.pid = pid;
           this.place = place;
           this.updatedAt = updatedAt;
           this.value = value;
    }


    /**
     * Gets the createdAt value for this Rating.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this Rating.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the deletedAt value for this Rating.
     * 
     * @return deletedAt
     */
    public long getDeletedAt() {
        return deletedAt;
    }


    /**
     * Sets the deletedAt value for this Rating.
     * 
     * @param deletedAt
     */
    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }


    /**
     * Gets the id value for this Rating.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Rating.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the member value for this Rating.
     * 
     * @return member
     */
    public service12.Member getMember() {
        return member;
    }


    /**
     * Sets the member value for this Rating.
     * 
     * @param member
     */
    public void setMember(service12.Member member) {
        this.member = member;
    }


    /**
     * Gets the pid value for this Rating.
     * 
     * @return pid
     */
    public long getPid() {
        return pid;
    }


    /**
     * Sets the pid value for this Rating.
     * 
     * @param pid
     */
    public void setPid(long pid) {
        this.pid = pid;
    }


    /**
     * Gets the place value for this Rating.
     * 
     * @return place
     */
    public service12.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this Rating.
     * 
     * @param place
     */
    public void setPlace(service12.Place place) {
        this.place = place;
    }


    /**
     * Gets the updatedAt value for this Rating.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this Rating.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * Gets the value value for this Rating.
     * 
     * @return value
     */
    public int getValue() {
        return value;
    }


    /**
     * Sets the value value for this Rating.
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rating)) return false;
        Rating other = (Rating) obj;
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
            ((this.member==null && other.getMember()==null) || 
             (this.member!=null &&
              this.member.equals(other.getMember()))) &&
            this.pid == other.getPid() &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            this.updatedAt == other.getUpdatedAt() &&
            this.value == other.getValue();
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
        if (getMember() != null) {
            _hashCode += getMember().hashCode();
        }
        _hashCode += new Long(getPid()).hashCode();
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        _hashCode += new Long(getUpdatedAt()).hashCode();
        _hashCode += getValue();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rating.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example/", "rating"));
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
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "member"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "place"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
