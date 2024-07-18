package Vetvlenie;

public class Zagran {
    public static void Poezdka (boolean passport) {
        System.out.println("У клиента есть загранник");
        if (passport) {
            System.out.println("Полетели зарубеж");
        } else {
            System.out.println("Путешествуем по России");
        }

    }
    public static void main(String[] args) {
        Zagran.Poezdka(true);
        Zagran.Poezdka(false);
    }

}