/**
 * StockManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.interoperability.stocks;

public interface StockManagement extends java.rmi.Remote {
    public com.interoperability.stocks.Stock[] findAllStocks() throws java.rmi.RemoteException;
    public com.interoperability.stocks.Stock getStock(java.lang.String arg0) throws java.rmi.RemoteException;
}
