import java.util.Objects;

public class Chocolat implements Comparable<Chocolat>{

    private String name;
    private double price;

    public Chocolat() {
    }

    public Chocolat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chocolat)) return false;
        Chocolat chocolat = (Chocolat) o;
        return Double.compare(chocolat.getPrice(), getPrice()) == 0 && Objects.equals(getName(), chocolat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Chocolat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//    @Override
//    public int compareTo(Chocolat o) {
//        return (int)(this.getPrice()-o.getPrice());
//    }

    @Override
    public int compareTo(Chocolat o) {
        return this.getName().compareTo(o.getName());
    }
}
