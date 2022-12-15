package com.tony.tdd.tdddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TddDemoApplicationTests {

    //Assert.assertEquals(expected, actual)：驗證expected、actual 是否相同

    //假設有個空的購物籃 取得全部 預設是空的0.0
    @Test
    public void totalOfEmptyBasket() {
        //假想 ShoppinBasket class 此時才創建
        ShoppinBasket basket = new ShoppinBasket(new ArrayList<>());
        //假想 .getTotal()方法 返回 0.0 此時才創建 轉跳 ShoppinBasket class
        //使用assertEquals()斷言返回直是否等於0.0
        assertEquals(0.0,basket.getTotal(),0.0);
    }

    @Test
    //test 2 假設購物欄里有一個商品 商品100元*1
    public void totalOfSingleItem(){
        //因為需求需要List Item
        ShoppinBasket basket = new ShoppinBasket(Arrays.asList(new Item(100.0,1)));
        assertEquals(100.0,basket.getTotal(),0.0);

    }


    @Test
    //test 3假設購物欄里有兩個商品 商品100元*1  商品200元*1
    public void totalOfTwoItem(){
        ShoppinBasket basket = new ShoppinBasket(Arrays.asList(new Item(100.0 ,1),
                new Item(200,1)));
        assertEquals(300,basket.getTotal(),0.0);

    }

    @Test
    //test 4假設購物欄里有兩個商品 商品100元*2
    public void totalOfItemWithQuantityTwo(){
        ShoppinBasket basket = buildBasketWithItems(new Item(100,2));
        assertEquals(200,basket.getTotal(),0.0);

    }

//    優化
    private ShoppinBasket buildBasketWithItems(Item... items){
        return new ShoppinBasket(Arrays.asList(items));
    }

}
