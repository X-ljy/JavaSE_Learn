package com.ljy.code_interview;

/**
 * @author : 夕
 * @date : 2020/4/10
 */
public class ThreadSolution {
    public static void main(String[] args) {
        new Thread(new Solution("A")).start();
        new Thread(new Solution("B")).start();
        new Thread(new Solution("C")).start();
    }
}
class Solution implements Runnable{

    private String threadName = "";

    //线程私有变量，存储运行次数
    private int count = 10;

    //静态变量，存储哪一个线程应该运行的标志
    public static String flag = "A";

    public Solution(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (count > 0){
            //对flag加同步锁，防止空轮询
            synchronized(flag){
                if(flag.equals(threadName)){
                    System.out.println(threadName);
                    count--;
                    if("A".equals(threadName)){
                        flag = "B";
                    }
                    if("B".equals(threadName)){
                        flag = "C";
                    }
                    if("C".equals(threadName)){
                        flag = "A";
                    }
                }
            }
        }
    }
}
