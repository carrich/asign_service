/**
 * PlaceDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service12;

public class PlaceDTO  implements java.io.Serializable {
    private service12.City city;

    private long createdAt;

    private long deletedAt;

    private java.lang.String description;

    private service12.District district;

    private long id;

    private java.lang.String images;

    private java.lang.String name;

    private int point;

    private int status;

    private long updatedAt;

    public PlaceDTO() {
    }

    public PlaceDTO(
           service12.City city,
           long createdAt,
           long deletedAt,
           java.lang.String description,
           service12.District district,
           long id,
           java.lang.String images,
           java.lang.String name,
           int point,
           int status,
           long updatedAt) {
           this.city = city;
           this.createdAt = createdAt;
           this.deletedAt = deletedAt;
           this.description = description;
           this.district = district;
           this.id = id;
           this.images = images;
           this.name = name;
           this.point = point;
           this.status = status;
           this.updatedAt = updatedAt;
    }


    /**
     * Gets the city value for this PlaceDTO.
     * 
     * @return city
     */
    public service12.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this PlaceDTO.
     * 
     * @param city
     */
    public void setCity(service12.City city) {
        this.city = city;
    }


    /**
     * Gets the createdAt value for this PlaceDTO.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this PlaceDTO.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the deletedAt value for this PlaceDTO.
     * 
     * @return deletedAt
     */
    public long getDeletedAt() {
        return deletedAt;
    }


    /**
     * Sets the deletedAt value for this PlaceDTO.
     * 
     * @param deletedAt
     */
    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }


    /**
     * Gets the description value for this PlaceDTO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PlaceDTO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the district value for this PlaceDTO.
     * 
     * @return district
     */
    public service12.District getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this PlaceDTO.
     * 
     * @param district
     */
    public void setDistrict(service12.District district) {
        this.district = district;
    }


    /**
     * Gets the id value for this PlaceDTO.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this PlaceDTO.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the images value for this PlaceDTO.
     * 
     * @return images
     */
    public java.lang.String getImages() {
        return images;
    }


    /**
     * Sets the images value for this PlaceDTO.
     * 
     * @param images
     */
    public void setImages(java.lang.String images) {
        this.images = images;
    }


    /**
     * Gets the name value for this PlaceDTO.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PlaceDTO.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the point value for this PlaceDTO.
     * 
     * @return point
     */
    public int getPoint() {
        return point;
    }


    /**
     * Sets the point value for this PlaceDTO.
     * 
     * @param point
     */
    public void setPoint(int point) {
        this.point = point;
    }


    /**
     * Gets the status value for this PlaceDTO.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PlaceDTO.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the updatedAt value for this PlaceDTO.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this PlaceDTO.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceDTO)) return false;
        PlaceDTO other = (PlaceDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            this.createdAt == other.getCreatedAt() &&
            this.deletedAt == other.getDeletedAt() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            this.id == other.getId() &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              this.images.equals(other.getImages()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.point == other.getPoint() &&
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        _hashCode += new Long(getCreatedAt()).hashCode();
        _hashCode += new Long(getDeletedAt()).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getImages() != null) {
            _hashCode += getImages().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getPoint();
        _hashCode += getStatus();
        _hashCode += new Long(getUpdatedAt()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example/", "placeDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "city"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "district"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("", "images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
