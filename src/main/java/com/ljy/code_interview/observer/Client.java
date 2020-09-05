package com.ljy.code_interview.observer;

/**
 * @author : ?
 * @date : 2020/4/10
 */
public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer("?????");
        ProductManager productManager = new ProductManager();
        productManager.registerObserver(customer);
        productManager.setInfo("????",100);
        productManager.setInfo("????",100);
    }
}
