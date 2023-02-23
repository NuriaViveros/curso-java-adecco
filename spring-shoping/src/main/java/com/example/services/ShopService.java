package com.example.services;

import com.example.entities.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopService {
    List<Shop> findAll();
    Optional<Shop> findById(Long id);


}
