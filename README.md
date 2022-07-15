# Collectors Lab

## Instruction

Write a method called `multiplySquaresOfNumbers` that takes in a `List<Integer>`
and returns the

product of squares of the integer numbers as a `long`. Use the `reducing` method
in the `Collectors` class for this problem.

## Examples

```java
input: 0 1 2 3 4
output: 0

input: 1 2 3
output: 36

input: 10 15 20
output: 9000000
```

## Starter Code

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {

		// modify this method
    public static long multiplySquaresOfNumbers(List<Integer> numbers) {
        // your code here
        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String val : values) {
            numbers.add(Integer.parseInt(val));
        }

        long val = multiplySquaresOfNumbers(numbers);

        System.out.println(val);
    }
}
```
