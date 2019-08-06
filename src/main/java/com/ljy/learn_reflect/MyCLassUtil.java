package com.ljy.learn_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author : 夕
 * @date : 2019/8/6
 */
public class MyCLassUtil {
    /**
     * 打印类的信息，包括类的成员函数
     */
    public static void printMethodsMessage(Object object){
        //要获取类的信息，首先获取类的类类型
        Class c = object.getClass(); //传递的是哪个子类的对象，c 就是该子类的类类型
        //获取类的名称
        System.out.println("类的名称："+ c.getName());
        /**
         * Method类，方法对象
         * 一个成员方法就是一个Method对象
         * getMethods() 获取的是所有的public的函数，包括父类继承而来的
         * getDeclaredMethods() 获取的是该类自己声明的方法，不问访问权限
         */
        Method[] methods = c.getMethods();
        for(int i = 0; i<methods.length;i++){

            //得到方法名称
            System.out.print("方法名称： " + methods[i].getName());

            //得到方法的返回值类型的类类型
            Class returnType = methods[i].getReturnType();
            System.out.print("   方法的返回值类型的类类型: "+ returnType.getSimpleName());

            System.out.print("    参数类型: ");
            //获取参数类型，得到参数列表的类型的类类型
            Class[] paramTypes = methods[i].getParameterTypes();
            for(Class class1 : paramTypes){
                System.out.print(class1.getSimpleName()+" ");
            }
            System.out.println();
        }
    }

    /**
     * 打印类的信息，包括类的成员变量
     */
    public static void printFieldMessage(Object object){

        //要获取类的信息，首先获取类的类类型
        Class c = object.getClass(); //传递的是哪个子类的对象，c 就是该子类的类类型
        System.out.println("成员变量数据：成员变量类型  成员变量的名称");
        /**
         * 成员变量也是对象
         * java.lang.reflect.Field
         * Field类封装了关于成员变量的操作
         * getFields() 获取所有public的成员变量的信息
         * getDeclaredFields() 获取的是该类自己声明的成员变量的信息
         */
        Field[] fields = c.getDeclaredFields();
        for(Field field : fields ){
            //得到成员变量类型的类类型
            Class fieldType = field.getType();
            String typeName = fieldType.getSimpleName();
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(typeName + "   :   " + fieldName);
        }
    }

    /**
     * 获取构造函数信息
     */
    public static void printConMessage(Object object){
        Class c = object.getClass();
        /**
         * 构造函数也是对象
         * java.lang.reflect.Constructor中封装了构造函数的信息
         *getConstructors() 获取public的构造函数
         * getDeclaredConstructors() 获取该类自己声明的构造函数
         */
        Constructor[] constructors = c.getDeclaredConstructors();

        for(Constructor constructor : constructors){
            System.out.print(constructor.getName() + " : ");
            Class[] paramTypes = constructor.getParameterTypes();
            for(Class class1 : paramTypes){
                System.out.print(class1.getSimpleName()+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "test";
        MyCLassUtil.printMethodsMessage(str);
        System.out.println("---------------------------");
        MyCLassUtil.printFieldMessage(str);
        System.out.println("----------------------------");
        MyCLassUtil.printConMessage(str);
    }
}
