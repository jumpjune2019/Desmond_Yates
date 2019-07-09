package hm1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Phonebook {
	public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
		
        // Implement scanner
        Scanner input = new Scanner(System.in);

        // create loop for accepting matrix input
        // first accept row size
        
        /*System.out.println("Please enter the number of rows in your matrix. Must be 5 or less.");
        int row = input.nextInt();
        while (row > 5 || row < 1) {
            System.out.println("Sorry. Your number is not the correct size. "
                    + "Please enter the number of rows in your matrix. Must be between 5 and 1.");
            row = input.nextInt();
        }
        // next accept column size
        System.out.println("Please enter the number of columns in your matrix. Must be 5 or less.");
        int column = input.nextInt();
        while (column > 5 || column < 1) {
            System.out.println("Sorry. Your number is not the correct size. "
                    + "Please enter the number of columns in your matrix. Must be between 5 and 1.");
            column = input.nextInt();
        }*/
        // declare array with row and columns the user gave
        int row =5;
        int column =3;
        String[][] userArray = new String[row][column];
        String val;

        for(int i=0;i< row ; i++){
        	
            for(int j=0; j< column; j++) {
                System.out.print("Please enter the value for array["+i+"]["+j+"] (between -10 and 10):");
                val = input.nextLine();
                    //if(val>10 || val< -10) {
                        //System.out.println("Invalid value.");
                        //continue;
                    //}
                userArray[i][j] = val;
                
            }
            
            System.out.println("Are you sure this data correct? type no for no or yes for yes");
            String toContinue = input.nextLine();
            try {
	            if(toContinue.equals("no")) {
	            	i=i-1;
	            }else if(toContinue.equals("yes")) {
	            	System.out.println("you are doing a good job buddy");
	            }
	            else {
	            	i=i-1;
	            	throw new PhoneNumberException();
	            }
	         }
            catch (PhoneNumberException e) {
        		e.printMessage();
            } catch (Exception e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	} 
        printMatrix(userArray, row, column);
        outputFile(userArray, row, column);
            
        }
        }
	
    public static void printMatrix(String[][] userArray, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(userArray[i][j] + " ");
            }
          System.out.println();
        }
    }
    public static void outputFile(String[][] userArray, int row, int column) {
    	//PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\dsmny\\OneDrive\\Documents\\outputfile.txt")); 
    	FileWriter out = null;
    	try {
    	out = new FileWriter("C:\\Users\\dsmny\\OneDrive\\Documents\\outputfile.txt");
    	//PrintWriter pr = new PrintWriter("file");    

	        for (int i=0; i<row ; i++)
	        {
	        	for (int a=0; a<column ; a++) {
	            //out.println(row);
	        		out.write(userArray[i][a] + " ");
	        		
	            
	        }
	        	out.write("\n");
	      }
	        out.flush();
    	}
	   catch(IOException e){
		   System.out.println("No file");
	   }
	        //out.close();
    }
       
}


    

