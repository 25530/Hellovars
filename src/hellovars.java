import java.util.Scanner;

public class hellovars {

    public static void main (String[] args) {

        String name = "Sam";
        String surname ="Harwig";
        int leerjaar = 1;
        double getal = 2.2;

        System.out.println(name + " " + surname);

        System.out.println("Hello Variables");

        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println(name  );



    }

}