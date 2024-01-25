
package Negocio;

/**
 *
 * @author Maricielo
 */
public class Notas {
    
    String idestudiante;
    String nomEstudiante;
    String apeEstudiante;
    String idasignatura;
    String nomasignatura;
    String ciclo;
 
    String promedio;

    String SitACademica;

    public Notas(String idestudiante, String nomEstudiante, String apeEstudiante, String idasignatura, String nomasignatura, String ciclo, String promedio, String SitACademica) {
        this.idestudiante = idestudiante;
        this.nomEstudiante = nomEstudiante;
        this.apeEstudiante = apeEstudiante;
        this.idasignatura = idasignatura;
        this.nomasignatura = nomasignatura;
        this.ciclo = ciclo;
        this.promedio = promedio;
        this.SitACademica = SitACademica;
    }

    public String getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(String idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNomEstudiante() {
        return nomEstudiante;
    }

    public void setNomEstudiante(String nomEstudiante) {
        this.nomEstudiante = nomEstudiante;
    }

    public String getApeEstudiante() {
        return apeEstudiante;
    }

    public void setApeEstudiante(String apeEstudiante) {
        this.apeEstudiante = apeEstudiante;
    }

    public String getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(String idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getNomasignatura() {
        return nomasignatura;
    }

    public void setNomasignatura(String nomasignatura) {
        this.nomasignatura = nomasignatura;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getSitACademica() {
        return SitACademica;
    }

    public void setSitACademica(String SitACademica) {
        this.SitACademica = SitACademica;
    }
    

    }


    
    
    
    
    
        
