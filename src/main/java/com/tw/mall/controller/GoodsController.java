package com.tw.mall.controller;

import com.tw.mall.model.Goods;
import com.tw.mall.query.PageQuery;
import com.tw.mall.service.GoodsService;
import com.tw.mall.service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{id}")
    public Goods getGoodsById(@PathVariable("id") int id){
        return goodsService.getGoods(id);
    };

    @PutMapping("/")
    public Goods add(@RequestBody Goods goods){
        goodsService.add(goods);
        return goods;

    }

    @PostMapping("/")
    public Goods update(@RequestBody Goods goods){
        goodsService.update(goods);
        return goods;
    }

    @GetMapping("/list")
    public List<Goods> list(PageQuery query){
        return goodsService.select(query);
    }
}
