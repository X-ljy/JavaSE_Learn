package com.ljy.learn_string;

public class Demo02 {


    public static void main(String[] args) {
        //String 是不可变的

        //通过new操作在内存中开辟一块空间存放“123”，然后让s1指向存放“123”的内存
        String s1 = new String("123");
        System.out.println(s1);

        //新开辟一块内存存放“abc”，s1 指向 “abc” ， 但是原先 “123” 并没有改变，在垃圾回收时会进行回收。
        s1 = new String("abc");
        System.out.println(s1);

        //StringBuilder 是直接在对象上操作
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("123");
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);


    }
}
