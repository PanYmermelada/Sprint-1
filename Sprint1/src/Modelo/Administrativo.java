package Modelo;

/**
 *
 * @author Piter Molina Chacón (pjmolina2012@gmail.com)
 */
public class Administrativo {
    private String ciAdminitrativo;
    private String nomAdminitrativo;
    private String cargoAdminitrativo;
    private String contraseniaAdm;

    public Administrativo(String ciAdminitrativo, String nomAdminitrativo, String cargoAdminitrativo, String contraseniaAdm) {
        this.ciAdminitrativo = ciAdminitrativo;
        this.nomAdminitrativo = nomAdminitrativo;
        this.cargoAdminitrativo = cargoAdminitrativo;
        this.contraseniaAdm = contraseniaAdm;
    }

    public String getCiAdminitrativo() {
        return ciAdminitrativo;
    }

    public void setCiAdminitrativo(String ciAdminitrativo) {
        this.ciAdminitrativo = ciAdminitrativo;
    }

    public String getNomAdminitrativo() {
        return nomAdminitrativo;
    }

    public void setNomAdminitrativo(String nomAdminitrativo) {
        this.nomAdminitrativo = nomAdminitrativo;
    }

    public String getCargoAdminitrativo() {
        return cargoAdminitrativo;
    }

    public void setCargoAdminitrativo(String cargoAdminitrativo) {
        this.cargoAdminitrativo = cargoAdminitrativo;
    }

    public String getContraseniaAdm() {
        return contraseniaAdm;
    }

    public void setContraseniaAdm(String contraseniaAdm) {
        this.contraseniaAdm = contraseniaAdm;
    }
    
    
}
