package com.ljy;



import java.util.*;

public class Main {

    public static void main(String[] args) {

        //找出三对一样的板子，然后需要有四个有一样的长，
        // 然后另两个继承四个中另外两个长度
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n>0){
            int[][] data = new int[6][2];
            for (int i=0;i<6;i++){
                for (int j=0;j<2;j++){
                    data[i][j] = scanner.nextInt();
                }
                if(data[i][0] < data[i][1]){
                    int temp = data[i][0];
                    data[i][0] = data[i][1];
                    data[i][1] = temp;
                }
            }
            //合并一样的
            int[][] t1 = new int[3][2];
            int count = 0;
            for(int i=0;i<6;i++){
                for(int j=i+1;j<6;j++){
                    if(data[i][0] == data[j][0]
                            && data[i][1] == data[j][1]){
                        t1[count][0] = data[i][0];
                        t1[count][1] = data[i][1];
                        count++;
                        if(count>=3){
                            break;
                        }
                    }
                }
            }
            //找出4个一样的行
            int sim = 0;
            int num1 = 0;
            int num2 = 0;
            boolean flag = false;
            if(t1[0][0] == t1[1][0] ){
                sim = t1[0][0];
                num1 = t1[0][1];
                num2 = t1[1][1];
                if(num1 < num2){
                    int t = num1;
                    num1 = num2;
                    num2 = num1;
                }
                if(t1[2][0] == num1 && t1[2][1] == num2){
                    flag = true;
                }
            }else if(t1[0][0] == t1[2][0]){
                sim = t1[0][0];
                num1 = t1[0][1];
                num2 = t1[2][1];
                if(num1 < num2){
                    int t = num1;
                    num1 = num2;
                    num2 = num1;
                }

                if(t1[1][0] == num1 && t1[1][1] == num2){
                    flag = true;
                }
            }else if(t1[1][0] == t1[2][0]){
                sim = t1[1][0];
                num1 = t1[1][1];
                num2 = t1[2][1];
                if(num1 < num2){
                    int t = num1;
                    num1 = num2;
                    num2 = num1;
                }

                if(t1[0][0] == num1 && t1[0][1] == num2){
                    flag = true;
                }
            }
            if(sim == 0){
                System.out.println("IMPOSSIBLE");
            }
            if(flag){
                System.out.println("POSSIBLE");
            }


            n--;
        }
    }
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] ans = new int[2];
//        int[] temp = new int[2];
//        int count = 1;
//        ans[0] = scanner.nextInt();
//        ans[1] = scanner.nextInt();
//        for(int i=0;i<n-1;i++){
//            temp[0] = scanner.nextInt();
//            temp[1] = scanner.nextInt();
//            if(temp[0] > ans[1] || temp[1] < ans[0]){
//                count--;
//            }else {
//                count++;
//                ans[0] = Math.min(ans[0],temp[0]);
//                ans[1] = Math.min(ans[1],temp[1]);
//            }
//            System.out.println(count);
//        }
//        System.out.println(count);
//    }
}
























//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[] data = new int[n];
//        for(int i=0;i<data.length;i++){
//            data[i] = scanner.nextInt();
//        }
//        int[] tempArr = data;
//        int count = 0;
//        int max = Math.max(data[0],data[1]);
//        while (true){
//            if(max >= data[1]){
//                count++;
//                reverseArr(data,data[1]);
//            }else{
//                int temp = data[1];
//                reverseArr(data,max);
//                max = temp;
//                count = 0;
//            }
//            if(count == m){
//                int res = -1;
//                for(int i=0;i<tempArr.length;i++){
//                    if(tempArr[i] == max){
//                        res = i;
//                        break;
//                    }
//                }
//                System.out.println(res);
//                break;
//            }
//        }
//
//    }
//
//    public static void reverseArr(int[] arr,int num){
//        for(int i=1;i<arr.length-1;i++){
//            arr[i] = arr[i+1];
//        }
//        arr[arr.length-1] = num;
//    }
//







