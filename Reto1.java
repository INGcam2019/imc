/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.util.Scanner;
/**
 *
 * @Camilo Muñoz
 */
public class Reto1 {

    /**
     * camilo muñoz
     */
    public static void main(String[] args) {
    // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
    //entrada texto simple
        String entrada=scanner.nextLine();
    //entrada texto string
        String valores[]=entrada.split(" ");
    //variable masa    
        double masa=Double.parseDouble(valores[0]);
    //variable altura
        double altura=Double.parseDouble(valores[1]);
    //variable edad
        double edad=Double.parseDouble(valores[2]);
    //variable imc
        double imc=0;
     /**
      * verifica los valores de entrada
      */
        if((masa>0 & masa<131)&(altura>=0.5 & altura<=2.5)&(edad>0&edad<121)){
            imc= Math.round((masa/(altura*altura))*10.0)/10.0;
    /**
     * verifica nivel bajo
     */
            if (imc<22 & edad <45){
                System.out.println(imc+" Bajo");
            }
     /**
      * verifica nivel medio
      */
            if (imc<22 & edad >=45){
                System.out.println(imc+" Medio");
            }
    /**
     * verifica nivel medio
     */
            
            if (imc>=22 & edad <45){
                System.out.println(imc+" Medio");
            }
     /**
      * verifica nivel alto
      */
            if (imc>=22 & edad >=45){
                System.out.println(imc+" Alto");
            }
        
        }
    /**
     * verifica error
     */
        else{
            System.out.println("ERROR");
            
        }
    }    
    }
    

