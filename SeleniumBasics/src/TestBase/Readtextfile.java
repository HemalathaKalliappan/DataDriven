package TestBase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readtextfile {
	public static void main(String[] args) throws IOException {
		String s1 ="C:\\Users\\khemalatha\\git\\DataDriven\\SeleniumBasics\\Readfile.txt";
		
		File filecreate = new File(s1);
		filecreate.createNewFile();
		
		FileWriter fw = new FileWriter(s1);
		BufferedWriter bw1 = new BufferedWriter(fw);
		bw1.write("Line 1sjhsfds");
		bw1.newLine();
		bw1.write("Line 2");
		bw1.close();		
		
		FileReader d1 = new FileReader(s1);
		BufferedReader bw = new BufferedReader(d1);
		String context ="";
		
		while((context=bw.readLine())!=null) {
			System.out.println(context);
		}
				
		
		
		
		
		
		
		
		
		
		
	}

}
