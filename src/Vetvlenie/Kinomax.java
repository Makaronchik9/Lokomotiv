package Vetvlenie;

public class Kinomax {
    public static void film (int age) {
        System.out.println("The age of the customer is : " + age);

        if (age >=18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you");

        }

    }

        public static void main(String[] args) {

        Kinomax.film(21);
        Kinomax.film(16);

    }

}
