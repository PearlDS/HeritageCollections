import java.util.*;

public class CollectionComparateursApp {
    public static void main(String[] args) {
        ChocolatNoire chocolatNoire = new ChocolatNoire("Cote d'or", 2.99);
        ChocolatNoire chocolatNoire2 = new ChocolatNoire("Delicata", 1.99);

        ChocolatBlanc chocolatBlanc = new ChocolatBlanc("Galak", 3.99);
        ChocolatBlanc chocolatBlanc2 = new ChocolatBlanc("Delicataa", 1.99);

        ChocolatNoisettes chocolatNoisettes = new ChocolatNoisettes("Snickers", 0.99, "arachides");
        ChocolatNoisettes chocolatNoisettes2 = new ChocolatNoisettes("Delicata", 1.99, "speculoos");

        List<Chocolat> chocolats = new ArrayList<>();
        chocolats.add(chocolatNoisettes);
        chocolats.add(chocolatNoisettes2);
        chocolats.add(chocolatNoire2);
        chocolats.add(chocolatNoire);
        chocolats.add(chocolatBlanc);
        chocolats.add(chocolatBlanc2);
        chocolats.add(chocolatNoire);
        chocolats.add(chocolatBlanc);
        chocolats.add(chocolatBlanc2);
        chocolats.add(chocolatNoisettes);
        chocolats.add(chocolatNoisettes2);

        chocolats.sort(Comparator.comparing(Chocolat::getName));

        for(Chocolat chocolat:chocolats){
            System.out.println(chocolat);

            if(chocolat instanceof ChocolatBlanc){
                System.out.println("NJAM!");
                
            }
            if ((chocolat instanceof  ChocolatNoisettes)){
                System.out.println("KOFF KOFF");
            }

        }

        System.out.println("-------");

        Set<String> mots = new TreeSet<>();
        mots.add("vache");
        mots.add("pomme");
        mots.add("zebre");
        mots.add("Zebre");
        mots.add("Elephant");

        for (String mot: mots){
            System.out.println(mot);
        }
        System.out.println("-------");

        //Set<Chocolat> chocolatSet = new TreeSet<>(new ChocolatPriceSorter().reversed());
        Set<Chocolat> chocolatSet = new TreeSet<>(Comparator.comparing(Chocolat::getPrice).thenComparing(Chocolat::getName));
        chocolatSet.addAll(chocolats);

        for(Chocolat chocolat:chocolatSet){
            System.out.println(chocolat);
        }

        System.out.println("-------");
    }
}
