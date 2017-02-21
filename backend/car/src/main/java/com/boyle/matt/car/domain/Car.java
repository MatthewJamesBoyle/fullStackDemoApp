package com.boyle.matt.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String carBrand;
	@Column
	private String carModel;
	@Column
	private String carReg;
	@Column
	private String price;
	@Column
	private int year;
	@Column
	private String imageUrl;

	private Car() {
	}

	public Long getId() {
		return id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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

	public Car(Long id, String carBrand, String carModel, String carReg, String price, int year, String imageUrl) {
		this.id = id;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carReg = carReg;
		this.price = price;
		this.year = year;
		this.imageUrl = imageUrl;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
