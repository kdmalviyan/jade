/**
 * UserManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.interoperability.users;

public interface UserManagementService extends java.rmi.Remote {
    public com.interoperability.users.User register(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public boolean removeStock(long stockId, java.lang.String username) throws java.rmi.RemoteException;
    public com.interoperability.users.User login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public boolean addStock(com.interoperability.users.Stock stock, java.lang.String username) throws java.rmi.RemoteException;
}
