package homework01.bai2;


public class point3D extends point2D{
	private double z;

	public point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3d [x=" + this.getX() + ", y=" + this.getY() + "z=" + z + "]";
	}

	@Override
	public void move(double dx, double dy, double dz) {
		this.setX(this.getX() + dx);
		this.setY(this.getY() + dy);
		this.z += dz;
	}

	@Override
	public double khoangcach() {
		return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.z * this.z);
	}

	@Override
	public double khoangcach2(point2D p2d2) {
		if (p2d2 instanceof point3D) {
			return Math.sqrt(Math.pow(this.getX() - p2d2.getX(), 2) + Math.pow(this.getY() - p2d2.getY(), 2)
					+ Math.pow(this.z - ((point3D) p2d2).z, 2));
		}
		return 0;
	}
	@Override
	public point2D doixung(){
		return new point3D(-this.getX(),-this.getY(),-this.z);
	}

}
