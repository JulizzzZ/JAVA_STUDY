package java_20200304;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class JAVA_start_fanshe {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cl = Class.forName("java.util.List");
        System.out.println(Modifier.toString(cl.getModifiers()));
        Field[] fields = cl.getDeclaredFields();
        for (Field f:fields
             ) {
            System.out.println(f.getName());
        }
        Method[] methods = cl.getDeclaredMethods();
        for (Method m :
                methods) {
            System.out.println(m.getName());
        }
    }
}
