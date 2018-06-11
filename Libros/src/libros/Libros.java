/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author ESFOT
 */
public class Libros {

    private String titulo;
    private Autor  autor;
    private int anio;
    private boolean favorito;

    public Libros(String titulo, Autor autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        //this.favorito = favorito;
    }

    public Libros(boolean favorito) {
        this.favorito = favorito;
    }
       

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        
        String stringLibros= "\nNombre del libro: " + titulo + "\nAño de publicación: " + anio ;
        stringLibros += "\nDatos del autor"+ autor;
         
        return stringLibros;
    }
   
    
}
