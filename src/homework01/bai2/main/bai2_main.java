package homework01.bai2.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import homework01.bai2.point2D;
import homework01.bai2.point3D;

public class bai2_main {
	public static void main(String[] args) {
		List<point2D>list1 = new ArrayList<>();
		point2D A = new point2D(0,1);
		point2D B = new point2D(8,5);
		point3D C = new point3D(5,3,8);
		point3D D = new point3D(1,9,4);
		list1.add(A);
		list1.add(B);
		list1.add(C);
		list1.add(D);
		List<point2D> list2 = new ArrayList<>();
		for(point2D p: list1) {
			System.out.println(p.toString());
			list2.add(p.doixung());
		}
		System.out.println("diem doi xung: ");
		for(point2D p: list2) {
			System.out.println(p.toString());
		}
		System.out.println(A.khoangcach());
		System.out.println(D.khoangcach());
		System.out.println(C.khoangcach2(D));
		B.move(1, 1, 1);
		System.out.println(B);
		double min = A.khoangcach();
		for(point2D p: list1) {
			if(min>p.khoangcach()) min = p.khoangcach();	
		}
		System.out.println(min);

		


		

	}
}
