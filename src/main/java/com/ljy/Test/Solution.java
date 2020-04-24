package com.ljy.Test;

/**
 * @author : 夕
 * @date : 2020/3/22
 */
import java.util.*;


public class Solution {

    //用于存贮数据，然后后期排序
    public class TempData{
        int flag = 0;//是豹子还是顺子
        int count = 0; //数量
        String nums = ""; //电话号码
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] res = str.split(",");
        if(res.length == 0){
            System.out.println((String) null);
        }
        int sum = 0;

        TempData[] flag = new TempData[res.length];
        for(int i=0;i<res.length;i++){
            //对每个号码，进行价值计算，然后赋值给 flag 数组，之后再对flag数组进行排序
        }


        if(sum == 0){
            System.out.println((String) null);
        }
    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String[] res = str.split(" ");
//        if(res.length == 0){
//            return;
//        }
//        if(res.length == 1){
//            return;
//        }
//        int[] num = new int[res.length];
//        int i=0;
//        for(String s : res){
//            num[i] = Integer.valueOf(s);
//            i++;
//        }
//
//        int sum = 0;
//        for(int j=0;j<num.length;j++){
//            int count = 0;
//            for(int x=0;x<j;x++){
//                if(num[x] > num[j]){
//                    count++;
//                }
//            }
//            if(count == 1){
//                sum++;
//                System.out.print(num[j] + " ");
//            }
//        }
//        if(sum ==0){
//            System.out.print(-1);
//        }
//    }





    /**
     * 获取队中从前到后每个人与前方身高高于自己的人的最短距离
     * @param height int整型一维数组 队中从前到后每个人与前方身高高于自己的人的最短距离
     * @return int整型一维数组
     */
    public int[] DistanceToHigher (int[] height) {
        // write code here
        // write code here
        if(height.length ==0){
            return null;
        }
        if(height.length == 1){
            return new int[]{0};
        }
        int[] res = new int[height.length];
        for(int i=0;i<height.length;i++){
            int index = 0;
            for(int j=0;j<i;j++){
                if(height[j] > height[i]){
                    index = j;
                }
            }
            res[i] = i - index;
        }
        return res;
    }
}