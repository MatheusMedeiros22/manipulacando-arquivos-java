package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite", " "};
		
		String path = "d://test//in.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //Caso eu n queria recriar o arquivo, coloca como argumento ,true

			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
