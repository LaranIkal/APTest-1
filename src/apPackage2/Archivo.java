package apPackage2;

import java.util.Scanner;

public class Archivo {

	private static String nombreDelArchivo;
	private static int longitudDelNombre;
	public static final int longitudNombreDefault = 10;
 Archivo (){
	 
 }
 
 Archivo (String nombreArchivo , int longitudNombre ){
	
	nombreDelArchivo = nombreArchivo;
	 if(nombreDelArchivo != null && !nombreDelArchivo.isEmpty()){
		//The isEmpty Method returns false if the string is empty. !String used to get true if string is empty.
		leerNombreArchivo();
		 
	}
	 if(longitudNombre == 0){
		 longitudDelNombre = longitudNombreDefault;
		 
	 }
	 else {
		 	longitudDelNombre = longitudNombre;
	 }
		 
	 
	 
	 
	 
 }
 
 public static void  setnombreDelArchivo (String fileName){
		
		nombreDelArchivo = fileName;
		
 }
 
 public static String  getnombreDelArchivo (){
		
		 
		return nombreDelArchivo;
 }
 
 public static void  setlongitudDelNombre (int fileLength){
	
	 longitudDelNombre = fileLength;
		
 }
 
 public static int  getlongitudDelNombre (){
		
	return longitudDelNombre;	
 }
 
 public static int  getlongitudDelNombreDefault (){
		
		return longitudNombreDefault;	
	 }
 public static void leerNombreArchivo() {

		System.out.print("Enter files name ");
		@SuppressWarnings("resource")
		Scanner file = new Scanner(System.in);

		System.out.println("10 character minimum length: ");
		nombreDelArchivo = file.nextLine();

		while (nombreDelArchivo.length() <= 10) {
			System.out.print("The file name is not big enough ");
			nombreDelArchivo = file.nextLine();
		}

		System.out.println("The file name is: " + nombreDelArchivo);

	}
}


