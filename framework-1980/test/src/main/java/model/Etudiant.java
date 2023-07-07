package model;

import etu1980.framework.ModelView;
import etu1980.framework.annotation.Url;
import etu1980.framework.annotation.Scope;
import etu1980.framework.annotation.RestAPI;
import etu1980.framework.annotation.Authentification;
import java.util.Vector;
import java.util.Date;
@Scope(isSingleton=true)
public class Etudiant {
    Integer idEtudiant;
    String nom;
    String prenom;
    Date dtn;
    Integer sexe;

    public Etudiant(Integer idEtudiant, String nom, String prenom, Date dtn, Integer sexe) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.dtn = dtn;
        this.prenom = prenom;
        this.sexe = sexe;
    }
    public Etudiant(Integer idEtudiant, String nom, String prenom) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Integer getSexe() {
        return sexe;
    }

    public void setSexe(Integer sexe) {
        this.sexe = sexe;
    }

    public Etudiant(){}

    public Date getDtn() {
        return dtn;
    }

    public void setDtn(Date dtn) {
        this.dtn = dtn;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Authentification(profil="admin")
    @Url(urlName = "insert")
    public ModelView AddEtudiant()
    {
        Integer idEtu = this.getIdEtudiant();
        String nom = this.getNom();
        String prenom = this.getPrenom();
        Integer sexe = this.getSexe();

        Vector<Object> tab = new Vector<Object>();
        tab.add(idEtu);
        tab.add(nom);
        tab.add(prenom);
        tab.add(sexe);

        tab.add(this.getDtn());
        ModelView m = new ModelView("test.jsp");

        m.AddItem("lst",tab);
        m.setJson(true);
        return m;
    }

    @Url(urlName="all")
    @RestAPI
    @Authentification(profil="admin")
    public Etudiant[] findAll()
    {
        Etudiant e1 = new Etudiant(1,"Rahajarison","Rianala");
        Etudiant e2 = new Etudiant(2,"Rahajarison","Fitiavana");

        Etudiant[] all = new Etudiant[2];
        all[0] = e1;
        all[1] = e2;

        return all;
    }

    @Url(urlName="login")
    public ModelView login()
    {
        String nom = this.getNom();
        Vector<Object> tab = new Vector<Object>();
        tab.add(nom);
        ModelView m = new ModelView("test.jsp");
        if(nom.compareTo("admin")==0){
            m.AddSession("profil","admin");
            m.AddSession("isConnected",true);
        }
        m.AddItem("lst",tab);
        return m;
    }



}
