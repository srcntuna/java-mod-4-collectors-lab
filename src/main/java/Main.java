import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {

    // modify this method
    public static long multiplySquaresOfNumbers(List<Integer> numbers) {
        // your code here                                                1
        return numbers.stream().collect(Collectors.reducing(1,(x,y)->x*y*y)).longValue();

    }

    //ANOTHER SOLUTION

    //return numbers.stream().mapToLong(num -> num * num).reduce((a,b) -> a * b).getAsLong();



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String val : values) {
            numbers.add(Integer.parseInt(val));
        }

        long val = multiplySquaresOfNumbers(numbers);

        System.out.println(val);

        scanner.close();
    }
}