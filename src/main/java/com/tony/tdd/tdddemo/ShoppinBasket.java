package com.tony.tdd.tdddemo;

import java.util.List;

import static java.util.Arrays.asList;

//自动生成 ShoppinBasket
public class ShoppinBasket {


    private List<Item> items;

    //自动生成有参构造
    public ShoppinBasket(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {

        //test4 添加 * items 可以因应 tet1 tet2 test3 test4 得条件
        //   items.getQuantaty()

        return items.stream().mapToDouble(items-> items.getUnitPrice() * items.getQuantaty()).sum();



//        //test3 改写成求总和 可以因应 tet1 tet2 test3 得条件
//        //此时才决定 items.getUnitPrice();方法

//        return items.stream().mapToDouble(items -> items.getUnitPrice()).sum();


//        //tet2 自动生成 属性 List<Item> items  使用 有参构造传来的参数
//        if(items.isEmpty()){
//            return 0.0;
//        }
//        //tet2 返回 有参构造传来的参数的 UnitPrice getUnitPrice()此时生成
//        return items.get(0).getUnitPrice();


//        //test1
//        //给予返回直 执行看结果
//        //业务逻辑 开始...
//        //业务逻辑 结束...
//        //返回结果:
////        return 1.0;
//        return 0.0;

    }
}
