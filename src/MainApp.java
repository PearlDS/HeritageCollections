import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        ChocolatNoire chocolatNoire = new ChocolatNoire("Cote d'or", 2.99);
        ChocolatNoire chocolatNoire2 = new ChocolatNoire("Delicata", 1.99);

        ChocolatBlanc chocolatBlanc = new ChocolatBlanc("Galak", 3.99);
        ChocolatBlanc chocolatBlanc2 = new ChocolatBlanc("Delicata", 1.99);

        ChocolatNoisettes chocolatNoisettes = new ChocolatNoisettes("Snickers", 0.99, "arachides");
        ChocolatNoisettes chocolatNoisettes2 = new ChocolatNoisettes("Delicata", 1.99, "speculoos");

        List<Chocolat> chocolats = new ArrayList<>();
        chocolats.add(chocolatNoisettes);
        chocolats.add(chocolatNoisettes2);
        chocolats.add(chocolatNoire2);
        chocolats.add(chocolatNoire);
        chocolats.add(chocolatBlanc);
        chocolats.add(chocolatBlanc2);

        chocolats.add(0,chocolatNoire);
        chocolats.remove(new Chocolat("Cote d'or", 2.99));
        chocolats.remove(4);

        for(Chocolat chocolat:chocolats){
            System.out.println(chocolat);
        }

        System.out.println("-------");

        Set<Chocolat> chocolatSet = new HashSet<>();
        chocolatSet.addAll(chocolats);
        chocolatSet.remove(chocolatBlanc);


        for(Chocolat chocolat:chocolatSet){
            System.out.println(chocolat);
        }

        System.out.println("-----");
        Queue <Chocolat> chocolatQueue = new LinkedList<>();
        chocolatQueue.addAll(chocolatSet);

        System.out.println(chocolatQueue.size());
       while (chocolatQueue.size()>0){
           System.out.println(chocolatQueue.poll());
       }
        System.out.println(chocolatQueue.size());

        System.out.println("------");

        Map<Integer, Chocolat> chocolatMap = new HashMap<>();
        chocolatMap.put(1, chocolatBlanc);
        chocolatMap.put(2000, chocolatNoisettes2);
        chocolatMap.put(3,chocolatNoire);
        chocolatMap.put(1, chocolatBlanc2);

        for (Integer key:chocolatMap.keySet()){
            System.out.println(key+ ": "+ chocolatMap.get(key));
        }
        chocolatMap.remove(2000);



    }
}
