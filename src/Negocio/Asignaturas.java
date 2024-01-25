
package Negocio;


public class Asignaturas {

    String codasi;
    String monasi;
    String ciclo;

    public Asignaturas(String codasi, String monasi, String ciclo) {
        this.codasi = codasi;
        this.monasi = monasi;
        this.ciclo= ciclo;
    }
    
    public String getcodasi() {
        return codasi;
    }

    public String getmonasi() {
        return monasi;
    }

    public String getciclo() {
        return ciclo;
    }

}
