import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    static Map<String, Country>   countryList = new HashMap<>();

public static void main(String[] args) {

    List<Integer> integerList = Arrays.asList(10, 20, 49, 89);

    //Integers
   /* integerList.stream()
            .filter(i->i.intValue()>20)
            .forEach(i->System.out.println(i));*/

    //Strings
   /* List<String> stringList = Arrays.asList("sandeep", "Manvir", "prakash", "Tim","aja");
    stringList.stream()
            .map(s -> s.toLowerCase())
            .sorted()
            .forEach(s -> System.out.println(s));

    */

    List<User> users = Arrays.asList(new User(1,"Apple",10),
                                    new User(2,"Ball",20),
                                    new User(3,"cat",30));

    // Adding Sum - One way
        System.out.println("// Adding Sum - One way");
        System.out.println(
            users.stream()
                    .mapToInt(user -> user.value)
                    .sum()
            );


    //Adding Sum - 2nd approach

    System.out.println("// Adding Sum - 2nd way");
        int sum =0;
        sum = users.stream().map(t->t.value).collect(Collectors.summingInt(Integer::intValue));

        System.out.println("adding to sum "+sum);


    //Finding highest Value
        System.out.println("Finding highest Value");
        System.out.println(users.stream().mapToInt(user -> user.value).max());


    //Finding Avg value
    System.out.println("//Finding Avg value");
    System.out.println(users.stream()
                .mapToInt(user -> user.value)
                .average());

    ////Get any score which could be divisible by 3, and print them out.

    System.out.println(
    users.stream()
            .filter(p->p.value%3==0)
            .count());

    /**
     * MorganStanley Interview on 25/Apr/2021
     */


    countryList.put("America", new Country(400,"America"));
    countryList.put("Brazil", new Country(600,"Brazil"));
    countryList.put("Canada", new Country(100,"Canada"));
    countryList.put("France", new Country(50,"France"));

    List<Country> countries = getCountryPopulation(3);

    countries.stream().forEach(c->System.out.println(c.getCountryName() +"-" +c.getPopulation()));
}

    private static List<Country> getCountryPopulation(int i) {
        return countryList.values().stream()
                .limit(i)
                .collect(Collectors.toList());


    }


}
