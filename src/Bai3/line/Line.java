package Bai3.line;

import Bai3.point2d.Point2d;
import Bai3.shape.Shape;

public class Line implements Shape{
	   private Point2d t;
	    private Point2d center;

	    public Line(Point2d center, Point2d t) {

	        this.t = t;
	        this.center = center;
	    }


	    public Point2d getT() {
	        return t;
	    }

	    public void setT(Point2d t) {
	        this.t = t;
	    }

	    @Override
	    public double area() {
	        return 0;
	    }

	    @Override
	    public double peri() {
	        return 0;
	    }

	    @Override
	    public double distance() {
	        return 0;
	    }

	    @Override
	    public double distance(Point2d p2) {
	        return Math.min(center.distance(p2), t.distance(p2));
	    }

	    @Override
	    public void move(double dx, double dy, double dz) {
	        this.t.move(dx, dy, dz);
	        this.center.move(dx, dy, dz);
	    }

	    @Override
	    public void rotate(double alpha) {
	        this.t.rotate(alpha);
	    }

	    @Override
	    public void zoom(double ratio) {
	        this.t.zoom(ratio);
	    }

	    @Override
	    public String toString() {
	        return "Line{" +
	                "t=" + t +
	                ", center=" + center +
	                '}';
	    }


	    public Point2d getCenter() {
	        return center;
	    }

	    public void setCenter(Point2d center) {
	        this.center = center;
	    }

}
