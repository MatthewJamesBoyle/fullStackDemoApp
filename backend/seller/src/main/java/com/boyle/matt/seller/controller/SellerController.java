package com.boyle.matt.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boyle.matt.seller.dao.SellerDao;
import com.boyle.matt.seller.domain.Seller;

@RestController
public class SellerController {

	@Autowired
	SellerDao sellerDao;

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greetings() {
		return "This is a test hit";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Seller> getAllSellers() {
		return sellerDao.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Seller getSellerDetail(@PathVariable long id) {
		return sellerDao.findOne(id);
	}
}
