package dangthuongngo.com.test;

import java.util.ArrayList;
import java.util.Collections;

import dangthuongngo.com.model.SanPham;

public class TestSanPham {
	public static void main(String[] args) {
		ArrayList<SanPham>dsSP=new ArrayList<SanPham>();
		dsSP.add(new SanPham(1,"coca",23));
		dsSP.add(new SanPham(2,"coca",20));
		dsSP.add(new SanPham(1,"coca",26));
		System.out.println("Danh Sachs San pham:");
		for(SanPham sp: dsSP)
			System.out.println(sp);
		Collections.sort(dsSP);
		System.out.println("Danh sach sau khi da sap xep");
		for(SanPham sp: dsSP)
			System.out.println(sp);
	}
}
