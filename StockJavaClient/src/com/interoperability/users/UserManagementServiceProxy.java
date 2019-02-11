package com.interoperability.users;

public class UserManagementServiceProxy implements com.interoperability.users.UserManagementService {
  private String _endpoint = null;
  private com.interoperability.users.UserManagementService userManagementService = null;
  
  public UserManagementServiceProxy() {
    _initUserManagementServiceProxy();
  }
  
  public UserManagementServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserManagementServiceProxy();
  }
  
  private void _initUserManagementServiceProxy() {
    try {
      userManagementService = (new com.interoperability.users.UserManagementServiceServiceLocator()).getUserManagementServicePort();
      if (userManagementService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userManagementService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userManagementService != null)
      ((javax.xml.rpc.Stub)userManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.interoperability.users.UserManagementService getUserManagementService() {
    if (userManagementService == null)
      _initUserManagementServiceProxy();
    return userManagementService;
  }
  
  public com.interoperability.users.User register(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (userManagementService == null)
      _initUserManagementServiceProxy();
    return userManagementService.register(username, password);
  }
  
  public boolean removeStock(long stockId, java.lang.String username) throws java.rmi.RemoteException{
    if (userManagementService == null)
      _initUserManagementServiceProxy();
    return userManagementService.removeStock(stockId, username);
  }
  
  public com.interoperability.users.User login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (userManagementService == null)
      _initUserManagementServiceProxy();
    return userManagementService.login(username, password);
  }
  
  public boolean addStock(com.interoperability.users.Stock stock, java.lang.String username) throws java.rmi.RemoteException{
    if (userManagementService == null)
      _initUserManagementServiceProxy();
    return userManagementService.addStock(stock, username);
  }
  
  
}