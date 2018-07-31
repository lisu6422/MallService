package com.tw.mall.repository;

import com.tw.mall.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {


    @Query("SELECT new Goods(goods.id,goods.goodsName,goods.price,goods.brand) FROM Goods goods")
    List<Goods> selectAll();
}
