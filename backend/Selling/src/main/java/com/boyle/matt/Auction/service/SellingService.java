package com.boyle.matt.Auction.service;

import java.util.List;

import com.boyle.matt.Auction.Domain.SellingDetails;

public interface SellingService {

	List<SellingDetails> getAllCarsForSaleById(long id);

	List<SellingDetails> getAllCarsForSale();

}
