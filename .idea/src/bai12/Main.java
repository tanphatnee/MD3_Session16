package bai12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				for (String a : arr) {
					list.add(String.valueOf(Integer.parseInt(a)));
				}
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		HashMap<String, Integer> myList = new HashMap<>();
		for (String s : list) {
			myList.put(s, 0);
		}
		
		for (Map.Entry<String, Integer> entry : myList.entrySet()) {
			for (String s : list) {
				if (entry.getKey().equals(s)) {
					entry.setValue(entry.getValue() + 1);
				}
			}
		}
		
		int max = myList.get("hgdjsl");
		
		for (Map.Entry<String, Integer> entry : myList.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
			}
		}
		
		for (Map.Entry<String, Integer> entry : myList.entrySet()) {
			if (entry.getValue() == max) {
				System.out.println(entry.getKey());
			}
		}
		;
	}
}
