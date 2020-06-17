package java_20200304;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class JAVA_start09 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //使用反射在运行时分析对象
        //setAccessible 覆盖JAVA的访问控制
    var student = new Student("Tom","Suzhou",3,"MiaoQiao");
    Class cl = student.getClass();
    Field f = cl.getDeclaredField("age");
    f.setAccessible(true);
    Object obj = f.get(student);
    System.out.println(obj.toString());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);

        Class cl1 = arrayList.getClass();
        System.out.println(cl1.isArray());
    }
}
