package com.example.repositories;

import com.example.entities.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository  extends JpaRepository<Shop, Long> {

}
