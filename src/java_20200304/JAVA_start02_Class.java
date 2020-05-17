package java_20200304;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Objects;

public class JAVA_start02_Class {
    public static void main(String[] args) {
        //  Class类,对象
        // 对象变量没有实际包含一个对象，它只是引用一个对象
        // 任何对象变量的值都是对存储在另外一个地方对某个对象对引用
        // new操作符返回的也是一个引用

        //更改器方法   调用此方法后，对象的状态会改变
        //访问器方法   只访问对象而不修改对象的方法

        //构造器与类同名
        //每个类可以有一个以上的构造器（有参构造，无参构造）
        //构造器可以有参数，也可以没有参数
        //构造器没有返回值
        //构造器总能伴随new调用
        //JAVA对象都是在堆中构造对象的

        //var关键字只能用于方法中的局部变量

        //日历例子
//        LocalDate date = LocalDate.now();//获得当前日期
//        int month = date.getMonthValue();
//        int today = date.getDayOfMonth();
//        System.out.println("月："+month);
//        System.out.println("日："+today);
//        System.out.println("日期："+date);
//
//        date = date.minusDays(today - 1);//初始化当月一号
//        System.out.println("日期："+date);
//
//        DayOfWeek weekday = date.getDayOfWeek();
//        System.out.println(weekday);
//        int value = weekday.getValue();//1是星期一，2是星期二...
//
//        System.out.println("  Mon Tue Wed Thu Fri Sat Sun");
//        for(int i=1;i<value;i++)
//            System.out.print("    ");
//        while(date.getMonthValue() == month){
//            //判断是否是当天
//            System.out.printf("%4d",date.getDayOfMonth());
//            if(date.getDayOfMonth() == today){
//                System.out.print("*");
//            }else{
//                System.out.print("");
//            }
//            if(date.getDayOfWeek().getValue() == 7) System.out.println();
//            date = date.plusDays(1);
//        }

        /*------------------------------------------------------------*/

        //对null值对处理
        //1.将null转换为适当对非null值
        //例如：学生一定要有名字，当姓名为null时，定义名字为unknown
        String name = null;
        if(name == null )
            name = "unknown";//else name = xxx;
        //JAVA9中提供了一个方法
        name  = Objects.requireNonNull(name,"unknown");
        //2.拒绝null值
        //判断是否为null，为null报错
        if(name == null)
            System.out.println("name 不能为null！");

        //在每个方法中，关键字this都指示隐示参数

    }
}
