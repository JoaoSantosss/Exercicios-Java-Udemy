package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String inputPath = "C:\\Users\\joao.santos\\Desktop\\Estudo de Pogramacao\\Udemy\\input.csv";
		String outPath = "C:\\Users\\joao.santos\\Desktop\\Estudo de Pogramacao\\Udemy\\out.csv";
		List<Product> products= new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
			
			
			String strLine = br.readLine();
			while (strLine != null) {
				String[] line = strLine.split(",");
				String item = line[0];
				double price = Double.parseDouble(line[1]);
				int quantity = Integer.parseInt(line[2]);
				
				products.add(new Product(item, price, quantity));
				
				strLine = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
				for (Product p : products) {
					bw.write(p.toString());
					bw.newLine();
				}
			} 
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
