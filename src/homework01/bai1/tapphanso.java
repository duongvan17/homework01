package homework01.bai1;

import java.util.List;

public class tapphanso {
	private List<phanso> list;

	public tapphanso(List<phanso> list) {
		super();
		this.list = list;
	}
	public phanso timmax() {
		phanso i = new phanso(0,1);
		for(phanso it: list) {
			if((double) it.getX()/it.getY()> i.getX()/i.getY())
				i=it;
		}
		return i;
		
	}
	public double tongtap() {
		double tongtap = 0.00;
		for(phanso it: list) {
			tongtap += (double) it.getX()/it.getY();
			}
		return tongtap;
	}
	public int demso() {
		int dem = 0;
		for(phanso it: list)	{
			if((double)it.getX()/it.getY()/(int)it.getX()/it.getY()!=1.0) dem++;
		}
		return dem;
	}
}
