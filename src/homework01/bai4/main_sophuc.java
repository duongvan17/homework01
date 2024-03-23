package homework01.bai4;

import homework01.bai4.sophuc;

public class main_sophuc {
	public static void main(String[] args) {
		sophuc sp1 = new sophuc(1.0f, -1.0f);
		sophuc sp2 = new sophuc(2.4f, 2.0f);
		sophuc[] soPhucs = { sp1, sp2 };

		for (sophuc sp : soPhucs) {
			System.out.println(sp.toString());
		}

		sophuc temp = new sophuc(0.0f, 0.0f);
		for (int i = 0; i < soPhucs.length; i++) {
			temp = temp.tong(soPhucs[i]);
		}
		temp.setPhanthuc(temp.getPhanthuc() / soPhucs.length);
		temp.setPhanao(temp.getPhanao() / soPhucs.length);
		System.out.println("Trung binh = " + temp.toString());

		double max = -1;
		int index = -1;
		for (int i = 0; i < soPhucs.length; i++) {
			double modulus = soPhucs[i].Modulus();
			if (max < modulus) {
				max = modulus;
				index = i;
			}
		}
		System.out.println("So co modulus lon nhat la " + soPhucs[index].toString() + " = " + max);

		int dem = 0;
		for (sophuc sp : soPhucs) {
			if (sp.getPhanao() == 0.0f)
				dem++;
		}
		System.out.println("So cac so thoa man = " + dem);
	}
}
