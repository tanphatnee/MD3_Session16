package bai15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("number.txt");
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
		
		Collections.sort(list);
		System.out.println(list);
	}
}
