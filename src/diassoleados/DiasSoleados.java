/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diassoleados;
//Se tienen los registros (guardados en un vector)que se hicieron del tiempo que hizo en la ciudad 
//de Medellín durante un año así (suponga 1 meses de 30 dias): 


//
//Si hacía día soleado se registraba un cero (0)
//Si hacía día nublado se registraba un uno (1)
//Si hacía día lluvioso se registraba un dos (2)
//
//utilizar una clase para crear e imprimir el vector
//
//luego muestre el siguiente MENU:
//Número de días soleados
//Número de días nublados
//Porcentaje de días soleados en relación a todo el mes
//
//utilizar otra clase para calcular los resultados y luego mediante la herencia
//entre clases muestre en el programa principal los resultados pedidos

public class DiasSoleados 
{

  
    public static void main(String[] args) 
    {
      
      eleccion objLeer=new eleccion();
      objLeer.LeerVector_Clima();
      int[] clima=new int[30];
      eleccion objImprimir=new eleccion();
      clima=objImprimir.LeerVector_Clima();
      objImprimir.Imprimir_vector(clima);
      eleccion objImprimirNum_DiasSoleados=new eleccion();
      objImprimirNum_DiasSoleados.ImprimirNum_DiasSoleados(clima);
    }
    
}
