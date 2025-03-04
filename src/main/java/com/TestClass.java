package com;

public class TestClass {
	public static void main(String args[]) {
		String str = "Java Application";
		String rev = "";
	int len = str.length();	
	for(int i=len-1; i>=0;i--) {
		
		
	}
	System.out.println("The reverse string is: "+rev);	
	
	char a[] =str.toCharArray();
	int len1 = a.length;
	for(int i=len1-1; i>=0; i--) {
		rev=rev+a[i];
	}
	System.out.println("The reverse string is: "+rev);	
		
}
}
