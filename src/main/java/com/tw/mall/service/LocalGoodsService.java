package com.tw.mall.service;

import com.tw.mall.model.Goods;
import com.tw.mall.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalGoodsService implements GoodsService {

    @Autowired
   private GoodsRepository goodsRepository;

    @Override
    public List<Goods> getAllList() {
        return goodsRepository.findAll();
    }

    @Override
    public Goods getGoods(long id) {
        Optional<Goods> optionGoods = goodsRepository.findById(id);
        if(optionGoods.isPresent()){
            return optionGoods.get();
        }
        return null;
    }

    @Override
    public boolean add(Goods goods) {
        goodsRepository.save(goods);
        return true;
    }

    @Override
    public boolean update(Goods goods) {
        return false;
    }
}
