package com.interoperability.stocks;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class StockManagement {
	StocksRepository stocksRepository;

	public StockManagement() {
		this.stocksRepository = new StocksRepository();
	}

	@WebMethod(operationName = "findAllStocks")
	public List<Stock> getAllStocks() {
		return stocksRepository.getAllStocks();
	}

	@WebMethod(operationName = "getStock")
	public Stock getStockBySecurity(String security) {
		Stock stock = this.stocksRepository.findStockBySecurity(security);
		return stock;
	}
}
