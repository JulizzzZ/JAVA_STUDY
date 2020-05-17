package java_20200304;

import javafx.css.Size;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class JAVA_start02 {
    public static void main(String[] args) throws IOException {
//        //String用法
//        //subString   提取字符串，截位
//        String str = "aklsxvvda";
//        String subStr = str.substring(0,2);
//        System.out.println("截位后的字符串："+subStr);
//
//        //JAVA中是不能修改字符串中的单个字符的，需要截取拼接完成这个操作
//
//        //检测字符串是否相等  equals
//        String copyStr = "aklsxvvda";
//        System.out.println(str.equals(copyStr));
//
//        //不要使用==来判断字符串是否相等，==只会判断两个字符串是否存放在同一个位置上
//
//        //空串为""，是个长度为0的字符串,串长度为0，内容为空
//        String testStr = "";
//        System.out.println(testStr.length());
//
//        //null代表目前没有任何对象与该变量关联
//        //JAVA字符串有char值序列组成
//
//        //判断字符串是否由空格组成
//        String str1 = "   ";
//        System.out.println(str1.isBlank());

        /*---------------------------------------------------------*/
        //StringBuilder
//        StringBuilder builder = new StringBuilder();//构建一个空的字符串构建器
//        //每次需要添加内容时，就用append方法添加，这样时间耗时少，不浪费空间
//        builder.append("TEST");
//        builder.append(" ");
//        builder.append("String BUilder!");
//        System.out.println(builder.toString());

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("你是谁？");
//        String name = scanner.nextLine();
//        System.out.println("我的名字叫："+name);

        //读取文件,以指定编码
//        Scanner in = new Scanner(Path.of("test.txt"), StandardCharsets.UTF_8);

        /*
        *   JAVA中块的概念
        *   若干条JAVA语句组成的语句即为块，并且用{}括起来
        *   条件语句
        *   if(...)...else
        *   while(...)
        *   do...while(...)
        *   for(确定循环，迭代)
        *   switch（多重选择） case标签可以为char，byte，short，int，从JAVA7，还可以是字符串
        *
        * */

        //大数BigInteger,BigDecimal,可以处理任意长度的数值
        //valueof可以将普通数值转换为大数
//        BigDecimal bigDecimal = BigDecimal.valueOf(5.66);
//        System.out.println(bigDecimal);
//        //大数不能用常用的算数运算符，需要用add，multiply方法
//        BigDecimal big2 = BigDecimal.valueOf(5.22);
//        System.out.println("大数运算："+bigDecimal.add(big2));

        /*
        *   数组
        *   数组存储相同类型值的序列（集合）
        *   一旦创建了数组，就不能改变它的长度了
        *   允许长度为0的数组，与null不同
        * */

//        int[] arr_int = new int[]{1,2,3,4,5,6,7,8,9};
//        System.out.println("数组长度为："+arr_int.length);
//        //快速打印数组成员
//        System.out.println(Arrays.toString(arr_int));

        //foreach循环
//        for (int a:arr_int){
//            System.out.println(a);
//        }

        //数组拷贝
        //1.直接赋值
        //int[] copy1 = arr_int;
        //2.copyOf
        //int[] copy2 = Arrays.copyOf(arr_int,arr_int.length);

        //数组排序  sort
//        int[] test_arr = new int[1000];
//        for (int i = 0 ;i<test_arr.length;i++){
//            test_arr[i] = i+1;
//            test_arr[i] = i+1;
//        }
//        int[] arr_sort = new int[6];
//        for(int i=0;i<arr_sort.length;i++){
//            int r = (int) (Math.random()*1000);
//            arr_sort[i] = r;
//        }
//        Arrays.sort(arr_sort);
//        System.out.println("排序后数组："+Arrays.toString(arr_sort));
    }
}























