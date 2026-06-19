
import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args){

        Scanner m = new Scanner(System.in);

        System.out.println("Enter the number of elements :");
        int n = m.nextInt();

        ArrayList<Integer> li = new ArrayList<>();

        for(int i = 0; i < n; i++){
            li.add(m.nextInt());
        }
        li.stream()
                .sorted()
                .forEach(System.out::println);

        long c_value = li.stream()
                .count();

        System.out.println("Count of elements in the list is :" + c_value);

        System.out.println("Distinct elements :");

        li.stream()
                .distinct()
                .forEach(System.out::println);


        Set<Integer> s = li.stream()
                .filter(x -> x > 5)
                .collect(Collectors.toSet());
        System.out.println("SET is :");
        System.out.println(s);

        li.stream()
                .map(y -> y * 10)
                .forEach(System.out::println);



    }
}
