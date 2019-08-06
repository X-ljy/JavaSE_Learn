package com.ljy.learn_string;

public class Demo01 {

    /**
     * 1)String 常量存放在常量池中，Java虚拟机处于优化的考虑，会让内容一致的对象共享内存块，
     * 但变量是放在堆内存空间中的，new定义的不同变量内存地址不会相同。
     *
     * 2）String 常量 连接 常量，还是 常量，依然用常量池管理，但 变量 连接 常量 就是 变量了。
     * @param args
     */
    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        System.out.println(a == b );
        System.out.println(a.equals(b));

        Integer ia = 1;
        Integer ib = 1;
        System.out.println(ia == ib);
        System.out.println(ia.equals(ib));

        String sc = new String("abc");
        String sd = new String("abc");
        System.out.println(sc == sd);
        System.out.println(a == sc);
        System.out.println(sc.equals(sd));

        String c = "a";
        String d = c + "bc";
        String e = "a" + "bc";
        System.out.println(a == d);
        System.out.println(a == e);
    }
}
