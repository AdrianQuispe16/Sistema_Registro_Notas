
package Negocio;

import java.util.ArrayList;
import java.util.List;


public class Estudiantes {
   
  
    String codalu;
    String apealu;
    String nomalu;

    public Estudiantes (String codigo, String apealu, String nomalu) {
        this.codalu = codigo;
        this.apealu = apealu;
        this.nomalu = nomalu;
    }
    
    public String getcodalu() {
        return codalu;
    }

    public String getapealu() {
        return apealu;
    }

    public String getnomalu() {
        return nomalu;
    }



  
}
