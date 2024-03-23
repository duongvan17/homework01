package Bai3.triangle;

import Bai3.point2d.Point2d;
import Bai3.shape.Shape;

public class Triangle implements Shape{
	private Point2d A;
    private Point2d B;
    private Point2d Center;

    public Triangle(Point2d a, Point2d b, Point2d c) {
        A = a;
        B = b;
        Center = c;
    }

    public Point2d getA() {
        return A;
    }

    public void setA(Point2d a) {
        A = a;
    }

    public Point2d getB() {
        return B;
    }

    public void setB(Point2d b) {
        B = b;
    }

    public Point2d getCenter() {
        return Center;
    }

    public void setCenter(Point2d center) {
        Center = center;
    }

    @Override
    public double area() {
        double p = (this.A.distance(this.B)+this.A.distance(this.Center)+this.B.distance(Center))/2;
        return Math.sqrt(p*(p-this.A.distance(this.B))*(p-this.A.distance(this.Center))*(p-this.B.distance(this.Center)));
    }

    @Override
    public double peri() {
        return this.A.distance(this.B)+this.A.distance(this.Center)+this.B.distance(Center);
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public double distance(Point2d p2) {
        return Math.min(Math.min(this.A.distance(p2),this.B.distance(p2)),this.Center.distance(p2));
    }

    @Override
    public void move(double dx, double dy, double dz) {
        this.A.move(dx, dy, dz);
        this.B.move(dx, dy, dz);
        this.Center.move(dx, dy, dz);
    }

    @Override
    public void rotate(double alpha) {
        this.A.rotate(alpha);
        this.B.rotate(alpha);
    }

    @Override
    public void zoom(double ratio) {
        this.A.zoom(ratio);
        this.B.zoom(ratio);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", Center=" + Center +
                '}';
    }

}
