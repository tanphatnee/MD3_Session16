package bai08;

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
				line.toUpperCase();
				list.add(line);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}
}
