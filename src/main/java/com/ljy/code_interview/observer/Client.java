package com.ljy.code_interview.observer;

/**
 * @author : Ï¦
 * @date : 2020/4/10
 */
public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer("ÂÞ½ðÓî");
        ProductManager productManager = new ProductManager();
        productManager.registerObserver(customer);
        productManager.setInfo("¶ÌÐä",100);
        productManager.setInfo("³¤¿ã",100);
    }
}
