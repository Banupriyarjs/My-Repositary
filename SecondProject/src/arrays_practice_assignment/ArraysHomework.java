package arrays_practice_assignment;

import java.util.Arrays;

public class ArraysHomework {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		

		// 1. Last position of null in an array

		int arraySize = 20;
		String[] stringArray = new String[arraySize];

		stringArray[0] = "One";
		stringArray[1] = "Two";
		stringArray[2] = "Three";
		stringArray[3] = "Four";
		stringArray[4] = "Five";
		stringArray[5] = "Six";
		stringArray[6] = "Seven";
		stringArray[7] = "Eight";
		stringArray[8] = "Nine";
		stringArray[9] = "Ten";

		int lastnull = -1; // not found indicator -1

		for (int i = stringArray.length - 1; i >= 0; i--) {
			if (stringArray[i] == null) {
				lastnull = i;
				break;
			}

		}
		System.out.println("The postion of last null in the array is: " + lastnull);

		// 2.starts final position in the array and count down to the first
    	for(int i=stringArray.length-1;i>0;i--)
		{
			System.out.println("Element in posistion["+i+"] is : "+stringArray[i]);
			break;
		}
			
	
		// 3.use letters.split(",") to make array of letters

		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,,o,p,q,r,s,t,u,v,w,x,y,z";

		String[] strSplit = letters.split(",+");
		
		System.out.println("\n\nLetters Array " +Arrays.toString(strSplit));
		
		//4. loop over the array and count the letters that are not vowels
		String nonvowel="";
		int nonVowelsCount=0;
		for(String s:strSplit)
		{
			if(!s.equals("a")&&!s.equals("e")&&!s.equals("i")&&!s.equals("o")&&!s.equals("u"))
			{
				if(nonvowel.isEmpty())
					nonvowel=nonvowel+s;
				else
					nonvowel=nonvowel+","+s;
				nonVowelsCount++;
			}
		}
		
		System.out.println("\n\nLetters that are not vowels "+nonvowel);
		
		
		System.out.println("\n\nCount of letters that are not vowels "+nonVowelsCount);
			
		
		
		

	   //5.write a for loop that tells me how many values are not null
	    int notNullCount=0;
	    
	    for(String s:stringArray)
	    {
	    	if(s!=null)
	    		notNullCount=notNullCount+1;
	    }
	    System.out.println("\nNumber of not null values in an array : "+notNullCount);
	}
	
}

