package secao8.application;

import secao8.entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("1 - Student");
        System.out.println("2 - Employee");
        System.out.println("3 - Rectangle");
        System.out.println("4 - Product");
        System.out.println("5 - Triangle");
        System.out.println("Exemplo: 3 Para acessar os calculos sobre Rectangle");
        System.out.println("===================");
        System.out.println("Digite apenas o valor correspondente ao lado: ");
        int enterCalc = sc.nextInt();


        switch (enterCalc) {
            case 1 -> student(sc);
            case 2 -> employee(sc);
            case 3 -> rectangle(sc);
            case 4 -> product(sc);
            case 5 -> triangle(sc);
            default -> System.out.println("Invalide Option");
        }

        sc.close();
    }

    private static Student student(Scanner sc){

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        return student;
    }

    private static Employee employee(Scanner sc){

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.next().toUpperCase();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Wich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println();
        System.out.print("Updated data: " + employee);

        return employee;
    }

    private static Rectangle rectangle(Scanner sc){

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectagle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println();
        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        return rectangle;
    }

    private static Product product(Scanner sc){

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " +product);

        System.out.print("Enter the number of products to be added in stock : ");
        product.addProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " +product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " +product);

        return product;
    }

    private static void triangle(Scanner sc){

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);

        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

    }
}
