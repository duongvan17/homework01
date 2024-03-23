package homework01.bai1.main;

import java.util.ArrayList;
import java.util.List;

import homework01.bai1.phanso;
import homework01.bai1.tapphanso;

public class bai1_main {
	public static void main(String[] args) {
        phanso phanSo1 = new phanso();
        System.out.println("Phân số 1: " + phanSo1);

        phanso phanSo2 = new phanso(3, 4);
        System.out.println("Phân số 2: " + phanSo2); 

        phanSo2.setX(6);
        phanSo2.setY(10);
        System.out.println("Phân số mới của phanSo2: " + phanSo2);
        phanso tong = phanSo1.tong(phanSo2);
        System.out.println("tong = "+tong);
        phanso hieu = phanSo1.hieu(phanSo2);
        System.out.println("hieu = "+hieu);
        phanso tich = phanSo1.tich(phanSo2);
        System.out.println("tich = "+tich);
        phanso thuong = phanSo1.thuong(phanSo2);
        System.out.println("thuong = "+thuong);
        String sosanh = phanSo1.sosanh(phanSo2);
        System.out.println(sosanh);
        phanSo2.rutGon();
        System.out.println("phan so 2 sau khi rut gon = "+phanSo2);
        List<phanso>list = new ArrayList<phanso>();
        phanso phanSo3 = new phanso(4,2);
        list.add(phanSo1);
        list.add(phanSo2);
        list.add(phanSo3);
        tapphanso tapPhanSo = new tapphanso(list);
        phanso max = tapPhanSo.timmax();
        double tongtap = (double) tapPhanSo.tongtap();
        int demso = tapPhanSo.demso();
        System.out.println(max);
        System.out.println(tongtap);
        System.out.println(demso);
        int summ=0;
        for(phanso p: list) {
        	summ += p.getX();
        }
        System.out.println(summ);
        
        
    }
}
