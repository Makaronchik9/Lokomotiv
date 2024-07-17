package Vetvlenie;

public class Bot {


    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            result = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            result = "Bye.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = Bot.answer("Hi, Bot.");
        System.out.println(result);
        result = Bot.answer("Bye.");
        System.out.println(result);
    }
}

