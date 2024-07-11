package Vetvlenie;

public class Ycheba {
    public static void TruD (int number ) {

        if (number == 0) {
            System.out.println("Could not div by 0.");
        } else if (number < 0)
        System.out.println("This is negative number");

    }

   public static void main(String[] args) {
    Ycheba.TruD (-1);
    Ycheba.TruD(4);
    Ycheba.TruD(0);
    }
}


