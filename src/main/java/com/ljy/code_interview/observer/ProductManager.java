package com.ljy.code_interview.observer;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author : ?
 * @date : 2020/4/10
 */
//???????????????????
public class ProductManager implements Products {

    private ArrayList<Customers> customers;
    private HashMap<String,Integer> info; //??????????????
    private String tempInfoName;

    public ProductManager(){
        customers = new ArrayList<>();
        info = new HashMap<>();
    }

    @Override
    public void registerObserver(Customers customers) {
        this.customers.add(customers);
    }

    @Override
    public void removeObserver(Customers customers) {
        this.customers.remove(customers);
    }

    @Override
    public void notifyAllObserver(String productName) {
        for(Customers customer : customers){
            customer.update(this,productName);
        }
    }

    public void setInfo(String productName,Integer price) {
        this.info.put(productName,price);
        this.tempInfoName = productName;
        this.notifyAllObserver(productName);
    }

    @Override
    public String toString() {
        return "{" + tempInfoName + " : " + info.get(tempInfoName) + "}";
    }
}
