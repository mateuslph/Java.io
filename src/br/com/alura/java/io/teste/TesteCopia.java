package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopia {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo
		FileInputStream fis = new FileInputStream("loren.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("loren2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}

}
