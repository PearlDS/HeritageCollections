import java.util.Comparator;

public class ChocolatPriceSorter implements Comparator<Chocolat> {
    @Override
    public int compare(Chocolat o1, Chocolat o2) {
        return (int)(o1.getPrice()-o2.getPrice());
    }
}
