package bai14;

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
				String[] arr = line.split(" ");
				System.out.println(arr[0]);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
