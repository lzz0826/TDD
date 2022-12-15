package com.tony.tdd.tdddemo;

import java.util.List;

import static java.util.Arrays.asList;

//自動生成 ShoppinBasket
public class ShoppinBasket {


    private List<Item> items;

    //自動生成有參構造
    public ShoppinBasket(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {

        //test4 添加 * items 可以因應 tet1 tet2 test3 test4 得條件
        //   items.getQuantaty()

        return items.stream().mapToDouble(items-> items.getUnitPrice() * items.getQuantaty()).sum();



//        //test3 改寫成求總和 可以因應 tet1 tet2 test3 得條件
//        //此時才決定 items.getUnitPrice();方法

//        return items.stream().mapToDouble(items -> items.getUnitPrice()).sum();


//        //tet2 自動生成 屬性 List<Item> items  使用 有參構造傳來的參數
//        if(items.isEmpty()){
//            return 0.0;
//        }
//        //tet2 返回 有參構造傳來的參數的 UnitPrice getUnitPrice()此時生成
//        return items.get(0).getUnitPrice();


//        //test1
//        //給予返回直 執行看結果
//        //業務邏輯 開始...
//        //業務邏輯 結束...
//        //返回結果:
////        return 1.0;
//        return 0.0;

    }
}
