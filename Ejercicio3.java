package src;
import java.util.*;
public class Ejercicio3{
public static void main(String[] args){
Ejercicio3 t = new Ejercicio3();
}	
//global a mi clase tarea1
int[] elementos = new int[10];
Scanner scanner = new Scanner(System.in);
	public Ejercicio3(){
	pedirValor();
	for(int i = 0 ; i < 8; i++){
	mostrarDato(i);
	}
	buscarValor();
	}

	public void mostrarDato(int numero){
	System.out.println("El indice es "+numero+ " el valor es: "+ elementos[numero]);
	}
	
	public void pedirValor(){
		int i=0;
		while(i < 8){
		System.out.println("Ingres el valor Entero No. "+i+": ");
		int valor = scanner.nextInt();
			if (valor % 2 == 0){
			elementos[i] = valor;
			i++;
			}else{
			System.out.println("No es entero");
			}
		}
	}
	public void buscarValor(){
		System.out.println("Ingrese el valor a buscar");
		int val = scanner.nextInt();
		for(int i = 0 ; i< 8; i++){
			if (val == elementos[i]){
			System.out.println("Se encontro !!!!!!!!!");
			}else{
			System.out.println("No se encontro ://///////");
			}
		}
	}
}
