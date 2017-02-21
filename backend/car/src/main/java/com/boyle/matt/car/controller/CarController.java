package com.boyle.matt.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boyle.matt.car.dao.CarDao;
import com.boyle.matt.car.domain.Car;
import com.boyle.matt.car.service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarDao carDao;
	private CarService carService;

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greetings() {
		return "Hello Friend";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Car> allCars() {
		return carDao.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Car getCarDetail(@PathVariable long id) {
		return carDao.findOne(id);
	}

}
