package com.boyle.matt.seller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boyle.matt.seller.domain.Seller;

public interface SellerDao extends JpaRepository<Seller, Long> {

}
