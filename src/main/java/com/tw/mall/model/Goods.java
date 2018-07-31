package com.tw.mall.model;


import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private String classification;
    private String brand;
    private String description;
    private Date productionData;
    private String madeIn;

    public Goods(String name, double price, String classification, String brand, String description, Date productionData, String madeIn) {
        this.name = name;
        this.price = price;
        this.classification = classification;
        this.brand = brand;
        this.description = description;
        this.productionData = productionData;
        this.madeIn = madeIn;
    }

    public Goods() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getClassification() {
        return classification;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public Date getProductionDate() {
        return productionData;
    }

    public String getMadeIn() {
        return madeIn;
    }
}
