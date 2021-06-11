package src;
import java.util.*;
import java.util.Random;
public class Ejercicio2{
public static void main(String[] args){
Ejercicio2 t = new Ejercicio2();
}	
//global a mi clase tarea1

int[] elementos = new int[11];
int rep = 0;
	public Ejercicio2(){
		for(int i = 0 ; i < 10; i++){
		elementos[i] = (int)(Math.random()*100+1);
		}
		Ordenar();
		for(int i = 0 ; i < 10; i++){
		mostrarDato(i);
		VerRepeticion(i);
		}
		System.out.println("Se repitio " + rep);
	}


	public void mostrarDato(int numero){
		System.out.println("El indice es "+numero+ " el valor es: "+ elementos[numero]);
	}
	public void VerRepeticion(int numero){
		for(int i = 0 ; i< 10; i++){
			if (elementos[0] == i){
			rep++;
			}
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
	}

}
