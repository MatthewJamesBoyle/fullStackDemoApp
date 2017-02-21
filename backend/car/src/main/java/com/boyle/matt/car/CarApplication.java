package com.boyle.matt.car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.boyle.matt.car.dao.CarDao;
import com.boyle.matt.car.domain.Car;

@SpringBootApplication
@EnableDiscoveryClient
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(CarDao carDao) {
		return args -> {
			carDao.save(new Car(1L, "Fiat", "Panda", "VO13 LLN", "6500", 2000,
					"https://www.fiat.com/content/dam/fiat/cross/models/panda_family/family_page/gallery/02_gallery_A.jpg.transform/width-960/img.jpg"));
			carDao.save(new Car(2L, "Fiat", "Panda", "V01322N", "3400", 2001,
					"https://upload.wikimedia.org/wikipedia/commons/4/4c/Fiat_panda_1_v_sst.jpg"));
			carDao.save(new Car(3L, "Audi", "A3", "L818rrp", "1100", 2003,
					"https://content.audi.co.uk/dam/7_days/CAD/External%20Assets/A3/MY17/A3/035.png"));
			carDao.save(new Car(4L, "Audi", "A2", "dd22ee", "3300", 2012,
					"https://www.motoringresearch.com/wp-content/uploads/2015/04/06_Audi_A2.jpg"));
			carDao.save(new Car(5L, "fiat", "ibiza", "dosfk", "3300", 2012,
					"http://www.autotrader.co.uk/image-library/gencutout/2480"));
			carDao.save(new Car(6L, "Audi", "A2", "dd22ee", "3300", 2012,
					"http://images.honestjohn.co.uk/imagecache/file/width/640/media/6906447/Audi~A2~(3).jpg"));
			

		};
	}

}
