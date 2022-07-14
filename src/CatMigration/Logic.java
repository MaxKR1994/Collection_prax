package CatMigration;

import java.util.*;

public class Logic {
    public static List<String> getCity(){
        List<String> city = new ArrayList<>();
        city.add("Berlin");
        city.add("Oslo");
        city.add("Paris");
        city.add("Praha");
        return city;
    }

    public static String getRandomCity(){
        return getCity().get(new Random().nextInt(4));
    }

    public static List<Cat> getCatList(){
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Luna","Barcelona"));
        cats.add(new Cat("Milo","Bratislava"));
        cats.add(new Cat("Loki","Vienna"));
        cats.add(new Cat("Charlie","Budapest"));
        return cats;
    }

    public static List<Cat> generateListOfTripCat(){
        List<Cat> tripCat = getCatList();
        for (Cat cats : tripCat) {
            cats.setCity(getRandomCity());
        }
        return tripCat;
    }

    public static void goOnATrip(){
        System.out.println("The cats have moved to other cities");
    }

    public static void getCatListBeforeTrip(){
        System.out.println("Cats name and location before travel:");
        System.out.println(getCatList());
    }

    public static void getCatListOnTrip(){
        System.out.println("Cats name and location on trip:");
        System.out.println(generateListOfTripCat());
    }

    public static void getCatLocation (List<Cat> cats){
        generateListOfTripCat();
        Map<String,String> mapOfCat = new HashMap<>();
        for (Cat cot : cats){
            mapOfCat.put(cot.getName(), cot.getCity());
        }
        System.out.println("Enter the name cat to find out where he is: ");
        Scanner sc = new Scanner(System.in);
        String catName = sc.nextLine();
        sc.close();
        System.out.println("Cat named: " + catName + " is located in " + mapOfCat.get(catName));

    }

}
