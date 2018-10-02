package Modelo;

/**
 *
 * @author Piter Molina Chacón (pjmolina2012@gmail.com)
 */
public class Participante {
    private String ci;
    private String idCongreso;
    private String nombParticipante;
    private int edadParticipante;
    private String titParticipante;

    public Participante(String ci, String idCongreso, String nombParticipante, int edadParticipante, String titParticipante) {
        this.ci = ci;
        this.idCongreso = idCongreso;
        this.nombParticipante = nombParticipante;
        this.edadParticipante = edadParticipante;
        this.titParticipante = titParticipante;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(String idCongreso) {
        this.idCongreso = idCongreso;
    }

    public String getNombParticipante() {
        return nombParticipante;
    }

    public void setNombParticipante(String nombParticipante) {
        this.nombParticipante = nombParticipante;
    }

    public int getEdadParticipante() {
        return edadParticipante;
    }

    public void setEdadParticipante(int edadParticipante) {
        this.edadParticipante = edadParticipante;
    }

    public String getTitParticipante() {
        return titParticipante;
    }

    public void setTitParticipante(String titParticipante) {
        this.titParticipante = titParticipante;
    }

}
