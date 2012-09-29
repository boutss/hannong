package controllers;

import java.util.Date;

import models.*;
import play.Routes;
import play.data.Form;
import play.mvc.*;
import views.html.login;
import java.net.*;
import java.util.*;

public class Application extends Controller {
  
    // -- Authentication
    
    public static class Login {
        public String name;
        public String password;
        
        public String validate() {
            if(User.authenticate(name, password) == null) {
                return "Utilisateur ou mot de passe incorrect";
            }
            return null;
        }
    }

    /**
     * Login page.
     */
    public static Result login() {
        return ok(
            login.render(form(Login.class))
        );
    }
    
    /**
     * Handle login form submission.
     */
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        }
        session("name", loginForm.get().name);
        sauvegardeInfoConnexion(loginForm);
        
        return redirect(
            routes.Hannong.index()
        );
    }   

    private static void sauvegardeInfoConnexion(Form<Login> loginForm) {   
      // Obtenir l'adresse IP de la machine locale
    /*  InetAddress address = null;
	  StringBuilder adresseMac = new StringBuilder();
	  
	  
      try {
        address = InetAddress.getLocalHost();
		System.out.println(address);
        
        NetworkInterface ni = NetworkInterface.getByInetAddress(address);
        byte[] mac = ni.getHardwareAddress();
		
		// Send all output to the Appendable object adresseMac
		Formatter formatter = new Formatter(adresseMac, Locale.FRANCE);
   
       // Afficher l'adresse Mac
        for (int i = 0; i < mac.length; i++) {
         formatter.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
        }              
      } catch (Exception e) {
        e.printStackTrace();
      }*/
	  
	  Connexion.create(new Date(), loginForm.get().name, request().remoteAddress(), /*adresseMac.toString()*/ "");
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "Vous avez été déconnecté");
        return redirect(
            routes.Application.login()
        );
    }
  
    // -- Javascript routing
    
//    public static Result javascriptRoutes() {
//        response().setContentType("text/javascript");
//        return ok(
//            Routes.javascriptRouter("jsRoutes",
//                // Routes for Tasks
//                controllers.routes.javascript.Application.index()
//            )
//        );
//    }
}