package com.interoperability.stocks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.interoperability.db.DBConnectionManager;

public class StocksRepository {
	public List<Stock> getAllStocks() {
		List<Stock> stocks = new ArrayList<Stock>();
		String query = "SELECT * from stocks";
		try (Connection connection = DBConnectionManager.getConnection();) {
			PreparedStatement preparedStatement = DBConnectionManager.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Stock stock = new Stock();
				stock.setId(resultSet.getLong("id"));
				String symbol = resultSet.getString("SYMBOL");
				stock.setSymbol(symbol);
				String security = resultSet.getString("SECURITY");
				stock.setSecurity(security);
				float previousClosePrice = resultSet.getFloat("PREV_CL_PR");
				stock.setPreviousClosePrice(previousClosePrice);
				float openPrice = resultSet.getFloat("OPEN_PRICE");
				stock.setOpenPrice(openPrice);
				float highPrice = resultSet.getFloat("HIGH_PRICE");
				stock.setHighPrice(highPrice);
				float closePrice = resultSet.getFloat("CLOSE_PRICE");
				stock.setClosePrice(closePrice);
				double netTradeVaule = resultSet.getDouble("NET_TRDVAL");
				stock.setNetTradeVaule(netTradeVaule);
				long netTradeQuantity = resultSet.getLong("NET_TRDQTY");
				stock.setNetTradeQuantity(netTradeQuantity);
				float high52Week = resultSet.getFloat("HI_52_WK");
				stock.setHigh52Week(high52Week);
				float low52Week = resultSet.getFloat("LO_52_WK");
				stock.setLow52Week(low52Week);
				stocks.add(stock);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return stocks;
	}

	public Stock findStockBySecurity(String security) {
		return this.getAllStocks().stream().filter(stock -> stock.getSecurity().equals(security)).findFirst()
				.orElse(null);
	}
}
