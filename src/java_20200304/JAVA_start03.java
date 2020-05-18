package java_20200304;

public class JAVA_start03 {

    public static void testValue(double x){
        x = x+3;
    }

    public static void main(String[] args) {
        //JAVA总是按值调用，方法得到的是所有参数值的一个副本，方法不能修改传递给它的任何参数变量的内容

        //1.方法不能修改基本数据类型的参数（数值和布尔值）
        double x = 0.3;
        System.out.println(x);
        testValue(x);
        System.out.println(x);
        //2.方法可以改变对象参数的状态
        //3.方法不能让一个对象参数引用一个新的对象

        //重载，如果多个方法出现相同的名字不同的参数，则出现重载
        //方法的签名：指定方法名以及参数类型

        /*  调用构造器处理步骤
        *   1）如果构造器调用了另一个构造器，则基于所提供的参数执行第二个构造器
        *   2）否则
        *       a）所有数据字段初始化为默认值（0，false,null）
        *       b) 按照在类声明中出现的顺序，执行所有字段初始化方法和初始化块
        *   3）执行构造器的主体代码
        * */

        //包的意义：确保类名唯一性

        //静态导入  import允许导入静态方法和静态字段

    }



}
