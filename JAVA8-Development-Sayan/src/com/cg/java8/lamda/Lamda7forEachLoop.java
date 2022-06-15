package com.cg.java8.lamda;

import java.util.ArrayList;
import java.util.List;

public class Lamda7forEachLoop {

	public static void main(String[] args) {
		List<String> mygames = new ArrayList<String>();
		
		mygames.add("Chess");
		mygames.add("Hocky");
		mygames.add("kabaddi");
		mygames.add("cricket");
		
		
		mygames.forEach(gm->System.out.println(gm));
	}
}
