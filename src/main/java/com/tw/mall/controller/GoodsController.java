package com.tw.mall.controller;

import com.tw.mall.model.Goods;
import com.tw.mall.service.LocalGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private LocalGoodsService localGoodsService;

    @GetMapping("/twmall")
    public Goods getGoodsById(@RequestParam int id){
        return localGoodsService.getGoods(id);
    };

    @PostMapping("/add")
    public boolean add(@RequestBody Goods goods){
        return localGoodsService.add(goods);
    }

    @GetMapping("/all")
    public List<Goods> getAll(){
        return localGoodsService.getAllList();
    }
}
