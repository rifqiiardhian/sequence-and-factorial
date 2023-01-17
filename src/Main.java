import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int loop;
        loop = 1;

        do {
            int start = 1, print = 0, diff = 0;

            while (print < 2 || print > 10) {
                System.out.println("");
                System.out.print("Masukkan banyak angka yang mau dicetak [2...10] : ");
                print = input.nextInt();
            }

            while (diff < 2 || diff > 9) {
                System.out.print("Masukkan beda masing-masing angka [2...9]       : ");
                diff = input.nextInt();
            }

            System.out.println("");
            System.out.println("Deret Aritmatika :");
            arithmetic(start, print, diff);

            System.out.println("");
            System.out.println("Deret Geometri :");
            geometric(start, print, diff);

            System.out.println("");
            System.out.println("Faktorial dari " +print+ " :");
            factorial(print);

            int loopExit;
            loopExit = 1;

            System.out.println("\n");

            do {
                System.out.print("Anda mau ulang [y/t] : ");
                String program = input.next();

                if (program.equals("y") || program.equals("Y")){
                    loopExit = 0;
                    loop++;
                } else if (program.equals("t") || program.equals("T")) {
                    loopExit = 0;
                    loop = 0;
                } else {
                    loopExit++;
                }
            } while (loopExit > 0);
        } while (loop > 0);
    }

    private static void arithmetic(int start, int qty, int diff) {
        int number;
        number = start;

        for (int i = 0; i < qty; i++) {
            System.out.print(number + " ");
            number = number + diff;
        }
    }

    private static void geometric(int start, int qty, int diff) {
        int number;
        number = start;

        for (int i = 0; i < qty; i++) {
            System.out.print(number + " ");
            number = number * diff;
        }
    }

    private static void factorial(int qty) {
        int res = 1;

        for (int i = qty; i >= 1; i--) {
            if (i > 1)
                System.out.print(i + " * ");
            else
                System.out.print(i + " = ");

            res = res * i;
        }

        System.out.print(res);
    }
}