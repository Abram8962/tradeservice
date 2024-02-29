package com.ltim.tradeEnquiry.util;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ltim.tradeEnquiry.dto.TradeDTO;
import com.ltim.tradeEnquiry.entity.Trade;

@Component
public class ConverterUtil {

	private ModelMapper modelMapper = new ModelMapper();

	public TradeDTO convertToDto(Trade trade) {
		TradeDTO tradeDTO = modelMapper.map(trade, TradeDTO.class);
		return tradeDTO;
	}

	public Trade convertToEntity(TradeDTO tradeDTO) throws ParseException {
		Trade trade = modelMapper.map(tradeDTO, Trade.class);
		return trade;
	}
}
