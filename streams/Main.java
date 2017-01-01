import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ola on 2017-01-01.
 */
public class Main {

    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> firstUpperCaseList = new ArrayList<>();
        //First way
      /*  topNames2015.forEach(name ->
                firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
        Collections.sort(firstUpperCaseList);
        firstUpperCaseList.forEach(s -> System.out.println(s));*/

        //Second way
       // firstUpperCaseList.sort(String::compareTo);
      //  firstUpperCaseList.forEach(System.out::println);

        //Third way with lambda
        /*topNames2015.forEach(name ->
            firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));
            firstUpperCaseList.sort((s1,s2) -> s1.compareTo(s2));
            firstUpperCaseList.forEach(s-> System.out.println(s));*/

        //Fourth way using streams
        /*topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
               //.filter(name -> name.startsWith("A"))
                .forEach(System.out::println);*/

       //Peek
       topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count();
    }
}
