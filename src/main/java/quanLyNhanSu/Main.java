package quanLyNhanSu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<CanBo> canBoList = new ArrayList<CanBo>();
		int menu;
		do {
			Scanner number = new Scanner(System.in);
			System.out.println("=================MENU=================");
			System.out.println("1. Nhập thông tin cán bộ");
			System.out.println("2. Tim kiếm thông tin cán bộ");
			System.out.println("3. Thoát");
			menu = number.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("Số người cần nhập thông tin");
				int n = number.nextInt();
				for (int i = 0; i < n; i++) {
					CanBo cb = new CanBo();
					cb.inputCanBo(canBoList);
					canBoList.add(cb);
				}
				break;
			}
			}
		} while (menu != 3);
	}

}
