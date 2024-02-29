package com.ltim.tradeEnquiry.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ltim.tradeEnquiry.repository.TradeCompositeKey;

@Entity
@Table(name = "trade")
public class Trade {

	@EmbeddedId
	private TradeCompositeKey tradeCompositeKey;

	@Column(name = "quantity")
	private Integer quantity;

	public TradeCompositeKey getTradeCompositeKey() {
		return tradeCompositeKey;
	}

	public void setTradeCompositeKey(TradeCompositeKey tradeCompositeKey) {
		this.tradeCompositeKey = tradeCompositeKey;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Trade [tradeCompositeKey=" + tradeCompositeKey + ", quantity=" + quantity + "]";
	}

}
