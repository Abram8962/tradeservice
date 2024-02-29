package com.ltim.tradeEnquiry.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.tradeEnquiry.dto.TradeDTO;
import com.ltim.tradeEnquiry.dto.TradeResponse;
import com.ltim.tradeEnquiry.repository.TradeRepository;
import com.ltim.tradeEnquiry.util.ConverterUtil;

@Service
public class TradeEnquiryService {

	Logger log = LoggerFactory.getLogger(TradeEnquiryService.class);
	
	private TradeRepository tradeRepository;

	private ConverterUtil converterUtil;

	@Autowired
	public TradeEnquiryService(TradeRepository tradeRepository, ConverterUtil converterUtil) {
		this.tradeRepository = tradeRepository;
		this.converterUtil = converterUtil;
	}

	public TradeEnquiryService() {
		super();
	}

	public TradeResponse retrieveTrades() {
		log.info("retrieving trades");
		TradeResponse response = new TradeResponse();
		List<TradeDTO> tradeList = tradeRepository.findAllTrades().stream().map(trade -> converterUtil.convertToDto(trade))
				.collect(Collectors.toList());

		response.setTradeList(tradeList);
		
		log.info("retrived trades {}",response);
		return response;
	}

}
