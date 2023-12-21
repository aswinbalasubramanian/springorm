package com.aswin.spring.springorm.passenger.dao;

import java.util.List;

import com.aswin.spring.springorm.passenger.entity.Passenger;

public interface PassengerDao {

	int create(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);

	Passenger find(int id);

	List<Passenger> findAll();
}
