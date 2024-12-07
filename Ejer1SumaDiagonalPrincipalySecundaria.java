/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1sumadiagonalprincipalysecundaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer1SumaDiagonalPrincipalySecundaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner (System.in); 
        
        System.out.println("ingrese la dimension de la matriz: ");
        int d = teclado.nextInt(); 
        
        int matriz [][] = new int [d][d]; 
        
        System.out.println("INGRESE LOS ELEMENTOS: ");
        
        for (int i=0;i<d;i++){
            for (int j=0;j<d;j++){
                matriz [i][j] = teclado.nextInt(); 
            }
        }
        
        //mostrar matriz 
        for (int i=0;i<d;i++){
            for (int j=0;j<d;j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        
        //suma diagonal principal
        int suma1=0; 
        
        for (int i=0;i<d;i++){
            suma1 = suma1 + matriz[i][i];
        }
        
        //suma diagonal secundaria 
        int suma2=0;
        
        
        for (int i=0;i<d;i++){          
        suma2 = suma2 + matriz[i][d-1-i];  
        }
       
        
        
        System.out.println("SUMA EN LA PRINCIPAL ES: " + suma1);
        System.out.println("SUMA EN LA SECUNDARIA ES: " + suma2);
        
    }
    
}


