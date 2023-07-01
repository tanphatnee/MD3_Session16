package bai03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> result = readFromFile("data.txt");
        for (Country country : result) {
            System.out.println(country);
        }
    }

    public static List<Country> readFromFile(String filename) {
        List<Country> result = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                result.add(new Country(Integer.parseInt(arr[0]), arr[1], arr[2]));
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}