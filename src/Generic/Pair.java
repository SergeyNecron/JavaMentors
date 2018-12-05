package Generic;

import java.util.Objects;

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
