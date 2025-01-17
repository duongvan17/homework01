package homework01.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Bai3.circle.Circle;
import Bai3.line.Line;
import Bai3.point2d.Point2d;
import Bai3.rectangle.Rectangle;
import Bai3.shape.Shape;
import Bai3.triangle.Triangle;

public class bai3_main {
	 public static void main(String[] args) {
	        List<Shape> shapes = new ArrayList<>();
	        Random rand = new Random();
	        for (int i = 0; i < 5; i++) {
	            int type = rand.nextInt(5);
	            double randX = rand.nextDouble();
	            double randY = rand.nextDouble();
	            switch (type) {
	                case 0:
	                    shapes.add(new Point2d(randX, randY));
	                    break;
	                case 1:
	                    shapes.add(new Circle(rand.nextDouble(),
	                            new Point2d(rand.nextDouble(), rand.nextDouble())));
	                    break;
	                case 2:
	                    shapes.add(new Line(new Point2d(rand.nextDouble(), rand.nextDouble()),
	                            new Point2d(rand.nextDouble(), rand.nextDouble())));
	                    break;
	                case 3:
	                    shapes.add(new Triangle(new Point2d(rand.nextDouble(), rand.nextDouble()),
	                            new Point2d(rand.nextDouble(), rand.nextDouble()),
	                            new Point2d(rand.nextDouble(), rand.nextDouble())));
	                    break;
	                case 4:
	                    shapes.add(new Rectangle(new Point2d(rand.nextDouble(), rand.nextDouble()),
	                            new Point2d(rand.nextDouble(), rand.nextDouble()),
	                            new Point2d(rand.nextDouble(), rand.nextDouble()),
	                            new Point2d(rand.nextDouble(), rand.nextDouble())));
	                    break;
	            }
	        }
	        for (Shape shape : shapes) {
	            System.out.println(shape.toString());
	        }
	        double maxArea = -1, minArea = 99999;
	        double sumArea = 0, sumPeri = 0;
	        for (Shape shape : shapes) {
	            if (!(shape instanceof Point2d) && !(shape instanceof Line)) {
	                double area = shape.area();
	                System.out.println("Dien tich hinh " + shape.getClass() + " = " +  String.format("%.4f",area));
	                sumArea += area;
	                sumPeri += shape.peri();
	                if (maxArea < area)
	                    maxArea = area;
	                if (minArea > area)
	                    minArea = area;
	            }
	        }
	        System.out.println("Tong chu vi = " + String.format("%.4f",sumPeri));
	        System.out.println("Tong dien tich = " + String.format("%.4f",sumArea));
	        System.out.println("Dien tich lon nhat = " + String.format("%.4f",maxArea));
	        System.out.println("Dien tich nho nhat = " + String.format("%.4f",minArea));

	        Shape s1 = shapes.get(1);
	        if (!(s1 instanceof Point2d)) {
	            s1.zoom(1.83);
	            System.out.println(s1.toString());
	        }

	    }

}
