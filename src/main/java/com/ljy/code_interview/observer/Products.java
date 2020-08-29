package com.ljy.code_interview.observer;

/**
 * @author : 夕
 * @date : 2020/4/10
 */

//抽象产品接口（抽象主题）
public interface Products {

    public void registerObserver(Customers customer);

    public void removeObserver(Customers customer);

    public void notifyAllObserver(String productName);

}
