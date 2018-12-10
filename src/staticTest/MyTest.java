package staticTest;

public class MyTest {
    //静态属性和静态方法是否可以被继承？是否可以被重写？以及原因？
    public static void main(String[] args) {
        Two one = new Two();
        one.oneFn();
        String one_1 = One.one_1;
        System.out.println("One.one_1>>>>>>>" + one_1);
        String one_12 = one.one_1;
        System.out.println("one.one_1>>>>>>>" + one_12);
    }
}