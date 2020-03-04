/**
 * @(#)SeperateData.java

 */
 
import java.util.*;
import java.io.*;

public class SeparateData
{
	public static void main(String[] args)throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		String inputFileName,outputFileNameX, outputFileNameY;
		
		System.out.println("Input File Name : ");
		inputFileName = keyboard.nextLine().trim();

		File inFile = new File(inputFileName);//input file
		Scanner input = new Scanner(inFile);
		
		String firstName = input.nextLine().trim();
		String secondName = input.nextLine().trim();
		String thirdName = input.nextLine().trim();


		PrintWriter firstFile = new PrintWriter(new File(firstName + ".txt"));
		PrintWriter secondFile = new PrintWriter(new File(secondName + ".txt"));
		PrintWriter thirdFile = new PrintWriter(new File(thirdName + ".txt"));


		double sumFirst  = 0;//sum of first students marks
		int totalFirst = 0; //number of entries of first student 
		double sumSecond = 0;//sum of second students marks
		int totalSecond = 0;
		double sumThird = 0;//sum of third students marks
		int totalThird = 0;

		String data;
		
		while(input.hasNext())//is there more data to process
		{
			data = input.next();
			
			if(data.equals(firstName)){ //process first students mark
			    double first = input.nextDouble(); //read the mark
			    sumFirst += first;                 //add it to sum
			    firstFile.println(first);          //print to appropriate file
			    totalFirst++;                      //count number of marks
			}
			else if (data.equals(secondName)){
			    double second = input.nextDouble(); 
			    sumSecond += second;
			    secondFile.println(second);
			    totalSecond++;
			}
			else if  (data.equals(thirdName)){
			    double third = input.nextDouble(); 
			    sumThird += third;
			    thirdFile.println(third);
			    totalThird++;
			}
			else {//unknown student
			    //just eat up mark
			    input.nextDouble();
			}

		}
		
		System.out.println(firstName + "'s average is  " + (sumFirst / totalFirst));
		System.out.println(secondName + "'s average is  " + (sumSecond / totalSecond));
		System.out.println(thirdName + "'s average is  " + (sumThird / totalThird));


		firstFile.close();
		secondFile.close();
		thirdFile.close();
	}
}
