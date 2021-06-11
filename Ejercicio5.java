package src;
import java.util.*;
public class Ejercicio5 {

    public Ejercicio5() {
        InicializarArreglo(0,5,elementos);
        InicializarArreglo(1,7,elementos);
        InicializarArreglo(2,2,elementos);
        InicializarArreglo(3,3,elementos);
        InicializarArreglo(4,9,elementos);
        InicializarArreglo(5,5,elementos);
        InicializarArreglo(6,6,elementos);
        InicializarArreglo(7,8,elementos);
        InicializarArreglo(8,-50,elementos);
               // 5,7,2,3,9,5,6,8,-50} 
        
        InicializarArreglo(0,6,elementos2);
        InicializarArreglo(1,-50,elementos2);
          //     {6,-50} 
          
          
                  InicializarArreglo(0,1,elementos3);
                  InicializarArreglo(2,5,elementos3);
                  InicializarArreglo(3,4,elementos3);
                  InicializarArreglo(4,7,elementos3);
                  InicializarArreglo(5,6,elementos3);
                  InicializarArreglo(6,2,elementos3);
                  InicializarArreglo(7,7,elementos3);
                  InicializarArreglo(8,8,elementos3);
                  InicializarArreglo(9,3,elementos3);
                  InicializarArreglo(10,2,elementos3);
                  InicializarArreglo(11,9,elementos3);
                  InicializarArreglo(12,4,elementos3);
                  InicializarArreglo(13,5,elementos3);
                  InicializarArreglo(14,3,elementos3);
                  InicializarArreglo(15,6,elementos3);
                  InicializarArreglo(16,6,elementos3);
                  InicializarArreglo(17,8,elementos3);
                  InicializarArreglo(18,8,elementos3);
                  InicializarArreglo(19,-50,elementos3);
         // 1,5,4,7,6,2,7,8,3,2,9,4,5,3,6,6,8,8,-50
          valorMedio(elementos);
          valorMedio(elementos2);
          valorMedio(elementos3);
    }
int [] elementos = new int [100] ; 
int [] elementos2 = new int [100] ; 
int [] elementos3 = new int [100]  ; 
        
    public void InicializarArreglo(int cont,int a, int valor []){
                valor[cont] = a ;
    }
    
    public void valorMedio(int [] valor){
        int suma=0, valormedio =0;
        for (int i = 0; i < valor.length; i++) {
                if(valor[i] < 0){
                break;
                }else{
                    suma += valor[i]; 
                }
            }
        valormedio = suma/2;
        System.out.println("El valor medio de las notas  " + valormedio);
        }
    
    
    public static void main(String[] args) {
        Ejercicio5 n = new Ejercicio5();
    }
}
