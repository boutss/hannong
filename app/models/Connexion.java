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
    
    
    public Connexion(Date date, String name, String adresseip, String adressemac) {
        this.date = date;
        this.name = name;
		this.adresseip = adresseip;
		this.adressemac = adressemac;
    }
    
    /**
     * Create a new Connexion.
     */
    public static Connexion create(Date date, String name, String adresseip, String adressemac) {
        Connexion connexion = new Connexion(date, name, adresseip, adressemac);
        connexion.save();
        return connexion;
    }
}