import java.util.*;

public class Randoms implements Iterable<Integer> {

    private Random random;
    private int min, max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public Random getRandom() {
        return random;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return getRandom().nextInt(getMin(), getMax() + 1);
            }
        };
    }
}
