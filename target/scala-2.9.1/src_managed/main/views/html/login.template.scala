
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.33*/("""

<html>
    <head>
        <title>Hannong</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/style.css"))),format.raw/*8.96*/("""">
    </head>
    <body>
        
<div id="pricipal" >
	<div id="logo" ><img class="img" src=""""),_display_(Seq(/*13.41*/routes/*13.47*/.Assets.at("images/logo.png"))),format.raw/*13.76*/(""""  /></div>
	<div id="entre" >
		<div class="entre">Bienvenue sur notre réseau wi-fi</div>
	</div>
	<div id="container" style='background-image:url("""),_display_(Seq(/*17.51*/routes/*17.57*/.Assets.at("images/petite_france.jpg"))),format.raw/*17.95*/(""");' >		
		<div id="login">
		
        """),_display_(Seq(/*20.10*/helper/*20.16*/.form(routes.Application.authenticate)/*20.54*/ {_display_(Seq(format.raw/*20.56*/("""
        <p style="margin: 0 0 10px; font-size: 20px;font-weight: bold;">Merci de vous authentifier</p>                      
            """),_display_(Seq(/*22.14*/if(form.hasGlobalErrors)/*22.38*/ {_display_(Seq(format.raw/*22.40*/(""" 
                <p class="error">
                    """),_display_(Seq(/*24.22*/form/*24.26*/.globalError.message)),format.raw/*24.46*/("""
                </p>
            """)))})),format.raw/*26.14*/("""
            
            """),_display_(Seq(/*28.14*/if(flash.contains("success"))/*28.43*/ {_display_(Seq(format.raw/*28.45*/("""
                <p class="success">
                    """),_display_(Seq(/*30.22*/flash/*30.27*/.get("success"))),format.raw/*30.42*/("""
                </p>
            """)))})),format.raw/*32.14*/("""
            
            <p><input type="text" name="name" placeholder="Nom d'utilisateur" value=""""),_display_(Seq(/*34.87*/form("name")/*34.99*/.value)),format.raw/*34.105*/(""""></p>
            <p><input type="password" name="password" placeholder="Mot de passse"></p>
            <p><button type="submit">Envoyer</button></p>            
        """)))})),format.raw/*37.10*/("""
		</div>
	</div>
	<div id="footer" align="center">
		<p>Découvrez notre blog ! <a href="http://www.blog-hannong.com/" target="_blank">www.blog-hannong.com</a></p>
	</div>
    </body>
</html>

    


"""))}
    }
    
    def render(form:Form[Application.Login]) = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 08 12:54:00 CEST 2012
                    SOURCE: D:/Vincent/play-2.0/samples/java/hannong/app/views/login.scala.html
                    HASH: e180fe6e11d125519b7ec82bbec845ac320f049b
                    MATRIX: 772->1|875->32|1014->141|1028->147|1081->179|1183->251|1197->257|1254->292|1341->349|1355->355|1411->390|1538->486|1553->492|1604->521|1784->670|1799->676|1859->714|1929->753|1944->759|1991->797|2026->799|2196->938|2229->962|2264->964|2352->1021|2365->1025|2407->1045|2474->1080|2532->1107|2570->1136|2605->1138|2694->1196|2708->1201|2745->1216|2812->1251|2943->1351|2964->1363|2993->1369|3198->1542
                    LINES: 27->1|30->1|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|42->13|42->13|42->13|46->17|46->17|46->17|49->20|49->20|49->20|49->20|51->22|51->22|51->22|53->24|53->24|53->24|55->26|57->28|57->28|57->28|59->30|59->30|59->30|61->32|63->34|63->34|63->34|66->37
                    -- GENERATED --
                */
            