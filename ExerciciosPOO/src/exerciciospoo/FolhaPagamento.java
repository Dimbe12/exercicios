/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciospoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHAMBULE
 */
public class FolhaPagamento  {
    
public void processarPagamento( Funcionario funcionario){

     System.out.println(""+ funcionario.getClass().getSimpleName()+":"+ funcionario.calcularSalario());

}


       public static void main (String[]args){
        
           
           List<Funcionario>funcionario= new ArrayList<>();
           funcionario.add(new Gerente(900,"Antonio","57774e","Medico",600));
           funcionario.add(new Vendedor(6000,"Antonio","6677754k","IT",5000));

           FolhaPagamento folha= new FolhaPagamento(); 
            for( Funcionario f: funcionario){
            folha.processarPagamento(f);
            
            
            }
}

}
