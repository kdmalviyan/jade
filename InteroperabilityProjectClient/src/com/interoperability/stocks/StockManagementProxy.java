package com.interoperability.stocks;

public class StockManagementProxy implements com.interoperability.stocks.StockManagement {
  private String _endpoint = null;
  private com.interoperability.stocks.StockManagement stockManagement = null;
  
  public StockManagementProxy() {
    _initStockManagementProxy();
  }
  
  public StockManagementProxy(String endpoint) {
    _endpoint = endpoint;
    _initStockManagementProxy();
  }
  
  private void _initStockManagementProxy() {
    try {
      stockManagement = (new com.interoperability.stocks.StockManagementServiceLocator()).getStockManagementPort();
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
  
  public com.interoperability.stocks.StockManagement getStockManagement() {
    if (stockManagement == null)
      _initStockManagementProxy();
    return stockManagement;
  }
  
  public com.interoperability.stocks.Stock[] findAllStocks() throws java.rmi.RemoteException{
    if (stockManagement == null)
      _initStockManagementProxy();
    return stockManagement.findAllStocks();
  }
  
  public com.interoperability.stocks.Stock getStock(java.lang.String arg0) throws java.rmi.RemoteException{
    if (stockManagement == null)
      _initStockManagementProxy();
    return stockManagement.getStock(arg0);
  }
  
  
}