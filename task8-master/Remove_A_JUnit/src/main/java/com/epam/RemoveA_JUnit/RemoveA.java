package com.epam.RemoveA_JUnit;

public class RemoveA {

	public String removeA(String string) {
		String ans = string;
		if(string.length() >= 1 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')) {
			ans = string.substring(1);
		}
		if(string.length() >= 2 && (string.charAt(0) != 'A'|| string.charAt(0) != 'a') && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			ans = string.charAt(0) + string.substring(2);
		}
		if(string.length() >= 2 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')  && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			ans = string.substring(2);
		}
		return ans; 
	}

}
