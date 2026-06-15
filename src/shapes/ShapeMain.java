package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TASK 1 & 2
        int n = sc.nextInt();
        Shape[] shapes = new Shape[n];

        // TASK 3
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String color = sc.next();
            boolean filled = sc.nextBoolean();

            if (type.equals("RECTANGLE")) {
                shapes[i] = new Rectangle(color, filled, sc.nextDouble(), sc.nextDouble());
            } else if (type.equals("CIRCLE")) {
                shapes[i] = new Circle(color, filled, sc.nextDouble());
            }
        }

        // TASK 4
        for (Shape s : shapes) {
            System.out.println(s + "\n");
        }

        // TASK 5
        System.out.println("Downcast Check:");
        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
            } else if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }

        // TASK 6
        // What error does the compiler give if you write: Shape s = new Shape("Red", true);
        // ANSWER: error: Shape is abstract; cannot be instantiated
        sc.close();
    }
}
