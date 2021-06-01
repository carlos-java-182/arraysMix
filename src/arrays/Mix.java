package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Mix {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int numeros2[] = new int[10];
		int numeros3[] = new int[20];

		Scanner entrada = new Scanner(System.in);

		System.out.println("Arreglo 1");

		for (int i = 0; i < 10; i++) {

			System.out.print("Digita el número: " + (i+1));
			numeros[i] = entrada.nextInt();

		}
		
		System.out.println("Arreglo 2");
		
		for (int j=0; j <10; j++) {
			
			System.out.print("Digita el número: "+ (j+1));
			numeros2[j] = entrada.nextInt();
		}
		
		System.out.println("La mezca de los dos arreglos es: ");
		
		int m=0;
		
		for(int k=0; k<10; k++) {
			
			
			
			numeros3[m]=numeros[k];
			m++;
			numeros3[m]=numeros2[k];
			m++;
			
	}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("\n El arreglo 1 es: "+ (i+1)+".- "+numeros[i]);
					
		}
		for (int j = 0; j < numeros2.length; j++) {
			System.out.print("\n El arreglo 2 es: "+ (j+1)+".- "+numeros2[j]);
		}
		for (int k = 0; k < numeros3.length; k++) {
			System.out.print(" \n El arreglo 3 es: "+ (k+1)+".- "+numeros3[k]);
		}
		
}}
