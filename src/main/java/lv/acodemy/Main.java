package lv.acodemy;

public class Main {
    public static void main(String[] args) {

        //One-line comment

        /*
        This is
        multi-line comment
         */
        //Primitive data types

        //double - floating numbers
        double pi = 3.14;
        System.out.println(pi);

        // float - floating number

        float weight = 78.34f;
        System.out.println(weight);

        // int (integer)
        int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

        // char
        char myFirstNameChar = 'K';
        System.out.println(myFirstNameChar);

        // byte
        byte age = 28;
        System.out.println(age);

        // booleon is , has
        boolean isSummer = true;
        System.out.println(isSummer);
        boolean isWinter = false;
        System.out.println(isWinter);

        //String

        String name = "Ksenija";
        String surname = "Kuzmicka";
        System.out.println(name + surname);
        System.out.println(name + " " + surname);
        System.out.printf("My name is: %s. My surname is: %s\n", name, surname);
        System.out.println(String.format("My name is: %s. My surname is: %s", name, surname));

        //Operator

        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        double d = 20.54;
        double e = 9.61;
        double f = d - e;
        System.out.println(f);
        // 10 + 5 - 9.61
        System.out.println(a + b - e);

        int x = 10;
        int y = 10 % 4;
        System.out.println(y);























    }
}