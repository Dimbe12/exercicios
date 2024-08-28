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
public class CD extends Produto {
    
    private int numeroFaixa;

    public CD(int numeroFaixa, String nome, double preco) {
        super(nome, preco);
        this.numeroFaixa = numeroFaixa;
    }

    public int getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(int numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }

    @Override
    public String toString() {
        return String.format(super.toString(),numeroFaixa);
    }
    
}
