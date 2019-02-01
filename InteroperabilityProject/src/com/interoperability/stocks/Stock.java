package com.interoperability.stocks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Stock {
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String symbol;
	private String security;
	private float previousClosePrice;
	private float openPrice;
	private float highPrice;
	private float closePrice;
	private double netTradeVaule;
	private long netTradeQuantity;
	private float high52Week;
	private float low52Week;

	public float getLow52Week() {
		return low52Week;
	}

	public void setLow52Week(float low52Week) {
		this.low52Week = low52Week;
	}

	public Stock() {
	}

	public Stock(String security) {
		this.security = security;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public float getPreviousClosePrice() {
		return previousClosePrice;
	}

	public void setPreviousClosePrice(float previousClosePrice) {
		this.previousClosePrice = previousClosePrice;
	}

	public float getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(float openPrice) {
		this.openPrice = openPrice;
	}

	public float getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(float highPrice) {
		this.highPrice = highPrice;
	}

	public float getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(float closePrice) {
		this.closePrice = closePrice;
	}

	public double getNetTradeVaule() {
		return netTradeVaule;
	}

	public void setNetTradeVaule(double netTradeVaule) {
		this.netTradeVaule = netTradeVaule;
	}

	public long getNetTradeQuantity() {
		return netTradeQuantity;
	}

	public void setNetTradeQuantity(long netTradeQuantity) {
		this.netTradeQuantity = netTradeQuantity;
	}

	public float getHigh52Week() {
		return high52Week;
	}

	public void setHigh52Week(float high52Week) {
		this.high52Week = high52Week;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((security == null) ? 0 : security.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (security == null) {
			if (other.security != null)
				return false;
		} else if (!security.equals(other.security))
			return false;
		return true;
	}

}
