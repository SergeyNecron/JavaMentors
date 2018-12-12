package Functions;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionMain {
    public static <T, U> Function<T, U> ternaryOperator(

            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }

    public static void main(String[] args) {
        Predicate<Integer> pre = x -> x < 0;
        System.out.println(pre.test(100));
        System.out.println(pre.test(-100));

        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        System.out.println(condition.test(null));
        System.out.println(condition.test(77));
        System.out.println(ifTrue.apply(454564));
        System.out.println(ifFalse.apply("dsa"));

        System.out.println(safeStringLength.apply(null));
        System.out.println(safeStringLength.apply("ds"));
    }
}
