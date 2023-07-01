package bai13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split("");
				for (String a : arr) {
					list.add(String.valueOf(Integer.parseInt(a)));
				}
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.print("Nhập vào từ bạn muốn tìm: ");
		String text = sc.nextLine();
		boolean check = list.contains(text);
		if (check) {
			System.out.println("Co ton tai");
		} else {
			System.out.println("Khong ton tai");
		}
		
	}
}
