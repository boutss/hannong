package models;

import java.util.Date;

import javax.persistence.*;

import play.db.ebean.Model;

/**
 * Connexion entity managed by Ebean
 */
@Entity 
@Table(name="connexion")
public class Connexion extends Model {

    @Id
    public Date date;
    @Id
    public String name;
    public String adresseip;
    public String adressemac;
    
    
    public Connexion(Date date, String name) {
        this.date = date;
        this.name = name;
    }
    
    /**
     * Create a new Connexion.
     */
    public static Connexion create(Date date, String name) {
        Connexion connexion = new Connexion(date, name);
        connexion.save();
        return connexion;
    }
}