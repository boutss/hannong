// @SOURCE:D:/Vincent/play-2.0/samples/java/hannong/conf/routes
// @HASH:34381310d4ccf2b3b4c3088c480b5f68b54aeace
// @DATE:Tue May 08 14:24:31 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:6
class ReverseHannong {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:10
def authenticate() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:11
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:9
def login() = {
   Call("GET", "/login")
}
                                                        

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:17
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseHannong {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Hannong.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:10
def authenticate = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:11
def logout = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:9
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:17
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseHannong {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Hannong.index(), HandlerDef(this, "controllers.Hannong", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:10
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq())
)
                              
 
// @LINE:11
def logout() = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq())
)
                              
 
// @LINE:9
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                