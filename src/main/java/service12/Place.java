/**
 * Place.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service12;

public class Place  implements java.io.Serializable {
    private service12.City city;

    private service12.Comment[] comments;

    private long createdAt;

    private long deletedAt;

    private java.lang.String description;

    private service12.District district;

    private long id;

    private java.lang.String images;

    private service12.Member member;

    private java.lang.String name;

    private int point;

    private service12.Rating[] ratingList;

    private int status;

    private long updatedAt;

    public Place() {
    }

    public Place(
           service12.City city,
           service12.Comment[] comments,
           long createdAt,
           long deletedAt,
           java.lang.String description,
           service12.District district,
           long id,
           java.lang.String images,
           service12.Member member,
           java.lang.String name,
           int point,
           service12.Rating[] ratingList,
           int status,
           long updatedAt) {
           this.city = city;
           this.comments = comments;
           this.createdAt = createdAt;
           this.deletedAt = deletedAt;
           this.description = description;
           this.district = district;
           this.id = id;
           this.images = images;
           this.member = member;
           this.name = name;
           this.point = point;
           this.ratingList = ratingList;
           this.status = status;
           this.updatedAt = updatedAt;
    }


    /**
     * Gets the city value for this Place.
     * 
     * @return city
     */
    public service12.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this Place.
     * 
     * @param city
     */
    public void setCity(service12.City city) {
        this.city = city;
    }


    /**
     * Gets the comments value for this Place.
     * 
     * @return comments
     */
    public service12.Comment[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Place.
     * 
     * @param comments
     */
    public void setComments(service12.Comment[] comments) {
        this.comments = comments;
    }

    public service12.Comment getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, service12.Comment _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the createdAt value for this Place.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this Place.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the deletedAt value for this Place.
     * 
     * @return deletedAt
     */
    public long getDeletedAt() {
        return deletedAt;
    }


    /**
     * Sets the deletedAt value for this Place.
     * 
     * @param deletedAt
     */
    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }


    /**
     * Gets the description value for this Place.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Place.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the district value for this Place.
     * 
     * @return district
     */
    public service12.District getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this Place.
     * 
     * @param district
     */
    public void setDistrict(service12.District district) {
        this.district = district;
    }


    /**
     * Gets the id value for this Place.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Place.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the images value for this Place.
     * 
     * @return images
     */
    public java.lang.String getImages() {
        return images;
    }


    /**
     * Sets the images value for this Place.
     * 
     * @param images
     */
    public void setImages(java.lang.String images) {
        this.images = images;
    }


    /**
     * Gets the member value for this Place.
     * 
     * @return member
     */
    public service12.Member getMember() {
        return member;
    }


    /**
     * Sets the member value for this Place.
     * 
     * @param member
     */
    public void setMember(service12.Member member) {
        this.member = member;
    }


    /**
     * Gets the name value for this Place.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Place.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the point value for this Place.
     * 
     * @return point
     */
    public int getPoint() {
        return point;
    }


    /**
     * Sets the point value for this Place.
     * 
     * @param point
     */
    public void setPoint(int point) {
        this.point = point;
    }


    /**
     * Gets the ratingList value for this Place.
     * 
     * @return ratingList
     */
    public service12.Rating[] getRatingList() {
        return ratingList;
    }


    /**
     * Sets the ratingList value for this Place.
     * 
     * @param ratingList
     */
    public void setRatingList(service12.Rating[] ratingList) {
        this.ratingList = ratingList;
    }

    public service12.Rating getRatingList(int i) {
        return this.ratingList[i];
    }

    public void setRatingList(int i, service12.Rating _value) {
        this.ratingList[i] = _value;
    }


    /**
     * Gets the status value for this Place.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Place.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the updatedAt value for this Place.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this Place.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Place)) return false;
        Place other = (Place) obj;
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
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
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
            ((this.member==null && other.getMember()==null) || 
             (this.member!=null &&
              this.member.equals(other.getMember()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.point == other.getPoint() &&
            ((this.ratingList==null && other.getRatingList()==null) || 
             (this.ratingList!=null &&
              java.util.Arrays.equals(this.ratingList, other.getRatingList()))) &&
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
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getMember() != null) {
            _hashCode += getMember().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getPoint();
        if (getRatingList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatingList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatingList(), i);
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
        new org.apache.axis.description.TypeDesc(Place.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example/", "place"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "city"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "member"));
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
        elemField.setFieldName("ratingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "rating"));
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
