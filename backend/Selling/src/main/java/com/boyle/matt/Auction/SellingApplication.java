package com.boyle.matt.Auction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.boyle.matt.Auction.Domain.Selling;
import com.boyle.matt.Auction.dao.SellingDao;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SellingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellingApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SellingDao sellingDao) {
		return args -> {
			sellingDao.save(new Selling(1L, 1L, 1L));
			sellingDao.save(new Selling(2L, 1L, 2L));
			sellingDao.save(new Selling(3L, 1L, 3L));
			sellingDao.save(new Selling(4L, 2L, 4L));
			sellingDao.save(new Selling(5L, 3L, 5L));
			sellingDao.save(new Selling(6L, 2L, 6L));




		};
	}
}
