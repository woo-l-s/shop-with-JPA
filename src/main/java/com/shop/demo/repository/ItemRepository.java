package com.shop.demo.repository;


import com.shop.demo.entity.Item;
import jdk.jfr.Percentage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String itemNm);
////    OR조건 처리하기
   List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);
//    Less than 처리하기
    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
//    @Query(value = "select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
////    @Query(value = "select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findByItemDetail(@Param("itemDetatil") String itemDetail);

}
