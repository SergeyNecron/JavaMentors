package Generic;

import java.util.Objects;

//Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
//        Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
//        С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:
//        Pair<Integer, String> pair = Pair.of(1, "hello");
//        Integer i = pair.getFirst(); // 1
//        String s = pair.getSecond(); // "hello"
//        Pair<Integer, String> pair2 = Pair.of(1, "hello");
//        boolean mustBeTrue = pair.equals(pair2); // true!
//        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
//        Пожалуйста, не меняйте модификатор доступа класса Pair. Для корректной проверки класс должен иметь пакетную видимость.

final class Pair<T, S> {
    T t;
    S s;

    private Pair(T t, S s) {
        this.t = t;
        this.s = s;
    }

    static <T, S> Pair<T, S> of(T t, S s) {
        return new Pair<>(t, s);
    }

    T getFirst() {
        return t;
    }

    S getSecond() {
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(t, pair.t) &&
                Objects.equals(s, pair.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, s);
    }
}
