package com.student.util;
import java.util.Scanner;

public class ScannerUtil {

	 private final static Scanner sc = new Scanner(System.in);
	 
	 public static String getString(String message) {
		 System.out.println(message);
		return sc.next();		 
	 }
	 
	 public static int getInt(String message) {
		 System.out.println(message);
		 return sc.nextInt();
	 }
	 
	 public static Long getLong(String message) {
		 System.out.println(message);
		 return sc.nextLong();
	 }
}

