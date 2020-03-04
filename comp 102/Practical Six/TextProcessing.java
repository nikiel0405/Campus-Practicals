/**
 * @(#)TextProcessing.java

 */

import java.util.*;
import java.io.*;

public class TextProcessing
{
	public static void main(String[] args)throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		
		System.out.println("File Name :");
		fileName = keyboard.nextLine();//input file name
		fileName.trim();
		
		File file = new File(fileName);//input file
		Scanner inFile = new Scanner(file);
		
		Scanner line;
		
		int numLines = 0;//number of lines in the file
		int numWords = 0;//number of words in the file
		int sumWordsLength = 0;
		double averageWordLength = 0;//sumWordsLength/numWords
		String word = " ";
		
		while(inFile.hasNextLine())//is there one more line in the file?
		{
			line = new Scanner (inFile.nextLine());
			numLines++;//count the line
			
			while(line.hasNext())//handle words in the line
			{
				word = line.next();
				numWords++;//count the word
				sumWordsLength += word.length();//add the word length to the sum 
			}
		}
	    
		averageWordLength = sumWordsLength/numWords;
		
		System.out.println("Number of Lines : "+numLines);
	
		System.out.println("Number of Words : "+numWords);
			
		System.out.println("Average Word Length : "+averageWordLength);
		
	}
}