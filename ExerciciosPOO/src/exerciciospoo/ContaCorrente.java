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
public class ContaCorrente {
    
   
    private String pin;
    private int ID;
    private boolean ativo;
    private float taxa;
     double saldo; 
     private float quantiaDepositar;
      private float quantiaDepsitar;

    
     
  public void Depositar( double valor){
      
      if(valor >0){
      
          saldo += valor;
          
          JOptionPane.showMessageDialog(null,"Deposito de   "   +   valor   +"   realizdo com sucesso");
          
      }
      else{
      
      JOptionPane.showMessageDialog(null,"A quantia de deposito deve ser posetivo");
      }
  
   } 

  public void  Levantar (double valor ){
  
 


  double taxa= valor*0.005;
  double total = valor + taxa;

if(valor>0 && saldo>=total){
    
saldo -=total;

JOptionPane.showMessageDialog(null," Levantou   " +valor+   " com sucesso    " );
        }

else{

JOptionPane.showMessageDialog(null,"valor insuficiente   ");
}
  
  }
  public  double ObterSaldo(){
 
        return saldo;
 
 }
  
  
  
  
  
  
  
    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void set(double saldo) {
        this.saldo = saldo;
    }

    
    
    
    public static  void main (String []args){
    
    ContaCorrente conta = new ContaCorrente(0);
 double valorDeposito  =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a depositar"));
         conta.Depositar(valorDeposito);
         
         
         
    double levantar  =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a levantar"));
                 conta.Levantar(levantar);
    
    
    
    JOptionPane.showMessageDialog(null,"saldo actual   "  + conta.ObterSaldo());
    
    }

    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    

  
}
