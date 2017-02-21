package com.boyle.matt.Auction.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boyle.matt.Auction.Domain.Seller;

@FeignClient("seller")
public interface SellerClient {

	@RequestMapping("/{id}")
	public Seller findSeller(@PathVariable("id") long id);

}
