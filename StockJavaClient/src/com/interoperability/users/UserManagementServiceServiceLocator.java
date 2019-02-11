/**
 * UserManagementServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.interoperability.users;

public class UserManagementServiceServiceLocator extends org.apache.axis.client.Service implements com.interoperability.users.UserManagementServiceService {

    public UserManagementServiceServiceLocator() {
    }


    public UserManagementServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserManagementServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserManagementServicePort
    private java.lang.String UserManagementServicePort_address = "http://localhost:8080/aInteroperabilityProjectbc/UserManagementService";

    public java.lang.String getUserManagementServicePortAddress() {
        return UserManagementServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserManagementServicePortWSDDServiceName = "UserManagementServicePort";

    public java.lang.String getUserManagementServicePortWSDDServiceName() {
        return UserManagementServicePortWSDDServiceName;
    }

    public void setUserManagementServicePortWSDDServiceName(java.lang.String name) {
        UserManagementServicePortWSDDServiceName = name;
    }

    public com.interoperability.users.UserManagementService getUserManagementServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserManagementServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserManagementServicePort(endpoint);
    }

    public com.interoperability.users.UserManagementService getUserManagementServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.interoperability.users.UserManagementServiceServiceSoapBindingStub _stub = new com.interoperability.users.UserManagementServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserManagementServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserManagementServicePortEndpointAddress(java.lang.String address) {
        UserManagementServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.interoperability.users.UserManagementService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.interoperability.users.UserManagementServiceServiceSoapBindingStub _stub = new com.interoperability.users.UserManagementServiceServiceSoapBindingStub(new java.net.URL(UserManagementServicePort_address), this);
                _stub.setPortName(getUserManagementServicePortWSDDServiceName());
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
        if ("UserManagementServicePort".equals(inputPortName)) {
            return getUserManagementServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://users.interoperability.com/", "UserManagementServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://users.interoperability.com/", "UserManagementServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserManagementServicePort".equals(portName)) {
            setUserManagementServicePortEndpointAddress(address);
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
