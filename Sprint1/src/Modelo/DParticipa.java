
package Modelo;

public class DParticipa {
    
    int ci_participante;
    String id_congreso;
    boolean asistencia;

    public DParticipa(int ci_participante, String id_congreso, boolean asistencia) {
        this.ci_participante = ci_participante;
        this.id_congreso = id_congreso;
        this.asistencia = asistencia;
    }

    public DParticipa() {
    }

    public int getCi_participante() {
        return ci_participante;
    }

    public void setCi_participante(int ci_participante) {
        this.ci_participante = ci_participante;
    }

    public String getId_congreso() {
        return id_congreso;
    }

    public void setId_congreso(String id_congreso) {
        this.id_congreso = id_congreso;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    
    
    
    
}
