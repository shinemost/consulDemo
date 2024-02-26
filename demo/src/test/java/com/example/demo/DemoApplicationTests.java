package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Seller;
import com.example.demo.service.SellerService;

@SpringBootTest(classes = { DemoApplication.class })
// @RunWith(SpringRunner.class)
class DemoApplicationTests {

  @Autowired
  private SellerService sellerService;

  @Test
  void testGetById() {
    int id = 1;
    Seller seller = sellerService.get(id);
    // 判定非空
    Assertions.assertNotNull(seller);
    // id相等
    Assertions.assertEquals(id, seller.getId());
  }

}
