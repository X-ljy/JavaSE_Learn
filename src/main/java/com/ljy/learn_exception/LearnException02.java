package com.ljy.learn_exception;

import java.io.IOException;

/**
 * @author : 夕
 * @date : 2019/8/4
 */

class Base{
    void f() throws IOException {

    }
}

class Child extends Base{

//    @Override
//    void f()throws Exception{}
    //覆盖父类方法，但是抛出的异常比父类的范围要大，会报语法错误

}



public class LearnException02 {


}
