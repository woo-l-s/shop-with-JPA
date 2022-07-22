package com.shop.demo.repository;


import com.shop.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String itemNm);
//    OR조건 처리하기
    List<Item> findItemNmOrItemDetail(String itemNm, String itemDetail);
//    Less than 처리하기
    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

}
