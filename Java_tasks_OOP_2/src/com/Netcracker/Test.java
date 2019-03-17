package com.Netcracker;

import com.Netcracker.MyComplex.MyComplex;
import com.Netcracker.MyPolynomial.MyPolynomial;
import com.Netcracker.movingBall.Ball;
import com.Netcracker.movingBall.Container;

public class Test {
    public static void main(String[] args) {

        int stateTest = 2;          // choose class for test (0 - MyComplex, 1 - MyPolynomial,
                                    // 2 - Container and Ball)

        switch (stateTest){

            case 0:
                MyComplex mc1 = new MyComplex(2,3);
                MyComplex mc2 = new MyComplex(-1,1);
                MyComplex mc3 = new MyComplex();

                mc1.setReal(-6);
                mc2.setImag(4);

                System.out.println("mc1.getReal() :" + mc1.getReal() +
                        "\nmc1.getImag() :" + mc1.getImag());
                System.out.println("mc1.conjugate() is " + mc1.conjugate());
                System.out.println("-------------------------------");
                System.out.println("mc3.isReal() :" + mc3.isReal());

                mc3.setValue(5,2);
                mc3.multiply(mc2);

                System.out.println("mc2.equals(-1, 4) " + mc2.equals(-1, 4));
                System.out.println("mc2.equals(mc1) " + mc2.equals(mc1));
                System.out.println("mc3.isImaginary(): " + mc3.isImaginary());
                System.out.println("\nmc3 is: " + mc3.toString());
                System.out.println("-------------------------------");
                System.out.println("mc2.addNew(mc1).substractNew(mc3).divide(mc1) is: " +
                    mc2.addNew(mc1).substractNew(mc3).divide(mc1));
                System.out.println("mc2 is: "+ mc2);
                System.out.println("-------------------------------");
                System.out.println("mc2.add(mc1).substract(mc3).divide(mc1) is: " +
                        mc2.add(mc1).substract(mc3).divide(mc1));
                System.out.println("mc2 is: "+ mc2);
                break;

            case 1:
                MyPolynomial mp1 = new MyPolynomial(7, 3, 1);
                MyPolynomial mp2 = new MyPolynomial(-3, 1);

                System.out.println("mp2.multiply(mp1) is " + mp2.multiply(mp1));
                System.out.println("mp1.multiply(mp2) is " + mp1.multiply(mp2));
                System.out.println("-------------------------------------------------");
                System.out.println("mp1.add(mp2) is: " + mp1.add(mp2));
                System.out.println("mp2.add(mp1) is: " + mp2.add(mp1));

                System.out.println("mp1.evaluate(x = 2) :" + mp1.evaluate(2));
                break;

            case 2:
                Container container = new Container(5, 10,100,150);
                Ball ball = new Ball(20,30,5,5,-60);
                Ball newBall = new Ball(30,40,5,5,-60);

                System.out.println("ball is: " + ball);
                System.out.println("newBall is: " + newBall);
                System.out.println("ball X: " + ball.getX());
                System.out.println("ball Y: " + ball.getY());
                System.out.println("ball.equals(newBall): " + ball.equals(newBall));

                ball.setY(40);
                newBall.setX(20);

                System.out.println("ball.setY(40); \nnewBall.setX(20);");
                System.out.println("ball.equals(newBall): " + ball.equals(newBall));
                System.out.println("\n--------------------------------------------\n");

                System.out.println("ball is: " + ball);
                System.out.println("container is: " + container);
                System.out.println("container.collides(ball): " +
                        container.collides(ball));

                ball.move();

                System.out.println("ball.move(); --> ball is: " + ball);
                System.out.println("container.collides(ball): " +
                        container.collides(ball));

                ball.reflectHorizont();
                ball.reflectVertical();
                ball.move();

                System.out.println("\n--------------------------------------------\n");
                System.out.println("ball.reflectHorizont(); \n" +
                        "ball.reflectVertical();\n" +
                        "ball.move(); --> ball is: " + ball);
                System.out.println("container.collides(ball): " +
                        container.collides(ball));





                break;

        }





    }
}
