/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciospoo;

/**
 *
 * @author CHAMBULE
 */
public class Livro extends Produto{
    
    
    private String autor;

    public Livro(String autor, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return String.format(autor, super.toString());
    }



}
