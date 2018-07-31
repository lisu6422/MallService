package com.tw.mall.service;

import com.tw.mall.model.Goods;
import com.tw.mall.query.PageQuery;
import com.tw.mall.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<Goods> getAllList() {
        return goodsRepository.selectAll();
    }

    @Override
    public Goods getGoods(long id) {
        Optional<Goods> optionGoods = goodsRepository.findById(id);
        if (optionGoods.isPresent()) {
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
        Optional<Goods> optionalGoods = goodsRepository.findById(goods.getId());
        if (optionalGoods.isPresent()) {
            goodsRepository.save(goods);
            return true;
        }

        return false;
    }

    @Override
    public List<Goods> select(PageQuery query) {

        if (query.getPageNum() == null) return goodsRepository.findAll();

        PageRequest pageRequest = new PageRequest(query.getPageNum(), query.getPageSize());

        return goodsRepository.findAll(pageRequest).getContent();
    }
}
