package Modelo;

/**
 *
 * @author Piter Molina Chacón (pjmolina2012@gmail.com)
 */
public class Congresista {
    private String ciCongresista;
    private String idCongreso;
    private String nombCongresista;
    private int edadCongresista;
    private String titCongresista;

    public Congresista(String ciCongresista, String idCongreso, String nombCongresista, int edadCongresista, String titCongresista) {
        this.ciCongresista = ciCongresista;
        this.idCongreso = idCongreso;
        this.nombCongresista = nombCongresista;
        this.edadCongresista = edadCongresista;
        this.titCongresista = titCongresista;
    }

    public String getCiCongresista() {
        return ciCongresista;
    }

    public void setCiCongresista(String ciCongresista) {
        this.ciCongresista = ciCongresista;
    }

    public String getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(String idCongreso) {
        this.idCongreso = idCongreso;
    }

    public String getNombCongresista() {
        return nombCongresista;
    }

    public void setNombCongresista(String nombCongresista) {
        this.nombCongresista = nombCongresista;
    }

    public int getEdadCongresista() {
        return edadCongresista;
    }

    public void setEdadCongresista(int edadCongresista) {
        this.edadCongresista = edadCongresista;
    }

    public String getTitCongresista() {
        return titCongresista;
    }

    public void setTitCongresista(String titCongresista) {
        this.titCongresista = titCongresista;
    }
    
    
}
