package com.ljy.code_interview.observer;

/**
 * @author : Ϧ
 * @date : 2020/4/10
 */

//����۲���
public class Customer implements Customers {

    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void update(Products message,String productName) {
        System.out.println("֪ͨ��" + this.name + " : ��Ʒ����");
        System.out.println(message);
    }
}
