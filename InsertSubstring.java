package com.Peol;

import java.util.*;

public class InsertSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		System.out.println("Enter the Substring");
		String substr=scan.nextLine();
		System.out.println("Enter the Position");
		int pos=scan.nextInt();
		String newstr="";
		
		int len=0;
		for(char ch:str.toCharArray()) {
			len++;
		}
		
		for(int i=0;i<len;i++) {
			if(i==pos){
				newstr= newstr+substr+str.charAt(i);
			}
			else {
				newstr=newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);

	}

}
