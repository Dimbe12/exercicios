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
public class contaCorrenteEspecial  extends ContaCorrente{
    
    public contaCorrenteEspecial(double saldoInicial) {
        super(saldoInicial);
    }
  
    public void Levantar(double valor){
    
    double taxa=valor*0.001;
    
    double total = valor +taxa;
    
    if(valor>0 && saldo>= total){
    
    saldo -= total;
    JOptionPane.showMessageDialog(null,"levantou   "  + valor);
    }
    else{
    
    
    JOptionPane.showMessageDialog(null,"saldo  insuficiente ");
    
    }
 
  }
   
    public  double ObterSaldo(){
 
        return saldo;
 }
    
    
    public static void main (String[] args){
    double saldoInicial  =Double.parseDouble(JOptionPane.showInputDialog("digite o saldo inicial"));
         
    contaCorrenteEspecial conta = new contaCorrenteEspecial(saldoInicial);
    double valorLevantar  =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a levantar"));
         conta.Levantar(valorLevantar);
    
        JOptionPane.showMessageDialog(null,"saldo actual" + conta.ObterSaldo()  );

    
    
    }
    
}
