
package Modelo;


public class DCongresos {
    
    String id_congreso;
    int ci_congresista;
    String nombre_congreso;
    String aula_congreso;
    String fecha_congreso;
    String hora_inicio_congreso;
    String tema_congreso;
    float costo_congreso;

    public DCongresos(String id_congreso, int ci_congresista, String nombre_congreso, String aula_congreso, String fecha_congreso, String hora_inicio_congreso, String tema_congreso, float costo_congreso) {
        this.id_congreso = id_congreso;
        this.ci_congresista = ci_congresista;
        this.nombre_congreso = nombre_congreso;
        this.aula_congreso = aula_congreso;
        this.fecha_congreso = fecha_congreso;
        this.hora_inicio_congreso = hora_inicio_congreso;
        this.tema_congreso = tema_congreso;
        this.costo_congreso = costo_congreso;
    }

    public DCongresos() {
    }

    public String getId_congreso() {
        return id_congreso;
    }

    public void setId_congreso(String id_congreso) {
        this.id_congreso = id_congreso;
    }

    public int getCi_congresista() {
        return ci_congresista;
    }

    public void setCi_congresista(int ci_congresista) {
        this.ci_congresista = ci_congresista;
    }

    public String getNombre_congreso() {
        return nombre_congreso;
    }

    public void setNombre_congreso(String nombre_congreso) {
        this.nombre_congreso = nombre_congreso;
    }

    public String getAula_congreso() {
        return aula_congreso;
    }

    public void setAula_congreso(String aula_congreso) {
        this.aula_congreso = aula_congreso;
    }

    public String getFecha_congreso() {
        return fecha_congreso;
    }

    public void setFecha_congreso(String fecha_congreso) {
        this.fecha_congreso = fecha_congreso;
    }

    public String getHora_inicio_congreso() {
        return hora_inicio_congreso;
    }

    public void setHora_inicio_congreso(String hora_inicio_congreso) {
        this.hora_inicio_congreso = hora_inicio_congreso;
    }

    public String getTema_congreso() {
        return tema_congreso;
    }

    public void setTema_congreso(String tema_congreso) {
        this.tema_congreso = tema_congreso;
    }

    public float getCosto_congreso() {
        return costo_congreso;
    }

    public void setCosto_congreso(float costo_congreso) {
        this.costo_congreso = costo_congreso;
    }
    
    
    
    
    
    
}
