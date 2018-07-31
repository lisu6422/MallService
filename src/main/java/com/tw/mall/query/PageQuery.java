package com.tw.mall.query;

public class PageQuery {

    private Integer pageNum;
    private Integer pageSize;
    private Double minPrice;
    private Double maxPirce;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {

        this.pageSize = pageSize;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPirce() {
        return maxPirce;
    }

    public void setMaxPirce(Double maxPirce) {
        this.maxPirce = maxPirce;
    }
}
