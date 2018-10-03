
package Modelo;


public class DCongresistas {
    
    int ci_congresista;
    String nombre_congresista;
    int edad_congresista;
    String titulo_congresista;

    public DCongresistas(int ci_congresista, String nombre_congresista, int edad_congresista, String titulo_congresista) {
        this.ci_congresista = ci_congresista;
        this.nombre_congresista = nombre_congresista;
        this.edad_congresista = edad_congresista;
        this.titulo_congresista = titulo_congresista;
    }

    public DCongresistas() {
    }

    public int getCi_congresista() {
        return ci_congresista;
    }

    public void setCi_congresista(int ci_congresista) {
        this.ci_congresista = ci_congresista;
    }

    public String getNombre_congresista() {
        return nombre_congresista;
    }

    public void setNombre_congresista(String nombre_congresista) {
        this.nombre_congresista = nombre_congresista;
    }

    public int getEdad_congresista() {
        return edad_congresista;
    }

    public void setEdad_congresista(int edad_congresista) {
        this.edad_congresista = edad_congresista;
    }

    public String getTitulo_congresista() {
        return titulo_congresista;
    }

    public void setTitulo_congresista(String titulo_congresista) {
        this.titulo_congresista = titulo_congresista;
    }
    
    
    
    
    
    
    
    
    
}
