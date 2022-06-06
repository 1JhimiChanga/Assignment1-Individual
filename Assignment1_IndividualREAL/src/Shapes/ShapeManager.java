package Shapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ShapeManager {
	
	private Shape[] shapeList;
	private int size;
	private String fileName1;

	public ShapeManager(String fileName) throws ClassNotFoundException, NoSuchMethodException, SecurityException, FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.fileName1 = fileName;
		File newFile = new File(fileName1);
		Scanner scan = new Scanner(newFile);
		size = Integer.parseInt(scan.next());
		shapeList = new Shape[size + 1];
		fillShapeList(fileName);
	}
	
	

	private void fillShapeList(String file) throws ClassNotFoundException, NoSuchMethodException, SecurityException, FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		File newFile = new File(fileName1);
		Scanner scan = new Scanner(newFile);
		
		
		// skipping first number 
		
		
		String element = scan.next();
		
		while(scan.hasNext()) {
			element = scan.next();
			Object o = null;
			StringTokenizer st = new StringTokenizer(element, " ");
			
			String className = "Shapes." + st.nextToken() ;
			Class shapeName = Class.forName(className);
			
			Class paramTypes[] = new Class[2];
			paramTypes[0] = Double.TYPE;
			paramTypes[1] = Double.TYPE;
			
			Constructor ct = shapeName.getConstructor(paramTypes);
			
			Object argList[] = new Object[2];
			
			argList[0] = new Double(Double.parseDouble(scan.next()));
			argList[1] = new Double(Double.parseDouble(scan.next()));
			
			o = ct.newInstance(argList);
			
			ShapeManager.addShape(shapeList, (Shape) o);
		}
		scan.close();
		
	}



	private static void addShape(Shape[] shapeList, Shape addedItem) {
		for(int i = 0; i < shapeList.length -1; i++) {
			if (shapeList[i] == null) {
				shapeList[i] = addedItem;
				break;
			}
		}
	}
	
	public void displayShape() {
		int i;
		for(i = 0; i < shapeList.length -1; i++) {
			System.out.println(shapeList[i]);
			System.out.println(i);
		}
		
		
	}
	
	
	
		
		
	}
