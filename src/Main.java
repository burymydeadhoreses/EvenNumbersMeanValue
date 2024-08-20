import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        for (int i = 1; i < 45; i++)
            numbers.add(i);

        var mean = numbers.stream()
                        .filter(num -> num % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .sum() /
                     numbers.stream()
                        .filter(num -> num % 2 == 0).count();

        System.out.println(mean);
    }
}