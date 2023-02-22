import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        triangle tri = new triangle();
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        int b = tri.Triangle(a);
        System.out.println("Треугольное число = " + b + "\n");
    }
}