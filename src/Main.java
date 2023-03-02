import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Which one do you want to work Parallelepiped or Cylinder?");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            switch (a) {
                case "Parallelepiped":
                    try {
                        float height = Float.parseFloat(scanner.nextLine());
                        float length = Float.parseFloat(scanner.nextLine());
                        float width = Float.parseFloat(scanner.nextLine());
                        Parallelepiped p = new Parallelepiped(height, length, width);
                        System.out.println(p);
                        System.out.println("Area of parallelepiped: " + p.area());
                        System.out.println("Volume of parallelepiped: " + p.volume());

                    } catch (NumberFormatException e) {
                        throw new MyException();
                    }
                    break;
                case "Cylinder":
                    try {
                        float radius = Float.parseFloat(scanner.nextLine());
                        float heighte = Float.parseFloat(scanner.nextLine());
                        float PI = Float.parseFloat(scanner.nextLine());
                        Cylinder c = new Cylinder(radius, heighte, PI);
                        System.out.println(c);
                        System.out.println("madina of Cylinder " + c.madina());
                        System.out.println("kanush of Cylinder " + c.kanush());

                    } catch (ArithmeticException e) {
                        throw new MyException();
                    }break;
            }

        }


    }
}