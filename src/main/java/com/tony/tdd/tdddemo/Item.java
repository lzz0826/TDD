package com.tony.tdd.tdddemo;

import static javafx.scene.input.KeyCode.T;


//生成 Item
public class Item {

    private double unitPrice;
    private int quantity;

    //给予 double unitPrice(商品价格)
//           int  unitPrice(数量)
    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }


    //test2 返回 unitPrice
    //使用自动生成 Item , double unitPrice 利用传来得参数
    public double getUnitPrice() {
        return unitPrice;
    }

    //test4 自动添加
    public int getQuantaty() {
        return quantity;
    }
}
