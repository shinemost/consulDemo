package com.example.demo.mapper;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.Seller;

@Repository
public interface SellerMapper {
  Seller sel(int id);
}