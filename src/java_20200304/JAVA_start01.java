package java_20200304;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class JAVA_start01 {
    public static void main(String[] args){
        /*
        *   Title ：字符编码
        *   Author：JulizzzZ
        *   1.ASCII码 用一个字节来存储常用符号，8位bit
        *   2.拓展编码（加字节）GBK，GB232...     GB18030>GBK>GB2312
        *   3.Unicode编码：存储所有字符    UTF-8，UTF-16...
        * */

       System.out.println("hellow");

        /*JAVA数据类型
        一共有8种数据类型
        int   4字节
        short 2字节
        long  8字节
        byte  1字节
        */
        System.out.println(0B1001);//JAVA7开始 加上前缀0b或者0B就可以表示2进制数

        int i= (int) 1.5;
        System.out.println(i);

        //数值计算中如果需要0误差，需要使用BigDecimal

        //char中/u为转义符
        System.out.println('\u2122');
        //转义符号
        //  \b  退格，\t制表，\n换行，\r回车，\"双引号，\'单引号，\\反斜杠

        //JAVA10开始可以使用var，无需指定类型
        var ix = 2;

        //三目运算
        System.out.println(4>2?"c":"cs");
    }
}