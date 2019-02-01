package com.interoperability.stocks.client;

import java.rmi.RemoteException;
import java.util.Arrays;

public class StockManagementProxy implements com.interoperability.stocks.client.StockManagementClientInterface {
  private String _endpoint = null;
  private com.interoperability.stocks.client.StockManagementClientInterface stockManagement = null;
  
  public StockManagementProxy() {
    _initStockManagementProxy();
  }
  
  public StockManagementProxy(String endpoint) {
    _endpoint = endpoint;
    _initStockManagementProxy();
  }
  
  private void _initStockManagementProxy() {
    try {
      stockManagement = (new com.interoperability.stocks.client.StockManagementServiceLocator()).getStockManagementPort();
      if (stockManagement != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stockManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stockManagement)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stockManagement != null)
      ((javax.xml.rpc.Stub)stockManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.interoperability.stocks.client.StockManagementClientInterface getStockManagement() {
    if (stockManagement == null)
      _initStockManagementProxy();
    return stockManagement;
  }
  
  public com.interoperability.stocks.client.Stock[] findAllStocks() throws java.rmi.RemoteException{
    if (stockManagement == null)
      _initStockManagementProxy();
    return stockManagement.findAllStocks();
  }
  
  public static void main(String [] args) throws RemoteException {
	  System.out.println(Arrays.toString(new StockManagementProxy().findAllStocks()));
  }
}