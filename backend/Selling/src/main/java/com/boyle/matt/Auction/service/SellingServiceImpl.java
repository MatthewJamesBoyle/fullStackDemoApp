package com.boyle.matt.Auction.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyle.matt.Auction.Domain.Selling;
import com.boyle.matt.Auction.Domain.SellingDetails;
import com.boyle.matt.Auction.dao.SellingDao;

@Service
public class SellingServiceImpl implements SellingService {

	@Autowired
	private SellingDao sellingDao;
	@Autowired
	private SellerClient sellerClient;
	@Autowired
	private CarClient carClient;

	@Override
	public List<SellingDetails> getAllCarsForSaleById(long id) {
		List<Selling> sellingList = sellingDao.findAll();
		if (sellingList == null) {
			return null;
		}
		List<SellingDetails> toReturn = new ArrayList<SellingDetails>();
		for (Selling s : sellingList) {
			if (s.getSellerId() != id) {
				continue;
			} else {
				SellingDetails sellingDetail = new SellingDetails(s);
				sellingDetail.setSeller(sellerClient.findSeller(s.getSellerId()));
				sellingDetail.setCar(carClient.findCar(s.getCarId()));
				toReturn.add(sellingDetail);
			}
		}
		return toReturn;

	}

	@Override
	public List<SellingDetails> getAllCarsForSale() {
		List<Selling> sellingList = sellingDao.findAll();

		List<SellingDetails> toReturn = new ArrayList<SellingDetails>();
		for (Selling s : sellingList) {

			SellingDetails sellingDetail = new SellingDetails(s);
			sellingDetail.setSeller(sellerClient.findSeller(s.getSellerId()));
			sellingDetail.setCar(carClient.findCar(s.getCarId()));
			toReturn.add(sellingDetail);

		}
		return toReturn;

	}

}
