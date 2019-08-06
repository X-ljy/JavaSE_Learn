package com.ljy.learn_reflect;

/**
 * @author : 夕
 * @date : 2019/8/5
 */
public class Demo01 {

    public static void main(String[] args) throws ClassNotFoundException {

        //Test实例对象表示
        Test test = new Test();

        //Java中万事万物皆对象，类也是对象，是Class类的实例对象，这个对象称为该类的类类型

        //Test这个类也是一个实例对象----Class类的实例对象
        //任何一个类都是Class的实例对象，这个实例对象有三种表示方式

        //第一种方式：任何一个类都有一个隐含的静态成员变量class
        Class test01 = Test.class;

        //第二种表达方式：已知该类的对象通过getClass方法获取
        Class test02 = test.getClass();

        //第三种表达方式：通过Class.forName()
        Class test03 = null;
        test03 = Class.forName("com.ljy.learn_reflect.Test");

        //test01 02 03 都代表着 Test 类类型
        System.out.println(test01 == test02); //true
        System.out.println(test02 == test03); //true

        //我们可以通过 类的类类型创建该类的对象实例,
        // 调用newInstance() 需要有无参数的构造方法
        try {

            Test test04 = (Test) test01.newInstance();
            test04.f();

        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }



}

class Test{
//    private String str;
//    public Test(String str){
//        this.str = str;
//    }
    void f(){
        System.out.println("hello Test");
    }
}