package com.ltim.tradeEnquiry.repository;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TradeCompositeKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "ghss_trade_id")
	private String ghssTradeId;

	@Column(name = "trade_date")
	private Date tradeDate;

	@Column(name = "exchange_ref_id")
	private String exchangeRefId;

	public String getGhssTradeId() {
		return ghssTradeId;
	}

	public void setGhssTradeId(String ghssTradeId) {
		this.ghssTradeId = ghssTradeId;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getExchangeRefId() {
		return exchangeRefId;
	}

	public void setExchangeRefId(String exchangeRefId) {
		this.exchangeRefId = exchangeRefId;
	}

	@Override
	public String toString() {
		return "TradeCompositeKey [ghssTradeId=" + ghssTradeId + ", tradeDate=" + tradeDate + ", exchangeRefId="
				+ exchangeRefId + "]";
	}

}