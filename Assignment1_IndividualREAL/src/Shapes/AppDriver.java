package Shapes;

import java.io.File;
import java.lang.reflect.*;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

import ShapeManager.ShapeManager;

public class AppDriver {

	
	
	public static void main (String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ShapeManager newList = new ShapeManager("res/polyfor1.txt");
		newList.displayShape();
		
		
//		for(int i = 0; i < args.length; i++ ) {
//			if(args[i].contains("-F") || args[i].contains("-f")) {
//				String fileName = args[i];
//			} else if (args[i].contains("-T") || args[i].contains("-t")){
//				String compareType = args[i];
//			} else if (args[i].contains("-S") || args[i].contains("-s")) {
//				String sortType = args[i];
//				
//			}
//			
//		}
	
					
		}

}
