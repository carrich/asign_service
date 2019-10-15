/**
 * Member.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service12;

public class Member  implements java.io.Serializable {
    private service12.Comment[] comments;

    private long createdAt;

    private long deletedAt;

    private int gender;

    private long id;

    private java.lang.String name;

    private java.lang.String password;

    private service12.Place[] places;

    private service12.Rating rating;

    private int role;

    private int status;

    private long updatedAt;

    private java.lang.String username;

    public Member() {
    }

    public Member(
           service12.Comment[] comments,
           long createdAt,
           long deletedAt,
           int gender,
           long id,
           java.lang.String name,
           java.lang.String password,
           service12.Place[] places,
           service12.Rating rating,
           int role,
           int status,
           long updatedAt,
           java.lang.String username) {
           this.comments = comments;
           this.createdAt = createdAt;
           this.deletedAt = deletedAt;
           this.gender = gender;
           this.id = id;
           this.name = name;
           this.password = password;
           this.places = places;
           this.rating = rating;
           this.role = role;
           this.status = status;
           this.updatedAt = updatedAt;
           this.username = username;
    }


    /**
     * Gets the comments value for this Member.
     * 
     * @return comments
     */
    public service12.Comment[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Member.
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
     * Gets the createdAt value for this Member.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this Member.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the deletedAt value for this Member.
     * 
     * @return deletedAt
     */
    public long getDeletedAt() {
        return deletedAt;
    }


    /**
     * Sets the deletedAt value for this Member.
     * 
     * @param deletedAt
     */
    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }


    /**
     * Gets the gender value for this Member.
     * 
     * @return gender
     */
    public int getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Member.
     * 
     * @param gender
     */
    public void setGender(int gender) {
        this.gender = gender;
    }


    /**
     * Gets the id value for this Member.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Member.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Member.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Member.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the password value for this Member.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Member.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the places value for this Member.
     * 
     * @return places
     */
    public service12.Place[] getPlaces() {
        return places;
    }


    /**
     * Sets the places value for this Member.
     * 
     * @param places
     */
    public void setPlaces(service12.Place[] places) {
        this.places = places;
    }

    public service12.Place getPlaces(int i) {
        return this.places[i];
    }

    public void setPlaces(int i, service12.Place _value) {
        this.places[i] = _value;
    }


    /**
     * Gets the rating value for this Member.
     * 
     * @return rating
     */
    public service12.Rating getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this Member.
     * 
     * @param rating
     */
    public void setRating(service12.Rating rating) {
        this.rating = rating;
    }


    /**
     * Gets the role value for this Member.
     * 
     * @return role
     */
    public int getRole() {
        return role;
    }


    /**
     * Sets the role value for this Member.
     * 
     * @param role
     */
    public void setRole(int role) {
        this.role = role;
    }


    /**
     * Gets the status value for this Member.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Member.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the updatedAt value for this Member.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this Member.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * Gets the username value for this Member.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Member.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Member)) return false;
        Member other = (Member) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            this.createdAt == other.getCreatedAt() &&
            this.deletedAt == other.getDeletedAt() &&
            this.gender == other.getGender() &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.places==null && other.getPlaces()==null) || 
             (this.places!=null &&
              java.util.Arrays.equals(this.places, other.getPlaces()))) &&
            ((this.rating==null && other.getRating()==null) || 
             (this.rating!=null &&
              this.rating.equals(other.getRating()))) &&
            this.role == other.getRole() &&
            this.status == other.getStatus() &&
            this.updatedAt == other.getUpdatedAt() &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        _hashCode += getGender();
        _hashCode += new Long(getId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
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
        if (getRating() != null) {
            _hashCode += getRating().hashCode();
        }
        _hashCode += getRole();
        _hashCode += getStatus();
        _hashCode += new Long(getUpdatedAt()).hashCode();
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Member.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example/", "member"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
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
        elemField.setFieldName("rating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "rating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
