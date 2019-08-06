package com.ljy.learn_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author : Ϧ
 * @date : 2019/8/6
 */
public class MyCLassUtil {
    /**
     * ��ӡ�����Ϣ��������ĳ�Ա����
     */
    public static void printMethodsMessage(Object object){
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

    /**
     * ��ӡ�����Ϣ��������ĳ�Ա����
     */
    public static void printFieldMessage(Object object){

        //Ҫ��ȡ�����Ϣ�����Ȼ�ȡ���������
        Class c = object.getClass(); //���ݵ����ĸ�����Ķ���c ���Ǹ������������
        System.out.println("��Ա�������ݣ���Ա��������  ��Ա����������");
        /**
         * ��Ա����Ҳ�Ƕ���
         * java.lang.reflect.Field
         * Field���װ�˹��ڳ�Ա�����Ĳ���
         * getFields() ��ȡ����public�ĳ�Ա��������Ϣ
         * getDeclaredFields() ��ȡ���Ǹ����Լ������ĳ�Ա��������Ϣ
         */
        Field[] fields = c.getDeclaredFields();
        for(Field field : fields ){
            //�õ���Ա�������͵�������
            Class fieldType = field.getType();
            String typeName = fieldType.getSimpleName();
            //�õ���Ա����������
            String fieldName = field.getName();
            System.out.println(typeName + "   :   " + fieldName);
        }
    }

    /**
     * ��ȡ���캯����Ϣ
     */
    public static void printConMessage(Object object){
        Class c = object.getClass();
        /**
         * ���캯��Ҳ�Ƕ���
         * java.lang.reflect.Constructor�з�װ�˹��캯������Ϣ
         *getConstructors() ��ȡpublic�Ĺ��캯��
         * getDeclaredConstructors() ��ȡ�����Լ������Ĺ��캯��
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
