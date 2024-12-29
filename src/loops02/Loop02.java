package loops02;

public class Loop02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }

        System.out.println("while wala");
        int j = 0;
        while (j < 5) {
            System.out.println("Hello, World!");
            j++;
        }

        System.out.println("do wala");
        int k = 0;
        do {
            System.out.println("Hello, World!");
            k++;
        } while (k < 5);

        System.out.println("for wala");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
