/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.ejercicioServlets.tallerUno.vos;

/**
 *
 * @author Administrador
 */
public class FormularioPersonaVo {
    
    private String nombre;
    
    private Long cedula;
    
    public FormularioPersonaVo(String nNombre, Long nCedula){
        nombre = nNombre;
        cedula = nCedula;
    }
    
    public Long getCedula(){
        return cedula;
    }
    
    public void setCedula(Long cedula){
        this.cedula = cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}
