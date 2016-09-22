/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ALUMNEDAM
 */
public class Cita {

    private int horaInici;
    private int horafi;
    private String anotacio;

    public Cita(int horaInici, int horafi, String anotacio) {
        this.horaInici = horaInici;
        this.horafi = horafi;
        this.anotacio = anotacio;
    }

    public Cita() {

    }

    public int getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(int horaInici) {
        this.horaInici = horaInici;
    }

    public int getHorafi() {
        return horafi;
    }

    public void setHorafi(int horafi) {
        this.horafi = horafi;
    }

    public String getAnotacio() {
        return anotacio;
    }

    public void setAnotacio(String anotacio) {
        this.anotacio = anotacio;
    }

}
