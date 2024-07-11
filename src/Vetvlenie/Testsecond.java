package Vetvlenie;

public class Testsecond {
    public static void TruD (int number ) {

        if (number == 0) {
            System.out.println("Could not div by 0.");
        } else if (number < 0)
            System.out.println("This is negative number");

    }

    public static void main(String[] args) {
        Testsecond.TruD (-1);
        Testsecond.TruD(4);
        Testsecond.TruD(0);
    }
}
