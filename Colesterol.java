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
public class Colesterol extends cadastrarExame {
    private double ldl; 
    private double hdl;
    private String riscoP;
    private String riscoP2;
    private String hdlTeste;
    private String ldlTeste;


  
    
   
//Getters e setters
    public String getHdlteste(){
        return this.hdlTeste;
    }
    public void setHdlteste(String hdlTeste){
        this.hdlTeste = hdlTeste;
    }
    
    public String getLdlteste(){
        return this.ldlTeste;
    }   
    public void setLdlteste(String ldlTeste){
        this.ldlTeste = ldlTeste;
    }
    
    
    public double getLdl(){
        return this.ldl;
    }
    public void setLdl(double ldl){
        this.ldl = ldl;
    }

    
    public double getHdl(){
        return this.hdl;
    }
    public void setHdl(double hdl){
        this.hdl = hdl;
    }
    
    
    public String getRiscop(){
        return this.riscoP;
    }
    public void setRiscop(String riscoP){
        this.riscoP = riscoP;
    }
    
      
    public String getRiscop2(){
        return this.riscoP2;
    }
    public void setRiscop2(String riscoP2){
        this.riscoP2 = riscoP2;
    }
    
    
   //
   //  
    @Override
    public void Cadastro(){
        super.Cadastro();
        this.riscoP = JOptionPane.showInputDialog("Risco do paciente : \n B-baixo  M-medio  A-alto");
        this.hdl = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de hdl por Mg/L :"));
        this.ldl = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de ldl por Mg/L :"));
      
       }
    
 
    public void mostrarResultado(){
        //public void tetsteLdl(){
        switch(this.getRiscop().toUpperCase()){
            //Risco do paciente A-Alto M-Medio B-Baixo
            case "A" -> {
                this.riscoP2 = "Alto";
                if(this.ldl <50){
                    this.ldlTeste = "LDL BOM";
                   
                }else{
                    this.ldlTeste = "LDL RUIM";
                }
            }
            
            case "M" -> {
                this.riscoP2 = "Medio";
                if(this.ldl <70){
                    this.ldlTeste = "LDL BOM";
                }else{
                    this.ldlTeste = "LDL RUIM";
                }
            }
                
             case "B" -> {
                 this.riscoP2 = "Baixo";
                 if(this.ldl <100){
                     this.ldlTeste = "LDL BOM";
                 }else{
                     this.ldlTeste = "LDL RUIM";
                 }
            }
                 
             default -> {
            }
        }
       //
       //public void testeHdl(){
            if (this.hdl > 45 && this.getIdade() <= 19){
                this.hdlTeste = "HDL BOM";
            }
            else if(this.hdl> 40 &&  this.getIdade()>= 20){
                this.hdlTeste = "HDL BOM";
        }
            else {
                this.hdlTeste = "HDL RUIM";
            
        }
         
 //
 //Mostrando o resultado na tela
 //
    String msg =  "Nome paciente : " + this.getNomepaciente() + "\n\n";
     msg += "Ano nascimento: " + this.getAnonascimento() + "\n\n"; 
     msg += "Tipo sanguineo: " + this.getTiposanguineo() + "\n\n";
     msg += "Risco do paciente : " + this.getRiscop2() +"\n\n";
    msg += "HDL por Mg/litro : " + this.getHdl()+ "\n\n" + this.getHdlteste() + "\n\n";
     msg += "LDL por Mg/litro : " + this.getLdl() + "\n\n" + this.getLdlteste() + "\n\n";
    
     JOptionPane.showMessageDialog(null,msg);


        //
       
        }
}