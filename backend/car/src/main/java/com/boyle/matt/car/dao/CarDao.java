package com.boyle.matt.car.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boyle.matt.car.domain.Car;

public interface CarDao extends JpaRepository<Car,Long> {




}
