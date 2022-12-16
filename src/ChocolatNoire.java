public class ChocolatNoire extends Chocolat {

    public ChocolatNoire() {
    }

    public ChocolatNoire(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "ChocolatNoire{}"+ super.toString();
    }
}
