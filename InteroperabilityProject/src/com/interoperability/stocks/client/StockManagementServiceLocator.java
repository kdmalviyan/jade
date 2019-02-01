/**
 * StockManagementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.interoperability.stocks.client;

public class StockManagementServiceLocator extends org.apache.axis.client.Service implements com.interoperability.stocks.client.StockManagementService {

    public StockManagementServiceLocator() {
    }


    public StockManagementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StockManagementServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StockManagementPort
    private java.lang.String StockManagementPort_address = "http://localhost:8080/InteroperabilityProject/StockManagement";

    public java.lang.String getStockManagementPortAddress() {
        return StockManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StockManagementPortWSDDServiceName = "StockManagementPort";

    public java.lang.String getStockManagementPortWSDDServiceName() {
        return StockManagementPortWSDDServiceName;
    }

    public void setStockManagementPortWSDDServiceName(java.lang.String name) {
        StockManagementPortWSDDServiceName = name;
    }

    public com.interoperability.stocks.client.StockManagementClientInterface getStockManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StockManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStockManagementPort(endpoint);
    }

    public com.interoperability.stocks.client.StockManagementClientInterface getStockManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.interoperability.stocks.client.StockManagementServiceSoapBindingStub _stub = new com.interoperability.stocks.client.StockManagementServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getStockManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStockManagementPortEndpointAddress(java.lang.String address) {
        StockManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.interoperability.stocks.client.StockManagementClientInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.interoperability.stocks.client.StockManagementServiceSoapBindingStub _stub = new com.interoperability.stocks.client.StockManagementServiceSoapBindingStub(new java.net.URL(StockManagementPort_address), this);
                _stub.setPortName(getStockManagementPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StockManagementPort".equals(inputPortName)) {
            return getStockManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://stocks.interoperability.com/", "StockManagementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://stocks.interoperability.com/", "StockManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StockManagementPort".equals(portName)) {
            setStockManagementPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
