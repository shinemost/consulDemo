package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Seller;
import com.example.demo.mapper.SellerMapper;

@Service
public class SellerService {

  @Autowired
  private SellerMapper sellerMapper;

  public Seller get(Integer id) {
    return sellerMapper.sel(id);
  }
}