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
public class DVD extends Produto {
    private double duracao;

    public DVD(double duracao, String nome, double preco) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
