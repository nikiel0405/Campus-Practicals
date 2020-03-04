/**
 * @(#)EmailAddressExtractor.java

 */
import java.util.*;
import java.io.*;

public class EmailAddressExtractor
{
	public static void main(String[] args)throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		String inFileName, outFileName;
		
		System.out.println("Input File Name :");
		inFileName = keyboard.nextLine().trim();
		
		System.out.println("Output File Name");
		outFileName = keyboard.nextLine().trim();
		
		File inFile = new File(inFileName);//input file
		Scanner inData = new Scanner(inFile);
		
		File outFile = new File(outFileName);//output file
		PrintStream outData = new PrintStream(outFile);
		
		String data;
		int i, length;
		boolean isAt, isDot;
		
		while(inData.hasNext())//is there more data to process
		{
			data = inData.next();//actual data
			length = data.length();
			
			i = 0;
			isAt = false;//threre is no @ character initially
			isDot = false;//there is no . character initially
			
			while(i<length)
			{
				if(data.charAt(i) == '@')
				    isAt = true;
				else if(data.charAt(i) == '.')
				    isDot = true;
				i++;
			}
			
			if(isAt == true && isDot == true)
			    outData.println(data);
			
		}
		
		outData.close();

	}
}