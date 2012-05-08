package controllers;

import play.mvc.*;

@Security.Authenticated(Secured.class)
public class Hannong extends Controller {
  
  public static Result index() {
    return redirect("http://www.google.fr");
  } 
}