/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Cintas
 */
public class Triglicerideos extends cadastrarExame {
    private double tgcl;
    private String tgclTeste;
       

    
   //Getters e setters
public double getTgcl (){
return this.tgcl;
}
public void setTgcl(double tgcl){
    this.tgcl = tgcl;
}

public String getTgclTeste(){
    return this.tgclTeste;
}
public void setTgclTeste (String tgclTeste){
    this.tgclTeste = tgclTeste;
      }


public void Cadastro(){
    super.Cadastro();
    this.tgcl = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de triglicerideo por mg/l : "));
    
    
}

   
  ////Mostrando o resultado na tela
public void MostrarResultado(){
 
    
    // public void TesteTriglicerideo(){
     if(this.getIdade() <= 9 && this.tgcl < 75){
        this.tgclTeste = "Triglicerideo Bom";
   }
    else if(this.getIdade()>= 10 && this.getIdade() <= 19 &&this.tgcl <90 ){
        this.tgclTeste = "Triglicerideo Bom";
   }
    else if(this.getIdade() > 20 && this.tgcl < 150){
        this.tgclTeste = "Triglicerido Bom";
    }
    else{
        this.tgclTeste = "Triglicerido Ruim";
    }
     //
     //
     //
     String msg =  "Nome paciente : " + this.getNomepaciente() + "\n\n";
     msg += "Ano nascimento: " + this.getAnonascimento() + "\n\n"; 
     msg += "Tipo sanguineo: " + this.getTiposanguineo() + "\n\n";
     msg += "Triglicerídeo por mg/l : " + this.getTgcl() + "\n\n";
     msg +=  this.getTgclTeste()+ "\n\n";
               
     JOptionPane.showMessageDialog(null,msg);
               
    }
}



