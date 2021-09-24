package com.htc.restaurantservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.htc.restaurantservice.entity.Restaurant;
import com.htc.restaurantservice.repository.RestaurantServiceInterface;

public class RestaurantController {
	@Autowired
	private RestaurantServiceInterface restaurantserviceinterface;
	
	
	
	@PostMapping("/addrestaurant") 
	public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
		   
		 return restaurantserviceinterface.save(restaurant);
	}
	
	
	
	
	@GetMapping("/user/{id}") 
	public Restaurant getRestaurantByid(@PathVariable String id) {
		Restaurant restaurant =null;
	
		restaurant=restaurantserviceinterface.findById(id).get();
		return restaurant;
	}
}
