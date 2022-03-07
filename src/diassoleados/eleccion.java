/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diassoleados;
import java.util.Random;

public class eleccion 
{
    public int[] LeerVector_Clima()
    {
        //para leer e imprimir vector
    Random NumeroAleatorio=new Random();
    int[] clima= new int[30];
    
    for (int i=0; i < 30; i++)
    {
    clima[i]=NumeroAleatorio.nextInt(3);//--->los 3 tipos de clima(0,1,2)
    }
    return clima;
    }
    
    public void Imprimir_vector(int[] clima)
    {
        System.out.println("\n\n Datos del vector");
        
        for (int i=0; i<30; i++)
        {
            System.out.print(clima[i] + " ");
        }
    }
    
    public void ImprimirNum_DiasSoleados(int [] clima)
    {
     int contadorSoleado=0;   
     int contadorNublado=0;   
     int contadorLluvioso=0;   
    for(int i=0; i<clima.length; i++)
    {
    if (clima[i]==0)
    {
    contadorSoleado++;
    }
    else if (clima[i]==1)
    {
    contadorNublado++;
    }
    else if (clima[i]==2)
    {
    contadorLluvioso++;
    }
    
    }
    System.out.println("Los dias soleados son: "+ contadorSoleado);
    System.out.println("Los dias nublados son: "+ contadorNublado);
    System.out.println("Los dias lluviosos son: "+ contadorLluvioso);
    }
    
}

