package co.codesay.javapro;

import java.util.*;


public class MirrorInverse {

	public static void main(String[] args) {
		int[] arr = {3,4,2,0,1};
		
		if(isMirrorInverse(arr))
			System.out.println(" - A real mirror inverse array"); //Arrays.toString()+
		else
			System.out.println("Not a mirror inversed array");
	}
	
	static boolean isMirrorInverse(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[arr[i]] != i)
				return false;
		}
		return true;
	}
}
