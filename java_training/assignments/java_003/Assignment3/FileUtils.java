package hm1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f1 = new File("C:\\Users\\dsmny\\OneDrive\\Documents\\fileoutput1.txt");// OUTFILE
		BufferedReader sc = new BufferedReader(new FileReader("C:\\Users\\dsmny\\OneDrive\\Documents\\fileoutput.txt")); 
		//File f2 = new File("C:\\Users\\dsmny\\OneDrive\\Documents\\fileoutput.txt");// INPUT
		BufferedReader sc1 = new BufferedReader(new FileReader("C:\\Users\\dsmny\\OneDrive\\Documents\\fileoutput1.txt")); 
		List<String> lines = new ArrayList<String>();
		List<String> lines1 = new ArrayList<String>();
		//FileReader fR1 = new FileReader(f1);
        //FileReader fR2 = new FileReader(f2);

        //BufferedReader reader1 = new BufferedReader(sc1);
        //BufferedReader reader2 = new BufferedReader(fR2);

        //String line1 = null;
        //String line2 = null;
        //int flag = 1;
		String[] arr1 = lines1.toArray(new String[0]);
		String[] arr = lines.toArray(new String[0]);
		int paragraphCount = 1;
		int characterCount = 0;
		int characterCount1 = 0;
		String firstFileString = "";
		String secondFileString = "";
		while (weCanRead(sc.read(), sc1.read())) {
			try {
				firstFileString = sc.readLine();
				
			}catch(Exception e) {
				firstFileString="";
			}
			try {
				secondFileString = sc1.readLine();
			}catch (Exception e) {
				secondFileString = "";
			}
			//jSystem.out.println(secondFileString);
			try {
			  lines.add(firstFileString);
			  characterCount+=firstFileString.length();
			}
			catch(Exception e) {
				
			}
			try { 
			lines1.add(secondFileString);
			characterCount1+=secondFileString.length();
			}
			catch(Exception e) {
				
			}
			//characterCount+=firstFileString.length();
	        //characterCount1+=secondFileString.length();
			arr = lines.toArray(new String[0]);
			arr1 = lines1.toArray(new String[0]);
			if(Arrays.equals(arr, arr1)) {
				System.out.println("Identical Content");
				characterCount += arr.length;
				characterCount1 += arr1.length;
				if(arr.equals("")) {
					paragraphCount++;
					//System.out.println();
				}
				if(!(arr.equals(""))) {
					characterCount += arr.length; 
					System.out.println("This is the character count: " +characterCount);
	                // \\s+ is the space delimiter in java 
	               // String[] wordList = .split("\\s+"); 
	                  
	                //countWord += wordList.length; 
	                //whitespaceCount += countWord -1; 
	                  
	                // [!?.:]+ is the sentence delimiter in java 
	                //String[] sentenceList = line.split("[!?.:]+"); 
	                  
	                //sentenceCount += sentenceList.length; 
					
				}
			}
			else {
				System.out.println("Different Content");
				characterCount += arr.length;
				characterCount1 += arr1.length;
				System.out.println(characterCount);
				System.out.println(characterCount1);
			}
			//String[] arr1 = lines.toArray(new String[0]);
			//for (String var : arr) {
				//System.out.println(var);
			//}
        
		}
		
		sc.close();
		sc1.close();
     
	//while (sc1.hasNextLine()) {
		  //lines1.add(sc1.nextLine());
		  //arr1 = lines1.toArray(new String[0]);
		  //for (String var1 : arr1) {
			  //System.out.println(var1);
		 // }
		  //sc1.close();	
	//}
	
   }

	private static boolean weCanRead(int a, int b) {
//		sc.read()!=-1 && sc1.read()!=-1
		if(a==-1 && b==-1) {
			return false;
		}else {
			return true;
		}
		
	}
  
}






	

