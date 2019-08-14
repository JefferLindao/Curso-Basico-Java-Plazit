package com.JefferCodi.holamundo;


/**
 * @author jefferlindao
 *  Variable 
 *  Espacio de memoria al que le asignamos 
 *  un contenido, puede ser un valor numerico
 *  de tipo caracter o cadena de caracteres,
 *  
 *  
 *  tipos de datos 
 *  tipo primitivo
 *  byte short int long 
 *  
 *  punto flotante 
 *  float double
 *  
 */
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo :)");
		
		//Enteros
		byte edad = 127;
		short year = 2020;
		int idUser = 244775;
		long id_twiter = 454781787474824887L;
		
  		//Punto Flotante
		float diametro = 34.25f;
		double precio = 198494.818155;
		
		//texto
		char genero = 'F';
		//logico
		boolean isVisible = true;
		boolean funciona = false;
		
		int variable = 2;
		int _variable = 3;
		int $variable = 4;		
		System.out.println(idUser);
		
		
		//operadores aritmeticos
		
		int a = 1;
		int aa = a+a;
		System.out.println("el valor de aa: " + aa);
		
		double x = 2.35;
		int y = 9;
		float w = (float)x+y;
		
		System.out.println(w);
		
		System.out.println(w*2);
		
		double k = 4/0.000002;
		System.out.println(k);
		System.out.println(7%2);
		
		int f = 2;
		int g=3;
		f+=g;
		System.out.println(f);
	}
}
