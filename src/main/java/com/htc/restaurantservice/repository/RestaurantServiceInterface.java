package com.htc.restaurantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.restaurantservice.entity.Restaurant;
@Repository
public interface RestaurantServiceInterface  extends JpaRepository<Restaurant, String>  {


}


