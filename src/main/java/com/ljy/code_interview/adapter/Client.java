package com.ljy.code_interview.adapter;

/**
 * @author : 夕
 * @date : 2020/4/10
 */
//客户端
public class Client {

    public static void main(String[] args) {
        Motor electricMotor = new ElectricAdapter();
        electricMotor.drive();
        Motor opticalMotor = new OpticalAdapter();
        opticalMotor.drive();
    }
}
