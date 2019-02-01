/**
 * StockManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.interoperability.stocks.client;

public interface StockManagementService extends javax.xml.rpc.Service {
    public java.lang.String getStockManagementPortAddress();

    public com.interoperability.stocks.client.StockManagementClientInterface getStockManagementPort() throws javax.xml.rpc.ServiceException;

    public com.interoperability.stocks.client.StockManagementClientInterface getStockManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
