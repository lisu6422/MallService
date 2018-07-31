package com.tw.mall.model;


import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String goodsName;
    private double price;
    private String classification;
    private String brand;
    private String description;
    private Date productionDate;
    private String madeIn;

    public Goods(String name, double price, String classification, String brand, String description, Date productionDate, String madeIn) {
        this.goodsName = name;
        this.price = price;
        this.classification = classification;
        this.brand = brand;
        this.description = description;
        this.productionDate = productionDate;
        this.madeIn = madeIn;
    }

    public Goods() {
    }

    public Goods(long id, String goodsName, double price, String brand) {
        this.id = id;
        this.goodsName = goodsName;
        this.price = price;
        this.brand = brand;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
