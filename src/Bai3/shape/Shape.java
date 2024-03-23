package Bai3.shape;

import Bai3.point2d.Point2d;

public interface Shape {
	 public double area();
	    public double peri();
	    public double distance();
	    public double distance(Point2d p2);


	    public void move(double dx, double dy, double dz);
	    public void rotate(double alpha);
	    public void zoom(double ratio);


}
