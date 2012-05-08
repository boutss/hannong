// @SOURCE:D:/Vincent/play-2.0/samples/java/hannong/conf/routes
// @HASH:34381310d4ccf2b3b4c3088c480b5f68b54aeace
// @DATE:Tue May 08 14:24:31 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Hannong_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:10
val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:11
val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:17
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Hannong.index()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""POST""","""/login""","""controllers.Application.authenticate()"""),("""GET""","""/logout""","""controllers.Application.logout()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Hannong_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Hannong.index(), HandlerDef(this, "controllers.Hannong", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil))
   }
}
                    

// @LINE:17
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                