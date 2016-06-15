/**
 * HelloResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.orcsoft.services;

public class HelloResponse  implements java.io.Serializable {
    private th.co.orcsoft.services.HelloResponseHeader helloResponseHeader;

    private java.lang.String helloText;

    public HelloResponse() {
    }

    public HelloResponse(
           th.co.orcsoft.services.HelloResponseHeader helloResponseHeader,
           java.lang.String helloText) {
           this.helloResponseHeader = helloResponseHeader;
           this.helloText = helloText;
    }


    /**
     * Gets the helloResponseHeader value for this HelloResponse.
     * 
     * @return helloResponseHeader
     */
    public th.co.orcsoft.services.HelloResponseHeader getHelloResponseHeader() {
        return helloResponseHeader;
    }


    /**
     * Sets the helloResponseHeader value for this HelloResponse.
     * 
     * @param helloResponseHeader
     */
    public void setHelloResponseHeader(th.co.orcsoft.services.HelloResponseHeader helloResponseHeader) {
        this.helloResponseHeader = helloResponseHeader;
    }


    /**
     * Gets the helloText value for this HelloResponse.
     * 
     * @return helloText
     */
    public java.lang.String getHelloText() {
        return helloText;
    }


    /**
     * Sets the helloText value for this HelloResponse.
     * 
     * @param helloText
     */
    public void setHelloText(java.lang.String helloText) {
        this.helloText = helloText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HelloResponse)) return false;
        HelloResponse other = (HelloResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.helloResponseHeader==null && other.getHelloResponseHeader()==null) || 
             (this.helloResponseHeader!=null &&
              this.helloResponseHeader.equals(other.getHelloResponseHeader()))) &&
            ((this.helloText==null && other.getHelloText()==null) || 
             (this.helloText!=null &&
              this.helloText.equals(other.getHelloText())));
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
        if (getHelloResponseHeader() != null) {
            _hashCode += getHelloResponseHeader().hashCode();
        }
        if (getHelloText() != null) {
            _hashCode += getHelloText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HelloResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.orcsoft.co.th/", "helloResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helloResponseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HelloResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.orcsoft.co.th/", "helloResponseHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helloText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HelloText"));
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
