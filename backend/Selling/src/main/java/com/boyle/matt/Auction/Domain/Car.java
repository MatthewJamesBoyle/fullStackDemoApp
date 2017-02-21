package com.boyle.matt.Auction.Domain;

public class Car {

	private Long id;
	private String carBrand;
	private String carModel;
	private String carReg;
	private String price;
	private int year;
	private String imageUrl;

	public Car() {
	}

	public Car(Long id, String carBrand, String carModel, String carReg, String price, int year, String imageUrl) {
		this.id = id;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carReg = carReg;
		this.price = price;
		this.year = year;
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarReg() {
		return carReg;
	}

	public void setCarReg(String carReg) {
		this.carReg = carReg;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
