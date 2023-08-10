package com.Peol;

import java.util.Scanner;

public class ReplaceWord {
	
	static int len(String s) {
		int len=0;
		for(char ch:s.toCharArray()) {
			len++;
		}
		return len;
	}
	static boolean equalsMethod(String s1,String s2) {
		int i=0;
		while(i<len(s1)) {
			if(s1.charAt(i)==s2.charAt(i)) {
				i++;
			}
			else {
				return false;
			}
			
		}
		return true;
	}
	static String replace(String str,String s1,String s2) {
		String nstr="",nword="";
		
		int len=len(str);
		for(int i=0;i<len;i++) {
			while(i<len&& str.charAt(i)!=' ') {
				nword=nword+str.charAt(i);
				i++;
			}
			if(equalsMethod(s1,nword)) {
				nstr=nstr+s2+" ";
			}
			else {
				nstr=nstr+nword+" ";
			}
			nword="";
		}
		return nstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,s1,s2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		str=scan.nextLine();
		System.out.println("Enter the String that has to be changed");
		s1=scan.nextLine();
		System.out.println("Enter the String to be replaced");
		s2=scan.nextLine();
		
		System.out.println(replace(str,s1,s2));

	}

}
