/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mapa;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Cintas
 */
public class MAPA {
    
     public static void main(String args[]) { 
         //Digite o exame que deseja fazer a verificação.*
        int tt = Integer.parseInt(JOptionPane.showInputDialog("Digite o exame que deseja verificar : \n 1-Glicemia \n 2-Colesterol \n 3-Triglicerideos "));
        
        if(tt < 1 || tt > 3){
            JOptionPane.showMessageDialog(null,"Numero invalido \n Digite novamente!");
        }
        switch(tt){ 
  //caso queira fazer o exame de glicemia escolha a opção 1.
            case  1 -> {
       Glicemia cg = new Glicemia();
       cg.Cadastro();
       cg.mostrarResultado();
     }
    //caso queira fazer o exame de colesterol escolha a opção 2.
            case 2-> {
      Colesterol cc = new Colesterol ();
       cc.Cadastro();
       cc.mostrarResultado();
      }
    //caso queira fazer o exame de triglicerideos escolha a opção 3.
     case 3 ->{
     Triglicerideos ct = new Triglicerideos();
     ct.Cadastro();
     ct.MostrarResultado();  
   
      }
        }
    
     
     
         
}
}