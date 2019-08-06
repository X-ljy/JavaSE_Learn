package com.ljy.learn_exception;

/**
 * @author : 夕
 * @date : 2019/8/4
 */
public class LearnException01 {

    static int test01(){
        int temp = 100;
        try{
            throw new Exception();
        }catch (Exception e){
            return ++temp;
        }finally {
            temp = 666;
        }
    }
    static int x = 0;
    static int y = 10;
    static int z = 100;

    static int test02(){
        try{
            return ++x;
        }catch (Exception e){
            return ++y;
        }finally {
            return ++z;
        }
    }
    public static void main(String[] args) {
        System.out.println(test01()); // 101

        System.out.println("test02() value: " + test02());
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        System.out.println("z: "+ z);
        /**
         * test02() value: 101
         * x: 1
         * y: 10
         * z: 101
         */
    }
}
