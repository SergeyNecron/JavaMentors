package Functions;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        Object o1, o2;
        o1 = "fdsfsd";
        o2 = "fdsfsdf";
        o2 = new ArrayList();
        TestMain test = new TestMain();
        //2)
        test.testFunc(((x, y) -> x.toString() + y.toString()), o1, o2);
        //3)
        test.testFunc((new MyFunc<Object>() {
            @Override
            public Object func(Object x, Object y) {
                return x.toString() + y.toString();
            }
        }), o1, o2);
        //4)
        test.testFunc((TestMain::func), o1, o2);
    }

    //4
    private static Object func(Object x, Object y) {
        return x.toString() + y.toString();
    }


    public <T> void testFunc(MyFunc<T> f, T v1, T v2) {
        System.out.println(f.func(v1, v2));

    }
}
