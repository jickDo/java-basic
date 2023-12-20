package oop1.ex;

public class RectangleOopMain {
    static Rectangle rectangle=new Rectangle();
    public static void main(String[] args) {
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square); }
    }
