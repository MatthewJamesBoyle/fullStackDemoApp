package com.boyle.matt.Auction.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boyle.matt.Auction.Domain.Car;
import com.boyle.matt.Auction.Domain.Seller;
import com.boyle.matt.Auction.Domain.Selling;
import com.boyle.matt.Auction.Domain.SellingDetails;

public interface SellingDao extends JpaRepository<Selling, Long> {

	public List<Car> findByCarId(Long carId);

	public List<Seller> findBySellerId(Long sellerId);

}
