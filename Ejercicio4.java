package src;
import java.util.*;
public class Ejercicio4{
public static void main(String[] args){
Ejercicio4 t = new Ejercicio4();
}	
//global a mi clase tarea1
int[] elementos = new int[10];
int[] elementos2 = new int[10];
Scanner scanner = new Scanner(System.in);
	public Ejercicio4(){
	pedirValor();
	Ordenar();
	completar();
	}

	public void mostrarDato(int numero){
	System.out.println("El indice es "+numero+ " el valor es: "+ elementos[numero]);
	}
	
	public void pedirValor(){
		int i=0;
		while(i < 10){
		elementos[i] = (int)(Math.random()*100+1);
		i++;
		}
	}
	
	public void completar(){
		for(int i = 0 ; i < 10; i++){
			elementos2[i] = elementos[0] - elementos[i];
		}
		for(int i = 0 ; i < 10; i++){
			System.out.println("El indice es " + i + " Distancia del mayor: " + elementos2[i]);
		}
		
	}
	
		public void Ordenar(){
	int temporal=0;
		for (int i = 0;i < 10; i++){
			for (int j = 0; j< 10-1; j++){
				if (elementos[j] < elementos[j+1]){ // Ordena el array de mayor a menor, cambiar el "<" a ">" para ordenar de menor a mayor
				temporal = elementos[j]; 
				elementos[j] = elementos[j+1]; 
				elementos[j+1] = temporal;
				}
			}
		}
		System.out.println("El mayor es " + elementos[0]);
	for(int i = 0 ; i < 10; i++){
			System.out.println("El indice es " + i + " Mayor a menor : " + elementos[i]);
		}
	}
}
