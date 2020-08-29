package com.ljy.learn_reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : 夕
 * @date : 2019/8/6
 */
public class MethodDemo01 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //通过反射获取print(int ,int )方法
        A a1 = new A();
        Class c = a1.getClass();
        /**
         * 获取哪个方法由名称和参数列表来决定
         *getMethod() 获取的是public方法
         *getDeclaredMethod() 获取的是该类自己声明的方法，不问访问权限
         */

//        Method method = c.getDeclaredMethod("print",new Class[]{int.class,int.class});
        Method method = c.getDeclaredMethod("print",int.class,int.class);
//        Object o = method.invoke(a1,new Object[]{10,20});
        //方法的反射操作是用method对象调用invoke（）方法，效果和 类实例.方法()  相同
        //方法如果没有返回值返回null，有返回值返回具体的返回值
        Object o = method.invoke(a1,10,20);

    }

}

class A{

    public void print(int a, int b){
        System.out.println(a+b);
    }

    public void print(String a,String b){
        System.out.println(a.toUpperCase() + "  " + b.toUpperCase());
    }
}
