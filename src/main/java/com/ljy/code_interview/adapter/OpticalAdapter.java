package com.ljy.code_interview.adapter;

/**
 * @author : 夕
 * @date : 2020/4/10
 */
//光能适配器
public class OpticalAdapter implements Motor {

    private OpticalMotor motor;

    public OpticalAdapter(){
        motor = new OpticalMotor();
    }

    @Override
    public void drive() {
        motor.opticalDrive();
    }
}
