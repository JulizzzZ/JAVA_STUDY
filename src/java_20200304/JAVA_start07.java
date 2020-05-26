package java_20200304;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class JAVA_start07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //ArrayList可以自动调整数组容量（有类型参数的范型类）
        //如果调用add而内部数组已经满了，数组列表就会自动创建一个更大的数组，并将所有的对象从较小的数组中拷贝到较大的数组中。
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        //size()方法返回数组的元素个数
        System.out.println(arr.size());
        //ArrayList只能使用get和set方法访问元素
        arr.get(0);
        arr.set(2,"dd");
        //set方法只能用来替换已存在的元素，不能进行新加，否则会报数组越界的错误！新加元素需使用add
        System.out.println("-------删除前------");

        for (String str : arr) {
            System.out.println(str);
        }
        //删除指定索引位置的元素使用remove
        arr.remove(1);
        System.out.println("-------删除后------");
        for (String str : arr) {
            System.out.println(str);
        }

        //定义一个整形数组列表，尖括号<>中不能是基本类型，要使用基本类型的包装类，例如Integer
        ArrayList<Integer> int_arr = new ArrayList<Integer>();

        //装箱和拆箱是编译器做的，不是虚拟机

        //能够分析类能力的程序称为反射
        //运行时分析类的能力
        //运行时检查对象
        //实现范型数据操作代码
        //利用Method对象

        //使用静态方法获取class对象
        String classname = "java.util.Random";
        Class cls = Class.forName(classname);//返回一个class对象，表示名为classname的类

        //Class类是一个范型类，例如Emloyee.class的类型是Class<Emloyee>

        //getConstructor获得一个构造器，newInstance构造一个实例
        Object obj = cls.getConstructor().newInstance();

    }
}
