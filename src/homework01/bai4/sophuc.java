package homework01.bai4;

public class sophuc {
	private double phanthuc;
	private double phanao;
	
	public sophuc(double phanthuc, double phanao) {
		super();
		this.phanthuc = phanthuc;
		this.phanao = phanao;
	}

	public double getPhanthuc() {
		return phanthuc;
	}

	public void setPhanthuc(double phanthuc) {
		this.phanthuc = phanthuc;
	}

	public double getPhanao() {
		return phanao;
	}

	public void setPhanao(double phanao) {
		this.phanao = phanao;
	}
	
	@Override
	public String toString() {
		return "so phuc{ phan thuc = " +phanthuc +" phan ao = "+phanao+"i}"; 
	}
	public sophuc tong(sophuc sp2) {
		return new sophuc(this.phanthuc + sp2.phanthuc,this.phanao+sp2.phanao);
	}
	public double Modulus() {
		return Math.sqrt(Math.pow(phanthuc, 2)+Math.pow(phanao, 2));
	}
	public sophuc chia(int data) {
		return new sophuc(this.phanthuc / data,this.phanao / data);
	}

	
	

}
