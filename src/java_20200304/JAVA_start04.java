package java_20200304;

public class JAVA_start04 {
    public static void main(String[] args) {
        //设置类路径
        //java -classpath=.....

        //jar文件,jar文件是压缩文件，使用zip压缩格式
        //在默认的JDK安装中，jar工具位于jdk/bin目录下
        //jar cvf jarFilename file1 file2...    类似于tar

        //类的设计技巧
        //1.一定要保证数据私有，不能破坏封装性
        //2.一定要对数据进行初始化，JAVA不会初始化局部变量
        //3. 不要在类中使用过多的基本数据类型
        //4. 不是所有的字段都需要单独的字段访问器和字段更改器
        //5. 分解有过多职责的类
        //6. 类名和方法名要体现他们的职责

    }
}
