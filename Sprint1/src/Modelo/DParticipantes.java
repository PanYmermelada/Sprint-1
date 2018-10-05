                    
package Modelo;

public class DParticipantes {
    
    int ci_participante;
    String nombre_participante;
    int edad_participante;
    String titulo_participante;

    public DParticipantes(int ci_participante, String nombre_participante, int edad_participante, String titulo_participante) {
        this.ci_participante = ci_participante;
        this.nombre_participante = nombre_participante;
        this.edad_participante = edad_participante;
        this.titulo_participante = titulo_participante;
    }

    public DParticipantes() {
    }

    public int getCi_participante() {
        return ci_participante;
    }

    public void setCi_participante(int ci_participante) {
        this.ci_participante = ci_participante;
    }

    public String getNombre_participante() {
        return nombre_participante;
    }

    public void setNombre_participante(String nombre_participante) {
        this.nombre_participante = nombre_participante;
    }

    public int getEdad_participante() {
        return edad_participante;
    }

    public void setEdad_participante(int edad_participante) {
        this.edad_participante = edad_participante;
    }

    public String getTitulo_participante() {
        return titulo_participante;
    }

    public void setTitulo_participante(String titulo_participante) {
        this.titulo_participante = titulo_participante;
    }
    
    
    
    
    
    
    
}
