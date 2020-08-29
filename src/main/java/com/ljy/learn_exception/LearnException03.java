package com.ljy.learn_exception;

/**
 * @author : 夕
 * @date : 2019/8/4
 */

class MyException extends Exception{

    public MyException(){}

    public MyException(String msg){
        super(msg);
    }
}
public class LearnException03 {

    static void test() throws MyException {
        throw new MyException("test MyException!!!");
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
    /**
     * MyException: test MyException!!!
     * 	at LearnException03.test(LearnException03.java:19)
     * 	at LearnException03.main(LearnException03.java:23)
     */

}
