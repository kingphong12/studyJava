package quanLyNhanSu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CanBo {
	String lastName;
	String firtName;
	String birthday;
	String gender;
	String address;

	public CanBo() {
		super();
	}

	public CanBo(String lastName, String firtName, String birthday, String gender, String address) {
		super();
		this.lastName = lastName;
		this.firtName = firtName;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
	}

	public void inputCanBo(ArrayList<CanBo> canBoList) {
		Scanner inputCanBo = new Scanner(System.in);
		System.out.print("Nhập tên:\t");
		firtName = inputCanBo.nextLine();
		firtName.indexOf(firtName.toLowerCase());
		System.out.print("Nhập họ:\t");
		lastName = inputCanBo.nextLine();
		System.out.print("Nhập Birthday:\t\t");
		Calendar cal = Calendar.getInstance();
		boolean isNotOk = true;
		while (isNotOk == true) {
			SimpleDateFormat sbd = new SimpleDateFormat("dd/MM/yyyy");
			birthday = inputCanBo.nextLine();
			int yearNow = cal.get(Calendar.YEAR);
			try {
				// chuyển đổi ngày tháng năm
				Date ns = sbd.parse(birthday);
				cal.setTime(ns);
				int yearNs = cal.get(Calendar.YEAR);
				int age = yearNow - yearNs;
				System.out.println("Age:\t\t" + age);
				this.birthday = birthday;
				isNotOk = false;
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("mời nhập đúng định dạng");
				isNotOk = true;
			}
		}
	}

	public void showInfoCanBo() {
		System.out.println("Họ và tên:\t\t" + this.getLastName() + " " + this.getLastName());
		System.out.println("Birthday:\t\t" + this.getAddress());
		System.out.println("Gender:\t\t" + this.getGender());
		System.out.println("Address:\t\t" + this.getAddress());
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}