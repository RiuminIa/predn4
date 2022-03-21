package zviera;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ZverCompare implements Comparator<Zver> {
    @Override
    public int compare(Zver o1, Zver o2) {
        return o1.getMeno().compareTo(o2.getMeno());
    }

    @Override
    public Comparator<Zver> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Zver> thenComparing(Comparator<? super Zver> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Zver> thenComparing(Function<? super Zver, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Zver> thenComparing(Function<? super Zver, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Zver> thenComparingInt(ToIntFunction<? super Zver> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Zver> thenComparingLong(ToLongFunction<? super Zver> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Zver> thenComparingDouble(ToDoubleFunction<? super Zver> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
