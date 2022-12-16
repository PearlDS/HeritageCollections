import java.util.Objects;

public class ChocolatNoisettes extends Chocolat{

    private String typeNoisettes;


    public ChocolatNoisettes() {

    }

    public ChocolatNoisettes(String name, double price, String typeNoisettes) {
        super(name, price);
        this.typeNoisettes = typeNoisettes;
    }

    public String getTypeNoisettes() {
        return typeNoisettes;
    }

    public void setTypeNoisettes(String typeNoisettes) {
        this.typeNoisettes = typeNoisettes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChocolatNoisettes)) return false;
        if (!super.equals(o)) return false;
        ChocolatNoisettes that = (ChocolatNoisettes) o;
        return Objects.equals(getTypeNoisettes(), that.getTypeNoisettes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeNoisettes());
    }

    @Override
    public String toString() {
        return "ChocolatNoisettes{" +
                "typeNoisettes='" + typeNoisettes + '\'' +
                '}'+ super.toString();
    }
}
