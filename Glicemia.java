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
public class Glicemia extends cadastrarExame {
    private String glicoseMgl;
    private double glicoseDouble;
    private String result;
    

    
 //Getters e setters  
    public String getResult(){
        return this.result;
     }
    public void setResult(String result){
        this.result = result;
    }
    
    
    public Double getGlicosedouble(){
        return this.glicoseDouble;
     }
   public void setGlicoseDouble(double glicoseDouble){
       this.glicoseDouble = glicoseDouble;
     }
       
   
   public String getGlicoseMgl(){
        return this.glicoseMgl;
     }
   public void setGlicoseMgl(String glicoseMgl){
       this.glicoseMgl = glicoseMgl;
       
     }     

   
    @Override
    public void Cadastro(){
            super.Cadastro();
            this.glicoseMgl = JOptionPane.showInputDialog("Digite a glicose por Mg/litro");
            
    }
        
    
    //
    ////Mostrando o resultado na tela
    @Override
            public void mostrarResultado(){  
                
                 // public void classificarResult(){
        this.glicoseDouble = Double.parseDouble (this.glicoseMgl);
        if (this.glicoseDouble < 100){
            this.result ="Normoglicemia";
        }
        else if (this.glicoseDouble >= 100 && this.glicoseDouble < 126){
            this.result ="Pré-diabetes";
        }
        else if (this.glicoseDouble >= 126){
            this.result = "Diabetes estabelecida";
        }
                
              String msg =  "Nome paciente : " + this.getNomepaciente() + "\n\n";
                     msg += "Ano nascimento: " + this.getAnonascimento() + "\n\n"; 
                     msg += "Tipo sanguineo: " + this.getTiposanguineo() + "\n\n";
                     msg += "Glicose por Mg/litro : " + this.getGlicoseMgl() + "\n\n";
                     msg += "Resultado : " + this.getResult();
                     JOptionPane.showMessageDialog(null,msg );
                
            }

    
    
}
