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
public class cadastrarExame {
    
  private int anoNascimento;
  private String tipoSanguineo;
  private String nomePaciente;
  private int idade;
  
  //gets e sets
  
  
  public void setAnonascimento (int anoNascimento){
      this.anoNascimento = anoNascimento;
  }
 
   public int getAnonascimento(){
    return this.anoNascimento;
  }
   
   public void setTiposanguineo (String tiposanguineo){
       this.tipoSanguineo = tiposanguineo;
  }
   
   public String getTiposanguineo(){
       return this.tipoSanguineo;
  }
   
   public void setNomepaciente( String nomepaciente){
       this.nomePaciente = nomepaciente;
  }
   
   public String getNomepaciente(){
       return this.nomePaciente;
  }
   public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
   
    /**
     *
     */
   
    public void Cadastro(){
        
    this.nomePaciente = JOptionPane.showInputDialog("Digite o Nome do Paciente: ");
    this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano de nascimento: "));
    this.tipoSanguineo = JOptionPane.showInputDialog("Digite o Tipo sanguineo:");
    

    this.idade = 2023 - this.anoNascimento;
   }
    //
    //
     public void mostrarResultado(){
     JOptionPane.showMessageDialog(null," Paciente : " + this.nomePaciente + "\n\nAno nascimento: :" + this.anoNascimento + "\n\n Tipo sanguineo :"+ this.tipoSanguineo);
     
     }
}
   
   
   
