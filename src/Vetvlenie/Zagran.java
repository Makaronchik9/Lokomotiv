package Vetvlenie;

public class Zagran {
    public static void Poezdka (boolean passport) {

        System.out.println("A client has foreign passport : " + passport);
        if (passport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }

            public static void main(String[] args) {
        Zagran.Poezdka(true);
        Zagran.Poezdka(false);
    }

}