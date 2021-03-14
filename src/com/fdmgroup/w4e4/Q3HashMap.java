//Q3: Use a HashMap to create a reusable class for choosing one of the 13 predefined colors 
//    in class Color. The names of the colors should be used as keys, and the predefined Color
//    objects should be used as values. It should return the HashMap .

package com.fdmgroup.w4e4;
import java.awt.Color;
import java.util.HashMap;

public class Q3HashMap {
	public static HashMap colors(String[]colorname, Color[] colorvalue) {
		HashMap colors = new HashMap();
		for (int i=0;i<colorname.length;i++) {
			colors.put(colorname[i], colorvalue[i]);
		}
		return colors;	
	}
	
	public static void main(String[] args) {
		String[] colorname = {"white","lightGray","gray","darkGray","black","red","pink","orange","yellow","green","magenta","cyan","blue"};
		Color[] colorvalue = {Color.white,Color.lightGray,Color.gray,Color.darkGray,Color.black,Color.red,Color.pink,Color.orange,Color.yellow,Color.green,Color.magenta,Color.cyan,Color.blue};
		for (int i=0;i<colorname.length;i++) {
			System.out.println(colorname[i]+": "+colors(colorname, colorvalue).get(colorname[i]));
	}
	}
}
