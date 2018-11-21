import java.util.Arrays;
import java.util.Scanner;

public class InputTest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");
        int[] numbers = Arrays.asList(numberStrings).stream().mapToInt(Integer::parseInt).toArray();

        for (int i: numbers) {
            System.out.println(i);
        }
    }
}