//    /**
//     * 重复字符串过滤
//     * @param str string字符串 输入的字符串
//     * @return string字符串
//     */
//    public static String removeChar(String str) {
//        // write code here
//        char[] chars = new char[128];
//        char[] arr = str.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            chars[arr[i]]++;
//        }
//        int max = -1;
//        int count = 0;
//        for(int i=0;i<chars.length;i++){
//            if(chars[i] > max){
//                max = chars[i];
//                count = 0;
//            }
//            if(chars[i] == max){
//                count++;
//            }
//        }
//        int[] flag = new int[count];
//        int index = 0;
//        for(int i=0;i<chars.length;i++){
//            if(chars[i] == max){
//                flag[index++] = i;
//            }
//        }
//        for (int j=0;j<count;j++){
//            for(int i=0;i<arr.length;i++){
//                if(arr[i] == flag[j]){
//                    arr[i] = ' ';
//                }
//            }
//        }
//        String temp = String.valueOf(arr);
//        String [] t = temp.split(" ");
//
//        StringBuilder res = new StringBuilder();
//        for(int i=0;i<t.length;i++){
//            res.append(t[i]);
//        }
//        return res.toString();
//    }
//
//    public static int[][] build2DMatrix (int n) {
//        // write code here
//        int count = n*n;
//        int flag = 1;
//        int[][] res = new int[n][n];
//        int row = 0;
//        int col = n-1;
//        while (row<n && col>=0){
//            for(int i=0;i<=col;i++){
//                res[row][i] = flag;
//                flag++;
//            }
//            row++;
//            for(int i=row;i<n;i++){
//                res[row][col] = flag;
//                flag++;
//            }
//            col--;
//        }
//        return res;
//    }
//
//
//
//    public int process (int a, int b, int A, int B) {
//        // write code here
//        int count = 0;
//        while (A > a && B > b){
//            if(A > 2*a && B > 2*b){
//                A = A/2;
//                B = B/2;
//            }else{
//                A = A-1;
//                B = B-1;
//            }
//            count++;
//        }
//        return (A == a && B == b) ? count : -1;
//    }
//}
//
//
//
//
//
//
//
//
//





    /**
     * Cassidy和Eleanore是一对好朋友，她们经常会一起玩游戏。某一天她们玩了一个回文游戏。游戏规则是这样的：给出一个仅包含小写字母的字符串S，在每一个人的回合中，她们会进行两个操作：
     *
     * 1. 尝试重新排列这个字符串，如果可以把这个字符串排列成回文字符串，则立即获胜。
     *
     * 2. 否则，她们必须删掉字符串中的一个字符。
     *
     * 已知，Cassidy先手，在两个人都采取最佳策略的情况下，谁可以获胜。
     *
     * 输入
     * 输入第一行仅包含一个正整数t，表示数据组数，(t<=10)
     *
     * 接下来有t行，每行有一个字符串S，表示一组测试数据。(|S|<=1000)
     *
     * 输出
     * 对于每组数据输出一行，如果Cassidy获胜，则输出Cassidy，否则输出Eleanore
     */

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        String[] data = new String[count+1];
//        int t=0;
//        while(t<=count){
//            data[t] = scanner.nextLine();
//            t++;
//        }
//        for(int i=1;i<data.length;i++){
//            int temp = getResult(data[i]);
//            if(temp == 0 || temp == 1){
//                System.out.println("Cassidy");
//            }else if(temp % 2 == 0){
//                System.out.println("Eleanore");
//            }else{
//                System.out.println("Cassidy");
//            }
//        }
//
//    }
//
//    public static  int getResult(String s){
//        Set<Character> set = new HashSet<>();
//        char[] chars = s.toCharArray();
//        for(int i=0;i<chars.length;i++){
//            if(set.contains(chars[i])){
//                set.remove(chars[i]);
//            }
//            set.add(chars[i]);
//        }
//        return set.size();
//    }



    /**
     * 有n位小朋友去小明家里拜年，小明准备了m份礼物。小明想把所有礼物平均分给每个小朋友，每个小朋友得到相同个数的礼物。但是m未必能被n整除，小明可以使用以下两种操作任意多次（两种操作可以同时使用）。
     *
     * 1、 给其中一个小朋友发红包，收到红包的小朋友会离开小明家。每个红包需要花费a元。
     *
     * 2、 购买一个新礼物，每个礼物价值为b元。
     *
     * 问小明最少花费多少元，才能使得所有礼物可以被剩下的小朋友平分。
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        int temp = m%n;
//        int count = n - temp; //还差多少礼物
//
//
//    }































//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int people_sum = scanner.nextInt();
//        int meet_count = scanner.nextInt();
//        int init_num = scanner.nextInt();
//        Set<Integer> set = new HashSet();
//        for(int i=0;i<meet_count;i++){
//            int num = scanner.nextInt();
//            int[] meet_list = new int[num+1];
//            meet_list[0] = num;
//            boolean flag = false;//是否有感染者
//            for(int j=1;j<=num;j++){
//                meet_list[j] = scanner.nextInt();
//                if(meet_list[j] == init_num){
//                    flag = true;
//                }
//            }
//            //进入感染集合
//            if(flag){
//                for(int k=1;k<=num;k++){
//                    set.add(meet_list[k]);
//                }
//            }
//        }
//        System.out.println(set.size());
//
//    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        int[] arr = new int[len];
//        for(int i=0;i<len;i++){
//            arr[i] = scanner.nextInt();
//        }
//        boolean flag = true;
//        int[] res = new int[len-1];
//        for(int i=0;i<len-1;i++){
//            res[i] = arr[i+1] - arr[i];
//            if(res[i] == 0){
//                System.out.println(-1);
//                flag = false;
//                System.exit(0);
//            }
//        }
//        Arrays.sort(res);
//        boolean j_flag = false;
//        boolean o_flag = false;
//        if(flag){
//            for(int n : res){
//                if(n % 2 == 0){
//                    o_flag = true;
//                }else{
//                    j_flag = true;
//                }
//            }
//            //奇偶都有，返回1
//            if(j_flag && o_flag){
//                System.out.println(1);
//            }
//            //全是奇数
//            if(j_flag){
//                int num = res[0];
//                while (num > 0){
//
//                    for(;num>0;num=num-2){
//                        for(int x : res){
//                            if(x%num != 0){
//                                System.out.println(1);
//                                System.exit(0);
//                            }
//                        }
//                        System.out.println(num);
//                        System.exit(0);
//                    }
//                }
//            }
//            //全是偶数
//            if(o_flag){
//                int num = res[0];
//                while (num > 0){
//                    for(;num>0;num=num-2){
//                        for(int x : res){
//                            if(x%num != 0){
//                                System.out.println(2);
//                                System.exit(0);
//                            }
//                        }
//                        System.out.println(num);
//                        System.exit(0);
//                    }
//                }
//            }
//        }
//    }
































//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long data[] = new long[n];
//        for(int i=0;i<n;i++){
//            data[i] = scanner.nextLong();
//        }
//        Arrays.sort(data); //归并排序
//        int result = 0;
//        while (data[n-1] >= n){
//            data[n-1] = data[n-1] -n;
//            for(int i=0;i<n-1;i++){
//                data[i] = data[i] +1;
//            }
//            Arrays.sort(data);
//            result ++;
//        }
//        System.out.println(result);
//    }





























//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        int[] all_r = new int[count];
//        for(int i=0;i<count;i++){
//            all_r[i] = scanner.nextInt();
//        }
//
//        double sum = 0;
//        if(count % 2 == 0){
//            for(int i=count-2;i>=0;i=i-2){
//                if(i==0){
//                    sum += Math.PI * Math.pow(all_r[i],2);
//                    break;
//                }
//                sum += Math.PI * Math.pow(all_r[i],2) - Math.PI * Math.pow(all_r[i-1],2);
//            }
//        }else{
//            for(int i=count-1;i>=0;i=i-2){
//                if(i==0){
//                    sum += Math.PI * Math.pow(all_r[i],2);
//                    break;
//                }
//                sum += Math.PI * Math.pow(all_r[i],2) - Math.PI * Math.pow(all_r[i-1],2);
//            }
//        }
//        String temp = String.valueOf(sum);
//        int end = 0 ;
//        for(int i=0;i<temp.length();i++){
//            if(temp.charAt(i) == '.'){
//                end = i;
//                break;
//            }
//        }
//        double res = Double.parseDouble(temp.substring(0,end+6));
//        if(temp.charAt(end+6) >= 5){
//            res += 0.00001;
//        }
//        System.out.println(res);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        StringBuilder temp_b = new StringBuilder();
//        while (scanner.hasNextInt()){
//            temp_b.append(scanner.nextInt());
//        }
//        int b = Integer.valueOf(String.valueOf(temp_b));
//        String str_a = String.valueOf(a);
//        if(str_a.charAt(0) == '-'){
//            StringBuilder strBuilder = new StringBuilder();
//            strBuilder.append('-');
//            for(int i=1;i<str_a.length()-1;i++){
//                strBuilder.append(String.valueOf(b).charAt(i-1));
//            }
//            System.out.println(strBuilder.toString());
//        }else{
//            StringBuilder strBuilder = new StringBuilder();
//            for(int i=0;i<str_a.length();i++){
//                strBuilder.append(String.valueOf(b).charAt(i));
//            }
//            System.out.println(strBuilder.toString());
//        }
//
//    }










































//public class Main {
//
//    static int [] dx = {1, -1, 0 ,0};
//    static int [] dy = {0, 0, 1, -1};
//    static int n;
//    static int m;
//    static int endX;
//    static int endY;
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//        m = input.nextInt();
//        char[][] map = new char[n][m];
//        Queue<Pair> queue = new LinkedList<Pair>();
//        for (int i = 0;i < n;i++) {
//            map[i] = input.next().toCharArray();
//            for (int j = 0;j < map[i].length;j++) {
//                if (map[i][j] == 'S') {
//                    Pair pair = new Pair(i, j);
//                    queue.add(pair);
//                } else if (map[i][j] == 'E') {
//                    endX = i;
//                    endY = j;
//                }
//            }
//        }
//        System.out.println(BFS(map, queue));
//    }
//    public static boolean check(int x,int y) {
//        if (x >= 0 && x < n && y >= 0 && y < m)
//            return true;
//        return false;
//    }
//    public static int BFS(char[][] map, Queue<Pair> queue) {
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            while (size-- > 0) {
//                Pair top = queue.poll();
//                if (top.x == endX && top.y == endY)
//                    return top.step;
//                for (int i = 0;i < 4;i++) {
//                    int curX = top.x + dx[i];
//                    int curY = top.y + dy[i];
//                    Pair nextPair = new Pair(curX, curY);
//                    nextPair.step = top.step + 1;
//                    nextPair.fly = top.fly;
//                    if (check(curX, curY) && (map[curX][curY] == '.' || map[curX][curY] == 'E')) {
//                        queue.add(nextPair);
//                        map[curX][curY] = 'X';
//                    }
//                }
//                int flyX = n - 1 - top.x;
//                int flyY = m - 1 - top.y;
//                if (check(flyX, flyY) && top.fly < 5 && (map[flyX][flyY] == '.' || map[flyX][flyY] == 'E')) {
//                    Pair pair = new Pair(flyX, flyY);
//                    pair.step = top.step + 1;
//                    pair.fly = top.fly + 1;
//                    queue.add(pair);
//                    map[flyX][flyY] = 'X';
//                }
//            }
//        }
//        return -1;
//    }
//}
//class Pair {
//    int x;
//    int y;
//    int step;
//    int fly;
//    public Pair(int x,int y) {
//        // TODO Auto-generated constructor stub
//        this.x = x;
//        this.y = y;
//    }
//}
//
//
//static int mod = 1000000007;
//
//public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println((pow(n - 1) * n) % mod);
//        }
//
//public static long pow(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        long half = pow(n / 2);
//        if (n % 2 == 0) {
//            return (half * half) % mod;
//        } else {
//            return (half * half * 2) % mod;
//        }
//
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        //接收行列值
//        int row = scanner.nextInt();
//        int col = scanner.nextInt();
//
//        //起始
//        int r_start = -1;
//        int c_start = -1;
//        //结束
//        int r_end = -1;
//        int c_end = -1;
//
//        //初始化地图
//        char[][] data = new char[row][col];
//        for(int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                data[i][j] = ' ';
//            }
//        }
//
//        //地图赋值，并标记开始结束
//        for (int i=0;i<row;i++){
//            String temp = scanner.nextLine();
//            for (int j=0;j<col;j++){
//                //地图赋值
//                data[i][j] = temp.charAt(j);
//                //标记行列
//                if(temp.charAt(j) == 'S'){
//                    r_start = i;
//                    c_start = j;
//                }
//                if(temp.charAt(j) == 'E'){
//                    r_end = i;
//                    c_end = j;
//                }
//            }
//        }
//
//        //定义dp数组
//        int[][] dp = new int[row][col];
//        for(int i = r_start;i<r_end;i++){
//            for (int j=c_start;j<c_end;j++){
//
//            }
//        }
//
//    }

//    //排列组合问题，1*Cn1 + ...... n*Cnn
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //输入人数
//        long num = scanner.nextLong();
//        //输出方案数
//        long sum  = 0;
//        for(long j=1;j<=num;j++){
//            sum = (long) ((sum + j * ( ( getSum(num) / ( getSum(num-j) * getSum(j) ) ) )) % (Math.pow(10,9) + 7));
//        }
//        System.out.println( sum );
//
//    }
//    //计算阶乘
//    public static long getSum(long n){
//        long sum  = 1;
//        for(long i=1;i<=n;i++){
//            sum = sum * i;
//        }
//        return sum;
//    }

