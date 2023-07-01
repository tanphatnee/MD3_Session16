package bai02;

import bai03.Country;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		int row = 0;
		try {
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				row += 1;
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Dòng: " + row);
	}
}
