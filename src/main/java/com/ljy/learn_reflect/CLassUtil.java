package com.ljy.learn_reflect;

import com.fasterxml.jackson.databind.util.ClassUtil;

import java.lang.reflect.Method;

/**
 * @author : Ϧ
 * @date : 2019/8/6
 */
public class CLassUtil {
    /**
     * ��ӡ�����Ϣ��������ĳ�Ա��������Ա����
     */
    public static void printClassMessage(Object object){
        //Ҫ��ȡ�����Ϣ�����Ȼ�ȡ���������
        Class c = object.getClass(); //���ݵ����ĸ�����Ķ���c ���Ǹ������������
        //��ȡ�������
        System.out.println("������ƣ�"+ c.getName());
        /**
         * Method�࣬��������
         * һ����Ա��������һ��Method����
         * getMethods() ��ȡ�������е�public�ĺ�������������̳ж�����
         * getDeclaredMethods() ��ȡ���Ǹ����Լ������ķ��������ʷ���Ȩ��
         */
        Method[] methods = c.getMethods();
        for(int i = 0; i<methods.length;i++){

            //�õ���������
            System.out.print("�������ƣ� " + methods[i].getName());

            //�õ������ķ���ֵ���͵�������
            Class returnType = methods[i].getReturnType();
            System.out.print("   �����ķ���ֵ���͵�������: "+ returnType.getSimpleName());

            System.out.print("    ��������: ");
            //��ȡ�������ͣ��õ������б�����͵�������
            Class[] paramTypes = methods[i].getParameterTypes();
            for(Class class1 : paramTypes){
                System.out.print(class1.getSimpleName()+" ");
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {

        String str = "test";
        CLassUtil.printClassMessage(str);
    }
}
