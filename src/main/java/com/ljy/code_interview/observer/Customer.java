package com.ljy.code_interview.observer;

/**
 * @author : 夕
 * @date : 2020/4/10
 */

//具体观察者
public class Customer implements Customers {

    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void update(Products message,String productName) {
        System.out.println("通知：" + this.name + " : 商品更新");
        System.out.println(message);
    }
}
