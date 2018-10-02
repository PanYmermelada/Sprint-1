/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Piter Molina Chacón (pjmolina2012@gmail.com)
 */
public class Congreso {
    
    private String idCongreso;
    private String ciCongresista;
    private String nombCongreso;
    private String aulaCongreso;
    private Date fecha;
    private Date horaInicio;
    private Date horaFin;
    private String temaCongreso;
    private int costoCongreso;

    public Congreso(String idCongreso, String ciCongresista, String nombCongreso, String aulaCongreso, Date fecha, Date horaInicio, Date horaFin, String temaCongreso, int costoCongreso) {
        this.idCongreso = idCongreso;
        this.ciCongresista = ciCongresista;
        this.nombCongreso = nombCongreso;
        this.aulaCongreso = aulaCongreso;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.temaCongreso = temaCongreso;
        this.costoCongreso = costoCongreso;
    }

    public String getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(String idCongreso) {
        this.idCongreso = idCongreso;
    }

    public String getCiCongresista() {
        return ciCongresista;
    }

    public void setCiCongresista(String ciCongresista) {
        this.ciCongresista = ciCongresista;
    }

    public String getNombCongreso() {
        return nombCongreso;
    }

    public void setNombCongreso(String nombCongreso) {
        this.nombCongreso = nombCongreso;
    }

    public String getAulaCongreso() {
        return aulaCongreso;
    }

    public void setAulaCongreso(String aulaCongreso) {
        this.aulaCongreso = aulaCongreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getTemaCongreso() {
        return temaCongreso;
    }

    public void setTemaCongreso(String temaCongreso) {
        this.temaCongreso = temaCongreso;
    }

    public int getCostoCongreso() {
        return costoCongreso;
    }

    public void setCostoCongreso(int costoCongreso) {
        this.costoCongreso = costoCongreso;
    }
    
    
    
    
    
}
