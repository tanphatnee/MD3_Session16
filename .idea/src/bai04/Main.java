package bai04;

import bai03.Country;

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
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(",");
				for (String s : arr) {
					list.add(s);
				}
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Map<String, Integer> myList = new HashMap<>();
		for (String i : list) {
			myList.put(i, 0);
		}
		
		for (Map.Entry<String, Integer> entry : myList.entrySet()) {
			for (String i : list) {
				if (entry.getKey().equals(i)) {
					entry.setValue(entry.getValue() + 1);
				}
			}
		}
		
		for (Map.Entry<String, Integer> entry : myList.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
