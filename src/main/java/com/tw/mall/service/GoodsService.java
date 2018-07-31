package com.tw.mall.service;

import com.tw.mall.model.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getAllList();
    Goods getGoods(long id);
    boolean add(Goods goods);
    boolean update(Goods goods);

}
