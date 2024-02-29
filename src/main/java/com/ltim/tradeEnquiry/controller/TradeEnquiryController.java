package com.ltim.tradeEnquiry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.tradeEnquiry.dto.TradeResponse;
import com.ltim.tradeEnquiry.service.TradeEnquiryService;

@RestController
@RequestMapping("/trades")
public class TradeEnquiryController {

	Logger log = LoggerFactory.getLogger(TradeEnquiryController.class);

	private TradeEnquiryService tradeEnquiryService;

	@Autowired
	public TradeEnquiryController(TradeEnquiryService tradeEnquiryService) {
		this.tradeEnquiryService = tradeEnquiryService;
	}

	public TradeEnquiryController() {
		super();
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TradeResponse> retrieveTrades() {
		log.info("retrieving trade list ");
		TradeResponse tradeList = tradeEnquiryService.retrieveTrades();

		log.info("trade List retrieved successfully");
		return new ResponseEntity<TradeResponse>(tradeList, HttpStatus.OK);
	}

}
