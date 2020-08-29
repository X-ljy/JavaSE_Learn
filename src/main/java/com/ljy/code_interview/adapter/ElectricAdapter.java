package com.ljy.code_interview.adapter;

/**
 * @author : 夕
 * @date : 2020/4/10
 */

//电能发动机适配器
public class ElectricAdapter implements  Motor {

    private ElectricMotor motor;

    public ElectricAdapter(){
        motor = new ElectricMotor();
    }

    @Override
    public void drive() {
        motor.electricDrive();
    }
}
