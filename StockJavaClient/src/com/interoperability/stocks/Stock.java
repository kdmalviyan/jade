/**
 * Stock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.interoperability.stocks;

public class Stock  implements java.io.Serializable {
    private long id;

    private java.lang.String symbol;

    private java.lang.String security;

    private float previousClosePrice;

    private float openPrice;

    private float highPrice;

    private float closePrice;

    private double netTradeVaule;

    private long netTradeQuantity;

    private float high52Week;

    private float low52Week;

    public Stock() {
    }

    public Stock(
           long id,
           java.lang.String symbol,
           java.lang.String security,
           float previousClosePrice,
           float openPrice,
           float highPrice,
           float closePrice,
           double netTradeVaule,
           long netTradeQuantity,
           float high52Week,
           float low52Week) {
           this.id = id;
           this.symbol = symbol;
           this.security = security;
           this.previousClosePrice = previousClosePrice;
           this.openPrice = openPrice;
           this.highPrice = highPrice;
           this.closePrice = closePrice;
           this.netTradeVaule = netTradeVaule;
           this.netTradeQuantity = netTradeQuantity;
           this.high52Week = high52Week;
           this.low52Week = low52Week;
    }


    /**
     * Gets the id value for this Stock.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Stock.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the symbol value for this Stock.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this Stock.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the security value for this Stock.
     * 
     * @return security
     */
    public java.lang.String getSecurity() {
        return security;
    }


    /**
     * Sets the security value for this Stock.
     * 
     * @param security
     */
    public void setSecurity(java.lang.String security) {
        this.security = security;
    }


    /**
     * Gets the previousClosePrice value for this Stock.
     * 
     * @return previousClosePrice
     */
    public float getPreviousClosePrice() {
        return previousClosePrice;
    }


    /**
     * Sets the previousClosePrice value for this Stock.
     * 
     * @param previousClosePrice
     */
    public void setPreviousClosePrice(float previousClosePrice) {
        this.previousClosePrice = previousClosePrice;
    }


    /**
     * Gets the openPrice value for this Stock.
     * 
     * @return openPrice
     */
    public float getOpenPrice() {
        return openPrice;
    }


    /**
     * Sets the openPrice value for this Stock.
     * 
     * @param openPrice
     */
    public void setOpenPrice(float openPrice) {
        this.openPrice = openPrice;
    }


    /**
     * Gets the highPrice value for this Stock.
     * 
     * @return highPrice
     */
    public float getHighPrice() {
        return highPrice;
    }


    /**
     * Sets the highPrice value for this Stock.
     * 
     * @param highPrice
     */
    public void setHighPrice(float highPrice) {
        this.highPrice = highPrice;
    }


    /**
     * Gets the closePrice value for this Stock.
     * 
     * @return closePrice
     */
    public float getClosePrice() {
        return closePrice;
    }


    /**
     * Sets the closePrice value for this Stock.
     * 
     * @param closePrice
     */
    public void setClosePrice(float closePrice) {
        this.closePrice = closePrice;
    }


    /**
     * Gets the netTradeVaule value for this Stock.
     * 
     * @return netTradeVaule
     */
    public double getNetTradeVaule() {
        return netTradeVaule;
    }


    /**
     * Sets the netTradeVaule value for this Stock.
     * 
     * @param netTradeVaule
     */
    public void setNetTradeVaule(double netTradeVaule) {
        this.netTradeVaule = netTradeVaule;
    }


    /**
     * Gets the netTradeQuantity value for this Stock.
     * 
     * @return netTradeQuantity
     */
    public long getNetTradeQuantity() {
        return netTradeQuantity;
    }


    /**
     * Sets the netTradeQuantity value for this Stock.
     * 
     * @param netTradeQuantity
     */
    public void setNetTradeQuantity(long netTradeQuantity) {
        this.netTradeQuantity = netTradeQuantity;
    }


    /**
     * Gets the high52Week value for this Stock.
     * 
     * @return high52Week
     */
    public float getHigh52Week() {
        return high52Week;
    }


    /**
     * Sets the high52Week value for this Stock.
     * 
     * @param high52Week
     */
    public void setHigh52Week(float high52Week) {
        this.high52Week = high52Week;
    }


    /**
     * Gets the low52Week value for this Stock.
     * 
     * @return low52Week
     */
    public float getLow52Week() {
        return low52Week;
    }


    /**
     * Sets the low52Week value for this Stock.
     * 
     * @param low52Week
     */
    public void setLow52Week(float low52Week) {
        this.low52Week = low52Week;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stock)) return false;
        Stock other = (Stock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.security==null && other.getSecurity()==null) || 
             (this.security!=null &&
              this.security.equals(other.getSecurity()))) &&
            this.previousClosePrice == other.getPreviousClosePrice() &&
            this.openPrice == other.getOpenPrice() &&
            this.highPrice == other.getHighPrice() &&
            this.closePrice == other.getClosePrice() &&
            this.netTradeVaule == other.getNetTradeVaule() &&
            this.netTradeQuantity == other.getNetTradeQuantity() &&
            this.high52Week == other.getHigh52Week() &&
            this.low52Week == other.getLow52Week();
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
        _hashCode += new Long(getId()).hashCode();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getSecurity() != null) {
            _hashCode += getSecurity().hashCode();
        }
        _hashCode += new Float(getPreviousClosePrice()).hashCode();
        _hashCode += new Float(getOpenPrice()).hashCode();
        _hashCode += new Float(getHighPrice()).hashCode();
        _hashCode += new Float(getClosePrice()).hashCode();
        _hashCode += new Double(getNetTradeVaule()).hashCode();
        _hashCode += new Long(getNetTradeQuantity()).hashCode();
        _hashCode += new Float(getHigh52Week()).hashCode();
        _hashCode += new Float(getLow52Week()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://stocks.interoperability.com/", "stock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security");
        elemField.setXmlName(new javax.xml.namespace.QName("", "security"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousClosePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "previousClosePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netTradeVaule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netTradeVaule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netTradeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netTradeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high52Week");
        elemField.setXmlName(new javax.xml.namespace.QName("", "high52Week"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low52Week");
        elemField.setXmlName(new javax.xml.namespace.QName("", "low52Week"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
