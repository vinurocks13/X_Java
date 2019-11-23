package Logical;

public class Main 
{

	public static void main(String[] args) 
	{
		hashmapCalls();
//		LogicPro.seqNo(1);
//		logicCalls();
//		arrayCalls();
//		stringCalls();
//		stringsProgram.stringBasics();
	}

	
	public static void hashmapCalls()
	{
		
	}
	public static void logicCalls()
	{
		LogicPro.fibonacci(20);
		
		
		LogicPro.checkPrime(27);
		LogicPro.primeInRange(0, 56);
		LogicPro.palindromeNumber(1011);
		LogicPro.checkArmstrongNo(371);
		LogicPro.armstrongsInRange(1000, 99999);
		System.out.println("Factorial ="+LogicPro.recursiveFactorial(5));
	}
	public static void arrayCalls()
	{
		int a[]={10,5,7,45,33,211,8,1};
//		arrayProgram.arr1DDisp();
//		arrayProgram.arr2DDisp();
		arrayProgram.findMissingNo();
		arrayProgram.findDuplicateNo();
		a=arrayProgram.sortArray(a);
//		arrayProgram.findNumber(a, 33);
		arrayProgram.binarySearch(a,0,a.length-1, 10);
		
		
	}
	public static void stringCalls()
	{
		System.out.println(stringsProgram.Reverse("Nishikant"));
		System.out.println(stringsProgram.charAtEven("Nishikant"));
		System.out.println(stringsProgram.charAtOdd("Nishikant"));
		System.out.println(stringsProgram.reverseEvenWord("This is just for fun"));
		System.out.println(stringsProgram.reverseOddWord("This is just for fun"));
		System.out.println(stringsProgram.displayAlphabateOnly("asdef45SDF"));
		System.out.println(stringsProgram.displayNumericsOnly("asdef45SDF"));
		stringsProgram.stringPalindrome("nitins");
		stringsProgram.stringAnagram("asedfwr", "fdrsaew");
	}

}
