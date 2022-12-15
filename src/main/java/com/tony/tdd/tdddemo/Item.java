package com.tony.tdd.tdddemo;

import static javafx.scene.input.KeyCode.T;


//生成 Item
public class Item {

    private double unitPrice;
    private int quantity;

    //給予 double unitPrice(商品價格)
//           int  unitPrice(數量)
    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }


    //test2 返回 unitPrice
    //使用自動生成 Item , double unitPrice 利用傳來得參數
    public double getUnitPrice() {
        return unitPrice;
    }

    //test4 自動添加
    public int getQuantaty() {
        return quantity;
    }
}
