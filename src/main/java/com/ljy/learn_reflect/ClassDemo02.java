package com.ljy.learn_reflect;

import java.util.Scanner;

/**
 * @author : 夕
 * @date : 2019/8/6
 */
public class ClassDemo02 {
    //Java动态加载类
    /**
     * Class.forName(""类的全称)，不仅表示对象的类类型，还代表动态加载类。
     * 静态加载类：编译时刻加载类（通过new关键字创建的对象）
     * 动态加载类：运行时刻加载类（Class.forName() ,得到类类型 调用newinstance()）
     *
     */

    /**
     * 由于通过new对象是静态加载，所以在编译时必须加载所有可能用到的类。
     * 但实际是希望用到哪个类加载哪个类，这样就不会在编译时报错，并且可以运行，
     * 所以可以通过动态加载类来解决该问题
     */
//    public static void main(String[] args) {
//        if("PPT".equals(args[0])){
//            PPT ppt = new PPT();
//            ppt.start();
//        }
//        if("Word".equals(args[0])){
//            Word word = new Word();
//            word.start();
//        }
//    }
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            String className = scanner.nextLine();
            //动态加载类，在运行时刻加载
            java.lang.Class c = java.lang.Class.forName(className);
            //通过类类型，创建该类对象
            OfficeAble oa = (OfficeAble) c.newInstance();
            oa.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
