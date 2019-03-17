package com.Netcracker;

import com.Netcracker.Author.Author;
import com.Netcracker.Book.Book;
import com.Netcracker.Circle.Circle;
import com.Netcracker.Employee.Employee;
import com.Netcracker.MyPoint.MyPoint;
import com.Netcracker.MyTriangle.MyTriangle;
import com.Netcracker.Rectangle.Rectangle;

public class Test {
    public static void main(String[] args) {
        int stateTest = 3;    // choose class for test (0 - Circle, 1 - Rectangle,
                              // 2 - Employee, 3 - Book, 4 - MyTriangle and MyPoint)

        switch (stateTest){
            case 0:          // testing class "Circle"
                Circle circle1 = new Circle();
                Circle circle2 = new Circle(10, "blue");
                Circle circle3 = new Circle(25);

                System.out.println("circle1 ic: " + circle1.toString());
                System.out.println("circle2 is: " + circle2.toString());
                System.out.println("circle3 is: " + circle3.toString());
                System.out.println("circle1.getColor() --> " + circle1.getColor());

                circle1.setRadius(15);
                circle2.setColor("green");

                System.out.println();
                System.out.println(circle1.toString());
                System.out.println(circle2.toString());

                double radius2 = circle1.getRadius();

                System.out.println("------------------------------------------");
                System.out.println("1. circle1 calculate area --> " + (Math.PI * radius2 * radius2));
                System.out.println("2. circle1.getArea() --> " + circle1.getArea());
                System.out.println("Circumference 3 -->: " + circle3.getCircumference());
                break;

            case 1:          // testing class Rectangle
                Rectangle rectangle1 = new Rectangle();
                Rectangle rectangle2 = new Rectangle(10,5);


                System.out.println("rectangle1 is: " + rectangle1.toString());
                System.out.println("rectangle2 is: " + rectangle2.toString());

                rectangle1.setLength(23.1f);
                rectangle2.setWidth(345.12f);


                System.out.println();
                System.out.println("rectangle2.getWidth() --> " + rectangle2.getWidth());
                System.out.println("rectangle1.getLength() --> " + rectangle1.getLength());
                System.out.println("------------------------------------------");
                System.out.println("rectangle1.getArea() --> " + rectangle1.getArea());
                System.out.println("rectangle2.gerPerimeter --> " + rectangle2.getPerimeter());
                break;

            case 2:          // testing class Employee
                Employee employee1 = new Employee(1, "Michael", "Jackson", 4500);
                Employee employee2 = new Employee(1, "Iker", "Casillas", 500000);

                if(employee1.getID() == 1)
                    System.out.println("getID works correctly");
                else
                    System.out.println("getID does not work correctly");

                employee1.setSalary(50000);

                System.out.println(employee1.getFirstName() + " " + employee1.getLastName() +
                        " had a salary of " + employee1.getSalary());
                System.out.println();
                System.out.println("employee2.getAnnualSalary() --> " + employee2.getAnnualSalary());
                System.out.println("employee2.getSalary() --> " + employee2.getSalary());
                System.out.println("employee2.raiseSalary(15) --> " + employee2.raiseSalary(15));
                System.out.println();
                System.out.println("employee2.toString() --> " + employee2.toString());
                break;

            case 3:          // testing class Book (and Author)
                Author author1 = new Author("Abc", "Abc82@gmail.com", 'f');
                Author author2 = new Author("Def", "Def5@gmail.com", 'm');
                Author author3 = new Author("Ghi", "Ghi1973@mail.ru", 'm');
                Author author4 = new Author("Jkl", "Jkl@rambler.ru", 'f');

                Book book1 = new Book("Hello", new Author[] {author2, author3, author1}, 1200);
                Book book2 = new Book("World!", new Author[] {author1, author4}, 550, 7000);
                Book book3 = new Book("My first class", new Author[] {}, -400, -45);

                System.out.println("book3 name is " + book3.getName()+ ", price = " +
                        book3.getPrice() + ", qty = " + book3.getQty());
                System.out.println("book2 name is " + book2.getName()+ ", price = " +
                        book2.getPrice() + ", qty = " + book2.getQty());

                book3.setPrice(300);
                book3.setQty(50000);
                book1.setQty(15000);
                book1.setPrice(-100);

                System.out.println();
                System.out.println("book2 authors: " + book2.getAuthorNames());
                System.out.println("book3 authors: " + book3.getAuthorNames());
                System.out.println("----------------------------------------" + "\n");
                System.out.println("book1.toString() --> " + book1.toString());
                System.out.println("book3.toString() --> " + book3.toString());

                book2 = new Book("World!", new Author[] {author1, author4}, 550, 7000);
                Book book4 = new Book("World!", new Author[] {author1, author4}, 550, 7000);

                System.out.println("\nbook2.equals(book4): " + book2.equals(book4));
                System.out.println("book4.equals(book2): " + book4.equals(book2));
                System.out.println("book2.hashCode(): " + book2.hashCode());
                System.out.println("book4.hashCode(): " + book4.hashCode());
                break;

            case 4:          // testing class MyTriangle (and MyPoint)
                MyPoint p1 = new MyPoint();
                MyPoint p2 = new MyPoint(0,4);
                MyPoint p3 = new MyPoint(4,4);

                MyTriangle triangle1 = new MyTriangle(p1,p2,p3);
                MyTriangle triangle2 = new MyTriangle(0, 3, 2, 5, 4, 3);

                System.out.println("triangle1 type is: " + triangle1.getType());
                System.out.println("perimeter triangle2 = " + triangle2.getPerimeter() + "\n");

                System.out.println("triangle2 is " + triangle2.toString());
                break;

        }


    }
}
