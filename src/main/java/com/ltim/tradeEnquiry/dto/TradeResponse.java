package com.ltim.tradeEnquiry.dto;

import java.util.List;

public class TradeResponse {

	private List<TradeDTO> tradeList;

	public List<TradeDTO> getTradeList() {
		return tradeList;
	}

	public void setTradeList(List<TradeDTO> tradeList) {
		this.tradeList = tradeList;
	}

	@Override
	public String toString() {
		return "TradeResponse [tradeList=" + tradeList + "]";
	}

}
