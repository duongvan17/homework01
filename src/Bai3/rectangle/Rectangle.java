package Bai3.rectangle;

import Bai3.point2d.Point2d;
import Bai3.shape.Shape;

public class Rectangle implements Shape{
	 private Point2d A;
	    private Point2d B;
	    private Point2d C;
	    private Point2d Center;
	    private double height, width;

	    public Rectangle(Point2d a, Point2d b, Point2d c, Point2d center) {
	        A = a;
	        B = b;
	        C = c;
	        Center = center;
	        height = this.Center.distance(this.A);
	        width = this.Center.distance(this.C);
	    }

	    @Override
	    public double area() {
	        return height*width;
	    }

	    @Override
	    public double peri() {
	        return (height+width)*2;
	    }

	    @Override
	    public double distance() {
	        return 0;
	    }

	    @Override
	    public double distance(Point2d p2) {
	        return  Math.min(Math.min(this.A.distance(p2),this.B.distance(p2)),Math.min(this.Center.distance(p2),this.C.distance(p2)));
	    }

	    @Override
	    public void move(double dx, double dy, double dz) {
	        this.A.move(dx, dy, dz);
	        this.B.move(dx, dy, dz);
	        this.C.move(dx, dy, dz);
	        this.Center.move(dx, dy, dz);
	    }

	    @Override
	    public void rotate(double alpha) {
	        this.A.rotate(alpha);
	        this.B.rotate(alpha);
	        this.C.rotate(alpha);
	    }

	    @Override
	    public void zoom(double ratio) {
	        this.A.zoom(ratio);
	        this.B.zoom(ratio);
	        this.C.zoom(ratio);
	    }

	    @Override
	    public String toString() {
	        return "Rectangle{" +
	                "A=" + A +
	                ", B=" + B +
	                ", C=" + C +
	                ", Center =" + Center +
	                ", height=" + height +
	                ", width=" + width +
	                '}';
	    }

}
