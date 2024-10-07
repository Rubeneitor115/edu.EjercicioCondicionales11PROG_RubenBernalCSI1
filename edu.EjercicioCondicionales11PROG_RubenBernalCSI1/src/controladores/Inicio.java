/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 071024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 071024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int dia, mes, anyo;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que escriba por consola el dia, el mes y el año y los guardo en sus variables
		System.out.println("Escriba el dia: ");
		dia = sc.nextInt();
		System.out.println("Escriba el mes: ");
		mes = sc.nextInt();
		System.out.println("Escriba el año: ");
		anyo = sc.nextInt();
		
		//Controlo que la fecha sea correcta
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if(dia >=1 && dia <= 31) {
				System.out.println("La fecha introducida es correcta!!!");
			}else {
				System.err.println("La fecha introducida no es correcta");
			}
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia >=1 && dia <= 30) {
				System.out.println("La fecha introducida es correcta!!!");
			}else {
				System.err.println("La fecha introducida no es correcta");
			}
		}else {
			if(dia >=1 && dia <= 28) {
				System.out.println("La fecha introducida es correcta!!!");
			}else {
				System.err.println("La fecha introducida no es correcta");
			}
		}

	}

}