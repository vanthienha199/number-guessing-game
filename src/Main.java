import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guessing guess = new Guessing();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Guess the number I am thinking (0-99): ");
                int num = sc.nextInt();
                String result = guess.guessing(num);
                System.out.println(result);
                if (result.equals("You are correct")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
