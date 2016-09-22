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
       
        int pos=cites.indexOf(citaAntiga);
        //cites.set(pos, citaNova);
        
        cites.remove(citaAntiga);
        cites.add(citaNova);
        //cites.add(new Cita(15,17,"M3"));
    }

    public ArrayList<Cita> cercarCita(int horaInici) {
        ArrayList<Cita> cerca = new ArrayList<>();
        
//        for(int i = 0; i < cites.size; i++) {
            for (Cita c : cites)
            if (c.getHoraInici() == horaInici) {
               cerca.add(c);
                }
                   
        return cerca;
    }
    public void esborrarCita(Cita c)  {
        cites.remove(c);
        
    }
            
    
}
