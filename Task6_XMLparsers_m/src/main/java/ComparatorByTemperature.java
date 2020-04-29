
import java.util.Comparator;

public class ComparatorByTemperature implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Flower)o1).getGrowingTips().getTemperature() - ((Flower)o2).getGrowingTips().getTemperature();
    }

}
