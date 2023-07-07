package model;

import etu1980.framework.ModelView;
import etu1980.framework.annotation.Url;
import etu1980.framework.annotation.Scope;
import etu1980.framework.annotation.Authentification;
import java.util.Vector;
import java.util.Date;

@Scope(isSingleton=false)
public class Emp{
    Integer idEmp;
    String nomEmp;


    public Emp() {
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }


}
