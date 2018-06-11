/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.util.*;

/**
 *
 * @author ESFOT
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int contador=0;
        int opcion ;
        int contadorFavorito = 0;
       // Autor[] autor = new Autor[1];
        Libros[] libro = new Libros[10];
        Libros[] favorito = new Libros[10];
        //ListaAutor [] lista = new ListaAutor[10];
        
        int contadorFavoritos;
        
        do {
            
            System.out.println("\tMenú");
            System.out.println("\n1. Ingresar un nuevo libro en la biblioteca ");
            System.out.println("2. Imprimir la lista de favoritos");
            System.out.println("3. Contar libros de autor");
            System.out.println("4. Salir");
            
            System.out.println("Ingrese una opción ");
            opcion=lector.nextInt();
            
            switch (opcion){
                
                case 1:
                    
                    System.out.println("Ingrese el título del libro: ");
                    lector.nextLine();
                    String tituloLibro = lector.nextLine();
                    
                    System.out.println("Ingrese el año de publicación del libro: ");
                    int anioLibro = lector.nextInt();
                    
                    System.out.println("Ingrese información del autor");
                    System.out.println("Ingrese el nombre del autor: ");
                    lector.nextLine();
                    String nombreAutor = lector.nextLine();
                    
                    //lista[contador] = new ListaAutor(nombreAutor);
                    
                    System.out.println("Ingrese el país de nacimiento del autor: ");
                    //lector.nextLine();
                    String paisAutor = lector.nextLine();
                    Autor autor = new Autor (nombreAutor, paisAutor);
                    
                    libro [contador] = new Libros(tituloLibro, autor, anioLibro );                   
                    
                    System.out.println("\nEste libro esta entre sus favoritos ");
                    System.out.println("1. SI\n2. NO");
                    int favoritoOp = lector.nextInt();
                    
                    if (favoritoOp == 1){
                        
                        favorito [contadorFavorito] = new Libros(tituloLibro, autor, anioLibro); 
                        contadorFavorito++;
                        
                    }
                    
                    System.out.println("\t\nEl libro ingresado es ");
                    
                    System.out.println(libro[contador]);
                    
                    contador++;
                    
                    if(contador==10){
                        System.out.println("Ya ingreso el numero máximo de libros");
                    }
                    
                    break;
                
                case 2:
                    System.out.println("\t\nLista de favoritos");
                    
                    for(int i=0; i<contadorFavorito; i++){
                        System.out.println(favorito[i]);
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("\n\tLista de autores");
                    
                    for(int j=0 ; j<contador ; j++){
                        System.out.println((j+1)+". "+ libro[j].getAutor());
                    }
                    
                    
                    break;
                    
                case 4:
                    System.out.println("Gracias");
                    break;
                
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
                
                
                
            }
            
            
            
        } while (opcion != 4);
        
        
    }
}
