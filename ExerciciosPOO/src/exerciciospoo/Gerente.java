/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciospoo;

import javax.swing.JOptionPane;

/**,+
 *
 * @author CHAMBULE
 */
public class Gerente extends Funcionario {
    
    private double bonus;

    
    
    
    
   public double calcularSalario( ){
   
     return getSalario() + bonus;
     
      
    }
   
   public void exibirDados(){
   
   String dados = String.format( "Nome:"     +     getNome() +     "/BI:"      +     getBi()   +
                 "/Salario:"    +  getSalario()  + 
             "/Funcao:"      +  getFuncao()+ "bonus:" + bonus, calcularSalario() );
   
    JOptionPane.showMessageDialog(null,dados," Dados Gerente",JOptionPane.INFORMATION_MESSAGE);
   
   }

    public Gerente(double bonus, String nome, String bi, String funcao, double salario) {
        super(nome, bi, funcao, salario=5000);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
     public static void main (String []args){
     
     
     Gerente gerente = new Gerente(6000,"Antonio","6677754k","IT",5000);
     
     gerente.exibirDados();
    
     }
   
    




}
