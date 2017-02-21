package com.boyle.matt.Auction.Domain;

public class SellingDetails {

	private Long auctionId;
	private Seller seller;
	private Car car;

	public SellingDetails() {

	}

	public SellingDetails(Long auctionId, Seller seller, Car car) {
		this.auctionId = auctionId;
		this.seller = seller;
		this.car = car;
	}

	public SellingDetails(Selling selling) {
		this.auctionId = selling.getId();

	}

	public Long getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
