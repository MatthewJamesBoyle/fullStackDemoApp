package com.boyle.matt.Auction.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boyle.matt.Auction.Domain.Car;

@FeignClient("car")
public interface CarClient {

	@RequestMapping("/{id}")
	public Car findCar(@PathVariable("id") long id);

}
