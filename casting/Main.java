package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        TriangleWithCircle twc = new TriangleWithCircle
                ("triangle 1 with circle", 3, 4, 5, 3.5);
        System.out.println(twc);

        Shape shape1 = new Shape("Shape1");
        System.out.println(shape1);

        twc.getRadius();

        printShape(twc);
        Shape[] shapes = new Shape[2];
        shapes[0] = twc;
        //shapes[0].

        Triangle t1 = new Triangle("t1", 1, 2, 3);
        mysteryShape(t1);

        Shape shape2 = new Triangle("t1", 1, 2, 3); // polymorphism
        //printShape(shape2);
    }

    private static void mysteryShape(Shape s)
    {
        System.out.println("mysteryShape:");
        System.out.println(s);

        if (s instanceof Circle) {
            Circle c1 = (Circle) s;
            c1.getCircleHekef();
        }
    }

    private static void printShape(Shape s)
    {
        s.getDescription();
        if (s instanceof TriangleWithCircle)
        {
            TriangleWithCircle s_as_TriangleWithCircle = (TriangleWithCircle)s;
            System.out.println(s_as_TriangleWithCircle.getRadius());
        }

    }


}
