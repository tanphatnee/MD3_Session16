package bai07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				for (String s : arr) {
					list.add(s);
				}
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Collections.sort(list);
		
		String max = list.get(0);
		for (String s : list) {
			if (max.length() < s.length()) {
				max = s;
			}
		}
		System.out.println("Max: " + max);
	}
}
