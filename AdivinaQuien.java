package examen_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import pruebas.pr;

public class AdivinaQuien {
    // Lista de posibles atributos
	public static void main(String[] args) {
   	 Scanner sc = new Scanner(System.in);
       Persona[] persona = new Persona[10];
       for (int i = 0; i < 10; i++) {
           persona[i] = new Persona() {};
       }
       //contadores de los atributos
       int espada = 0;
       int millonario = 0;
       int mamado = 0;
       int Feo = 0;
       int miedoCucarachas = 0;
       int estaCansado = 0;
       int estaEnfermo = 0;
       int estaTriste = 0;
       int estaFeliz = 0;
       System.out.println("JUEGO ADIVINA QUIEN?");

       List<String> caracteristicasImportantes = Arrays.asList("Es bizco", "Es pelon", "Tiene brazos", 
				"Está Fuerte", "Esta cansado", "Está Feo", "Está Enfermo", "Está Triste", "Está Feliz");

       for (Persona personas : persona) {
           System.out.print(personas.getNombre() + ": ");
           int contador = 0;
           for (String caracteristica : caracteristicasImportantes) {
               switch (caracteristica) {
                   case "Es bizco":
                       if (personas.getbizco()) {
                           espada++;
                           System.out.print("Es bizco, ");
                           contador++;
                       }
                       break;
                   case "Es pelon":
                       if (personas.getpelon() ) {
                           millonario++;
                           System.out.print("Es pelon, ");
                           contador++;
                       }
                       break;
                   case "Tiene brazos":
                       if (personas.getbrazos()) {
                           mamado++;
                           System.out.print("Tiene brazos, ");
                           contador++;
                       }
                       break;
                   case "Está Feo":
           if (personas.getEstaFeo()) {
               Feo++;
               System.out.print("Está Feo, ");
               contador++;
           }
           break;
                   case "Está Fuerte":
           if (personas.getfuerte()) {
               miedoCucarachas++;
               System.out.print("Está Fuerte, ");
               contador++;
           }
           break;
                   case "Esta cansado":
           if (personas.getEstaCansado()) {
               estaCansado++;
               System.out.print("Esta cansado, ");
               contador++;
           }
           break;
                   case "Está Enfermo":
           if (personas.getEstaEnfermo()) {
               estaEnfermo++;
               System.out.print("Está Enfermo, ");
               contador++;
           }
           break;
                   case "Está Triste":
           if (personas.getEstaTriste()) {
               estaTriste++;
               System.out.print("Está Triste, ");
               contador++;
           }
           break;
                   case "Está Feliz":
           if (personas.getEstaFeliz()) {
               estaFeliz++;
               System.out.print("Está Feliz, ");
               contador++;
           }
           break;
               }
               if (contador == 4) {
                   break;
               }
           }
           System.out.println("");
       }
       
      
        
       System.out.println("QUE COMIENCE EL JUEGO");
       
       int personaElegida = new Random().nextInt(10);
       
       //Menú que permite realizar 3 preguntas
       for (int contadorPreguntas = 0; contadorPreguntas < 5; contadorPreguntas++) {
           System.out.println("Elija una opción para descartar jugadores:");
           System.out.println("1. ¿Es bizco?");
           System.out.println("2. ¿Es pelon?");
           System.out.println("3. ¿tiene brazos?");
           System.out.println("4. ¿Está Feo?");
           System.out.println("5. ¿esta fuerte?");
           System.out.println("6. ¿Está Cansado?");
           System.out.println("7. ¿Está Enfermo?");
           System.out.println("8. ¿Está Triste?");
           System.out.println("9. ¿Está Feliz?");
           
           int opcion = sc.nextInt();
           switch (opcion) {
               case 1:
                   for (int i = 0; i < 10; i++) {
                   	  if (persona[i] != null && !persona[i].getbizco()) {
                             persona[i] = null;
                         }
                     }
                     break;
               case 2:
               	for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getpelon()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	case 3:
               		for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getbrazos()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	case 4:
               	for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getEstaFeo()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	case 5:
               	for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getfuerte()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	case 6:
               	for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getEstaCansado()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	case 7:
               	for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getEstaEnfermo()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	case 8:
               	for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getEstaTriste()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	case 9:
               	for (int i = 0; i < 10; i++) {
               		  if (persona[i] != null && !persona[i].getEstaFeliz()) {
               	            persona[i] = null;
               	        }
               	    }
               	    break;
               	}
        // Aquí es donde debemos actualizar el número de personas elegidas después de cada pregunta.
           int numeroPersonasElegidas = 0;
           for (int i = 0; i < 10; i++) {
           if (persona[i] != null) {
           numeroPersonasElegidas++;
           }
           }
           // Si después de la pregunta sólo queda una persona, podemos asumir que esa es la elegida y terminar el juego.
           if (numeroPersonasElegidas == 1) {
           for (int i = 0; i < 10; i++) {
           if (persona[i] != null) {
           	System.out.println("La persona elegida es " + persona[i].getNombre());
           	break;
           	}
           	}
           	return;
           	}
           System.out.println("Las personas que cumplen con la característica son: ");
           for (int i = 0; i < 10; i++) {
           if (persona[i] != null) {
           System.out.println((i + 1) + ". " + persona[i].getNombre());
           }
           }
           System.out.println("");
           }
       System.out.println("Elige la persona que crees que es la elegida (Introduce el número de la persona):");
       int eleccionUsuario = sc.nextInt();
       eleccionUsuario--;

     //Comprobamos si la elección del usuario es correcta
       if (persona[eleccionUsuario] != null) {
           System.out.println("¡Correcto! La persona elegida es " + persona[eleccionUsuario].getNombre());
       } else {
           System.out.println("Incorrecto, la persona elegida no cumplía con las características");
       }
       }

       }
           
            //
