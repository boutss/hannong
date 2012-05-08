
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
        <p style="margin: 0 0 10px;
        font-size: 20px;
        font-weight: bold;">Merci de vous authentifier</p>          
    <!--      <h1>Merci de vous authentifier</h1>  -->              
            """),_display_(Seq(/*25.14*/if(form.hasGlobalErrors)/*25.38*/ {_display_(Seq(format.raw/*25.40*/(""" 
                <p class="error">
                    """),_display_(Seq(/*27.22*/form/*27.26*/.globalError.message)),format.raw/*27.46*/("""
                </p>
            """)))})),format.raw/*29.14*/("""
            
            """),_display_(Seq(/*31.14*/if(flash.contains("success"))/*31.43*/ {_display_(Seq(format.raw/*31.45*/("""
                <p class="success">
                    """),_display_(Seq(/*33.22*/flash/*33.27*/.get("success"))),format.raw/*33.42*/("""
                </p>
            """)))})),format.raw/*35.14*/("""
            
            <p><input type="text" name="name" placeholder="Nom d'utilisateur" value=""""),_display_(Seq(/*37.87*/form("name")/*37.99*/.value)),format.raw/*37.105*/(""""></p>
            <p><input type="password" name="password" placeholder="Mot de passse"></p>
            <p><button type="submit">Envoyer</button></p>            
        """)))})),format.raw/*40.10*/("""
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
                    DATE: Tue May 08 11:14:40 CEST 2012
                    SOURCE: D:/Vincent/play-2.0/samples/java/hannong/app/views/login.scala.html
                    HASH: 4cd36640148e736f64c23f0aa8a4aae17766cd27
                    MATRIX: 772->1|875->32|1014->141|1028->147|1081->179|1183->251|1197->257|1254->292|1341->349|1355->355|1411->390|1538->486|1553->492|1604->521|1784->670|1799->676|1859->714|1929->753|1944->759|1991->797|2026->799|2270->1012|2303->1036|2338->1038|2426->1095|2439->1099|2481->1119|2548->1154|2606->1181|2644->1210|2679->1212|2768->1270|2782->1275|2819->1290|2886->1325|3017->1425|3038->1437|3067->1443|3272->1616
                    LINES: 27->1|30->1|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|42->13|42->13|42->13|46->17|46->17|46->17|49->20|49->20|49->20|49->20|54->25|54->25|54->25|56->27|56->27|56->27|58->29|60->31|60->31|60->31|62->33|62->33|62->33|64->35|66->37|66->37|66->37|69->40
                    -- GENERATED --
                */
            