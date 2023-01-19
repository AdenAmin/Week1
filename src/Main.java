import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what's your name");
        String name = input.nextLine();
        System.out.println(name);


        System.out.println("Hello World");
        int age = 18;
        double gpa = 3.5;
        boolean isRaining= false;

        System.out.println(age + "|"+ gpa +"|"+ isRaining);

        String city = "Columbus";
        System.out.println(city);
        System.out.println(city.toUpperCase());

        int dailyHighs[] = {35, 26, 43,85,99};
        System.out.println(dailyHighs[0]);
        System.out.println(dailyHighs[1]);
        System.out.println(dailyHighs[2]);
        System.out.println(dailyHighs[3]);
        System.out.println(dailyHighs[4]);

        for(int i = 0; i<5; i++){
            System.out.println(dailyHighs[i]);
        }

        int sum = 3+2;
        System.out.println(sum );
        double quotient = 10.0/4.0;
        System.out.println(quotient);

        int i = 1;
        int result = ++i;

        System.out.println(i);
    }
}