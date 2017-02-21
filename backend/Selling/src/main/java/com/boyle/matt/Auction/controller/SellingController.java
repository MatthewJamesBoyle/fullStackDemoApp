package com.boyle.matt.Auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boyle.matt.Auction.Domain.Car;
import com.boyle.matt.Auction.Domain.Seller;
import com.boyle.matt.Auction.Domain.Selling;
import com.boyle.matt.Auction.Domain.SellingDetails;
import com.boyle.matt.Auction.dao.SellingDao;
import com.boyle.matt.Auction.service.SellingService;

@RestController
public class SellingController {

	@Autowired
	private SellingDao sellingDao;
	@Autowired
	private SellingService sellingService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<SellingDetails> getallSelling(Long Id) {
		return sellingService.getAllCarsForSale();
	}

	@RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
	public List<Car> getSellingByCarId(@PathVariable Long id) {
		return sellingDao.findByCarId(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public List<SellingDetails> getSellingBySellerId(@PathVariable Long id) {
		return sellingService.getAllCarsForSaleById(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Selling addAuction(@RequestBody Selling toAdd) {
		return sellingDao.save(toAdd);
	}

}
