/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciospoo;

import javax.swing.JOptionPane;

/**
 *
 * @author CHAMBULE
 */
public class Vendedor extends Funcionario {
    
    private double comissao;
    
    
  public double calcularSalario(){
  
   double  salarioFinal= getSalario() + comissao;
      
   JOptionPane.showMessageDialog(null,JOptionPane.INFORMATION_MESSAGE);
        return salarioFinal;

  }
    

    public Vendedor(double comissao, String nome, String bi, String funcao, double salario) {
        super(nome, bi, funcao, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    
    
}
