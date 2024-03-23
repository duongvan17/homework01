package homework01.bai2;

public class point2D {
	private double x;
	private double y;
	public point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override 
	public String toString() {
		return "Point2D{" + "x = " + x +",y = " +y + "}";           
	}
	public double khoangcach() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	public void move(double dx, double dy,double dz) {
		this.x += dx;
		this.y += dy;
	}

	public void rotate(double alpha) {
		this.x = this.x * Math.cos(alpha) - this.y * Math.sin(alpha);
		this.y = this.x * Math.sin(alpha) + this.y * Math.cos(alpha);

	}

	public void zoom(double ratio) {
		this.x *= ratio;
		this.y *= ratio;
	}
	public point2D doixung(){
		return new point2D(-this.x,-this.y); 
	}
	public double khoangcach2(point2D p2d2){
		return Math.sqrt(Math.pow(p2d2.getX()-this.x, 2)+Math.pow(p2d2.getY()-this.y, 2));
	}
	

}
