/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class Pagina {

    private int mes;
    private int diaMes;
    private int diaSetmana;
    private ArrayList<Cita> cites;

    public Pagina(int mes, int diaMes) {
        this.mes = mes;
        this.diaMes = diaMes;
        cites=new ArrayList();
    }
    
    public Pagina(){
        
    }

    public int getMes() {
        return mes;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public int getDiaSetmana() {
        return diaSetmana;
    }

    public ArrayList<Cita> getCites() {
        return cites;
    }

    public void crearCita(int horaInici, int horaFi, String anotacio) {
        
        if(cites==null) {
            cites=new ArrayList();
        }
        cites.add(new Cita(horaInici,horaFi,anotacio));
        
    }

    public void modificarCita(Cita citaAntiga, Cita citaNova) {

    }

    public ArrayList<Cita> cercarCita(int horaInici) {
        ArrayList<Cita> cerca = null;

        return cerca;
    }

}
