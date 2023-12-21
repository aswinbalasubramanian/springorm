package com.aswin.spring.springorm.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aswin.spring.springorm.passenger.dao.PassengerDao;
import com.aswin.spring.springorm.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aswin/spring/springorm/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("PassengerDao");

		Passenger passenger = new Passenger();
		passenger.setId(10);
		passenger.setFirstName("Aswin");
		passenger.setLastName("Bala");

//		//create test
//		passengerDao.create(passenger);
		
//		//update test
		Passenger passengerUpdate = new Passenger();
		passengerUpdate.setId(10);
		passengerUpdate.setFirstName("Aswin");
		passengerUpdate.setLastName("Balasubramanian");
//		passengerDao.update(passengerUpdate);
		//delete test
		passengerDao.delete(passengerUpdate);
//		//get by id
		Passenger passenger2 = passengerDao.find(5);
		System.out.println(passenger2);
		//get all
		List<Passenger> passengers = passengerDao.findAll();
		System.out.println(passengers);
	}
}
