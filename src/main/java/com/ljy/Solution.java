package com.ljy;

import java.util.Arrays;

/**
 * @author : 夕
 * @date : 2020/4/6
 */
public class Solution {

}
//    public static void main(String []args){
//        int []arr = {9,8,7,6,5,4,3,2,1};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void sort(int []arr){
//        int[] temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
//        sort(arr,0,arr.length-1,temp);
//    }
//    private static void sort(int[] arr,int left,int right,int []temp){
//        if(left<right){
//            int mid = (left+right)/2;
//            sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
//            sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
//            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
//        }
//    }
//    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
//        int l = left;//左序列指针
//        int r = mid+1;//右序列指针
//        int t = 0;//临时数组指针
//        while (l<=mid && r<=right){
//            if(arr[l]<=arr[r]){
//                temp[t++] = arr[l++];
//            }else {
//                temp[t++] = arr[r++];
//            }
//        }
//        while(l<=mid){//将左边剩余元素填充进temp中
//            temp[t++] = arr[l++];
//        }
//        while(r<=right){//将右序列剩余元素填充进temp中
//            temp[t++] = arr[r++];
//        }
//        t = 0;
//        //将temp中的元素全部拷贝到原数组中
//        while(left <= right){
//            arr[left++] = temp[t++];
//        }
//    }
//
////    public static void main(String[] args) {
////        int[] num = {3,45,78,64,52,11,64,55,99,11,18};
////        System.out.println(arrayToString(num,"未排序"));
////        QuickSort(num,0,num.length-1);
////        System.out.println(arrayToString(num,"排序"));
////        //	System.out.println("数组个数："+num.length);
////        //	System.out.println("循环次数："+count);
////
////    }
//    /**
//     * 快速排序
//     * @param num	排序的数组
//     * @param left	数组的前针
//     * @param right 数组后针
//     */
//    private static void QuickSort(int[] num, int left, int right) {
//        //如果left等于right，即数组只有一个元素，直接返回
//        if(left>=right) {
//            return;
//        }
//        //设置最左边的元素为基准值
//        int key=num[left];
//        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
//        int l=left;
//        int r=right;
//        while(l<r){
//            //j向左移，直到遇到比key小的值
//            while(num[r]>=key && l<r){
//                r--;
//            }
//            //i向右移，直到遇到比key大的值
//            while(num[l]<=key && l<r){
//                l++;
//            }
//            //i和j指向的元素交换
//            if(l<r){
//                int temp=num[l];
//                num[l]=num[r];
//                num[r]=temp;
//            }
//        }
//        //将作为基准值的位置和num[i]交换位置
//        num[left]=num[l];
//        num[l]=key;
//        //	count++;
//        QuickSort(num,left,l-1);
//        QuickSort(num,l+1,right);
//    }
//    /**
//     * 将一个int类型数组转化为字符串
//     * @param arr
//     * @param flag
//     * @return
//     */
//    private static String arrayToString(int[] arr,String flag) {
//        String str = "数组为("+flag+")：";
//        for(int a : arr) {
//            str += a + "\t";
//        }
//        return str;
//    }
//
//    public int compress(char[] chars){
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i=0;i<chars.length;i++){
//            int count = 1;
//            while(i<chars.length-1 && chars[i] == chars[i+1]){
//                count++;
//                i++;
//            }
//            if(count == 1){
//                stringBuilder.append(chars[i]);
//            }else{
//                stringBuilder.append(chars[i]).append(count);
//            }
//
//        }
//        for(int i=0;i<stringBuilder.length();i++){
//            chars[i] = stringBuilder.charAt(i);
//        }
//        return stringBuilder.length();
//    }
//
//
//}
