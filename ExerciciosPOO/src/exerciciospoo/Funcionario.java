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
public class Funcionario {
    
         private String nome;
         private String bi;
         private String funcao;
         private double salario;
         
         
       public void exibirDados(){
       
       String dados = "Nome:"     +      nome  +     "/BI:"      +     bi   +
                 "/Salario:"    +  salario  + 
             "/Funcao:"      +  funcao  ;
       JOptionPane.showMessageDialog(null,dados," Dados do Funcionario",JOptionPane.INFORMATION_MESSAGE);
       }
        public double calcularSalario( ){
        return salario;
        } 
         
         

    public Funcionario(String nome, String bi, String funcao, double salario) {
        this.nome = nome;
        this.bi = bi;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
         
         
      public static void main (String[]args) {
           
      
      Funcionario funcionario = new Funcionario("Antonio", "445556N","IT",120.000);
      
              funcionario.exibirDados();
      
      }  
   


}
