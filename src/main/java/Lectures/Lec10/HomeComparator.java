package Lectures.Lec10;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class HomeComparator implements Comparator<Home> {
    @Override
    public int compare(Home o1, Home o2) {
        if(o1.getPrice() < o2.getPrice()){
            return 1;
        } else if (o1.getPrice() > o2.getPrice()){
            return -1;
        }

        return 0;
    }

    @Override
    public Comparator<Home> reversed() {
        return null;
    }

    @Override
    public Comparator<Home> thenComparing(Comparator<? super Home> other) {
        return null;
    }

    @Override
    public <U> Comparator<Home> thenComparing(Function<? super Home, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Home> thenComparing(Function<? super Home, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Home> thenComparingInt(ToIntFunction<? super Home> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Home> thenComparingLong(ToLongFunction<? super Home> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Home> thenComparingDouble(ToDoubleFunction<? super Home> keyExtractor) {
        return null;
    }
}
