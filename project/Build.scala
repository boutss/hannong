import sbt._
import Keys._

import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "hannong"
    val appVersion      = "1.0"

	val appDependencies = Seq(
	      "mysql" % "mysql-connector-java" % "5.1.20"
	 ) 
	
    val main = PlayProject(appName, appVersion, mainLang = JAVA)
}
            
