package models;

import java.util.List;

import javax.persistence.*;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * User entity managed by Ebean
 */
@Entity 
@Table(name="account")
public class User extends Model {

    @Id
    @Constraints.Required
    @Formats.NonEmpty
    public String name;
    
    @Constraints.Required
    public String password;
    
    // -- Queries
    
    public static Model.Finder<String,User> find = new Model.Finder(String.class, User.class);
    
    /**
     * Retrieve all users.
     */
    public static List<User> findAll() {
        return find.all();
    }

    /**
     * Retrieve a User from name.
     */
    public static User findByName(String name) {
        return find.where().eq("name", name).findUnique();
    }
    
    /**
     * Authenticate a User.
     */
    public static User authenticate(String name, String password) {
        return find.where()
            .eq("name", name)
            .eq("password", password)
            .findUnique();
    }
    
    public String toString() {
        return "User(" + name + ")";
    }
}