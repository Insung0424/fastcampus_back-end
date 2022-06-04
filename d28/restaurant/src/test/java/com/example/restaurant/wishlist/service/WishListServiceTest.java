package com.example.restaurant.wishlist.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListServiceTest {

    @Autowired
    private WishListService wishListService;

    @Test
    public void seachTest(){
        var result = wishListService.search("솔데스크");

        System.out.println(result);

        Assertions.assertNotNull(result);

    }

}
