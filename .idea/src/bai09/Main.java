package bai09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split("");
				for (int i = arr.length - 1; i >= 0; i--) {
					list.add(arr[i]);
				}
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
	}
}
