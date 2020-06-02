package java_20200304;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

public class JAVA_start08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //反射分析类的能力
        //reflect包中Field,Method,Contructor分别描述类的字段，方法和构造器

        /*
        *   JAVA反射机制：
        *   是在运行状态中，对于任意一个类，都能知道这个类对应的所有属性和方法
        *   对于任意一个对象，都能调用它的任意方法和属性
        *   这种动态获取信息以及动态调用对象方法的功能称为JAVA的反射机制。
        * */

        /*
        *   Field类          代表类的成员变量
        *   Method类         代表类的方法
        *   Constructors类   代表类的构造方法
        *  */
        //根据类名获取类
        Class cl = Class.forName("java.util.Date");
        System.out.println(cl.toString());
        //获取父类
        Class supercl = cl.getSuperclass();
        System.out.println(supercl.toString());

        //getModifiers  ----- 获取一个类的修饰符
        String modifierString = Modifier.toString(cl.getModifiers());
        System.out.println(modifierString);

//        getMethods(cl);
//        getFields(cl);
        getConstructors(cl);
    }

    //通过反射获取指定类所有的方法名称以及方法修饰符
    public static void getMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();
        for (Method m:methods
             ) {
            System.out.println("Method:"+m.getName()+Modifier.toString(m.getModifiers()));
        }
    }

    //通过反射获取指定类所有的属性
    public static void getFields(Class cl){
//        Field[] fileds = cl.getFields();
        //getFields和getDeclaredFields的区别：
        //getFields是获得某个类所有公共（public）的字段
        //getDeclaredFields是获得某个类所有声明的字段
        Field[] fields = cl.getDeclaredFields();
        System.out.println(fields.length);
        for (Field f:fields
             ) {
            System.out.println("Field:"+f.getName()+Modifier.toString(f.getModifiers()));
        }
    }

    //通过反射获取指定类的构造方法
    public static void getConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor c:constructors
             ) {
            System.out.println("Constructors:"+c.getName()+Modifier.toString(c.getModifiers()));
        }
    }
}
