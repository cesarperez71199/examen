/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencambioclimatico;

import java.util.Scanner;

/**
 *
 * @author Cesar Perez
 */
public class ExamenCambioClimatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada= new Scanner(System.in);
        int respuesta=0;
        int resupuestaCorrecta = 0;
        
     
        System.out.println("Examen sobre el cambio climatico");
        
        System.out.println("El examen consta de cinco preguntas de opcion multiple "
                + "Si tu respuesta es inciso a deberas teclear 1 si es b sera 2 y asi sucesivamente");
        
        
        System.out.println("Pregunta 1");
        System.out.println("¿Cuales son las principales amenazas del cambio climatico?");
        System.out.println("a) aumento de temperatura, subida de nivel del mar, colapso de ecosistemas ");
        System.out.println("b) colapso de la economia, subida del dolar, surgimiento de una nueva economia");
        System.out.println("c) llegada de aliens, cruz azul campeon de liga, antuna seleccionado nacional ");
        System.out.println("d) extincion de especies, emisiones de CO2, aumento de la poblacion");
        
        respuesta= entrada.nextInt();
        
        switch(respuesta){
            case 1:
               System.out.println("Tu respuesta fue inciso a)");
                break;
            
            case 2:
                System.out.println("Tu respuesta fue inciso b)");
                break;
                
            case 3:
                System.out.println("Tu respuesta fue inciso c)");
                break;
                
            case 4:
                System.out.println("Tu respuesta fue inciso d)");
                break;
                
            default:
                System.out.println("Tu respuesta no es valida");  
                
        }
        
        if(respuesta==1){
            resupuestaCorrecta+=1;
        }
        
      
        System.out.println("Pregunta 2");
        System.out.println("¿Como afecta a las personas el cambio climatico");
        System.out.println("a) deformaciones, cambio en el adn, aumento de peso");
        System.out.println("b) aumento de temperatura, subida de nivel del mar, colapso de ecosistemas");
        System.out.println("c) malos salarios, aumento en el costo del petroleo, aumento de inflacion");
        System.out.println("d) mal internet, calor extremo, guerras mundiales");
        
        
        respuesta= entrada.nextInt();
        
        switch(respuesta){
            case 1:
                System.out.println("Tu respuesta fue inciso a)");
                break;
            
            case 2:
                System.out.println("Tu respuesta fue inciso b)");
                break;
                
            case 3:
                System.out.println("Tu respuesta fue inciso c)");
                break;
                
            case 4:
                System.out.println("Tu respuesta fue inciso d)");
                break;
                
            default:
                System.out.println("Tu respuesta fue invaalida");
                
        }
        
        if(respuesta==2){
            resupuestaCorrecta+=1;
        }
        
        
        System.out.println("Pregunta 3");
        System.out.println("¿Cuales son las soluciones al cambio climatico?");
        System.out.println("a) conciertos de peso pluma");
        System.out.println("b) dejar de tirar basura en la calle");
        System.out.println("c) acabar con la desigualdad economica mundial");
        System.out.println("d) reducir las emisiones de carbono");
        
        respuesta= entrada.nextInt();
        
        switch(respuesta){
            case 1:
                System.out.println("Tu respuesta fue inciso a)");
                break;
            
            case 2:
                System.out.println("Tu respuesta fue inciso b)");
                break;
                
            case 3:
                System.out.println("Tu respuesta fue inciso c)");
                break;
                
            case 4:
                System.out.println("Tu respuesta fue inciso d)");
                break;
                
            default:
                System.out.println("Tu respuesta fue invalida");
                
        }
        
        if(respuesta==4){
            resupuestaCorrecta+=1;
        }
        
        
        System.out.println("Pregunta 4");
        System.out.println("¿Como afecta el cambio climatico a la agricultura y alimentos?");
        System.out.println("a) No obtienen nutrientes de la tierra");
        System.out.println("b) provocan inundaciones y sequias que aummentan las plagas ");
        System.out.println("c) migracion de agricultores dejando su cosecha a la deriva");
        System.out.println("d) Ninguna de las anteriores");
        
        
        respuesta= entrada.nextInt();
        
        switch(respuesta){
            case 1:
                System.out.println("Tu respuesta fue inciso a)");
                break;
            
            case 2:
                System.out.println("Tu respuesta fue inciso b)");
                break;
                
            case 3:
                System.out.println("Tu respuesta fue inciso c)");
                break;
                
            case 4:
                System.out.println("Tu respuesta fue inciso d)");
                break;
                
            default:
                System.out.println("Tu respuesta fue invalida");
                
        }
        
        if(respuesta==2){
            resupuestaCorrecta+=1;
        }
       
        
        System.out.println("Pregunta 5");
        System.out.println("¿Que pasa si no se hace nada?");
        System.out.println("a) El humano migrara a la luna");
        System.out.println("b) extincion de especies");
        System.out.println("c) derretimiento de los polos ocasionando extincion de fauna y flora reduciendo la produccion agricola");
        System.out.println("d) la caida de EU como potencia mundial");
        
        
        respuesta= entrada.nextInt();
        
        switch(respuesta){
            case 1:
                System.out.println("Tu respuesta fue inciso a)");
                break;
            
            case 2:
                System.out.println("Tu respuesta fue inciso b)");
                break;
                
            case 3:
                System.out.println("Tu respuesta fue inciso c)");
                break;
                
            case 4:
                System.out.println("Tu respuesta fue inciso d)");
                break;
                
            default:
                System.out.println("Tu respuesta fue invalida");
                
        }
        
        if(respuesta==3){
            resupuestaCorrecta+=1;
        }
        
        
        
        if(resupuestaCorrecta==5){   
            System.out.println("EXCELENTE");
         
        }else{
            
            if (resupuestaCorrecta==4) {
                System.out.println("MUY BIEN");
                
            }else{
                System.out.println("Es hora de estudiar mas acerca del cambio climatico");
            }
        }
        
        
       
              
    }
    
}
