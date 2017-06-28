name := "playdemo03"

version := "1.0"

lazy val `playdemo03` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

//libraryDependencies ++= Seq( jdbc , anorm , cache , ws , "com.alibaba" % "fastjson" % "1.2.33")


//libraryDependencies ++= Seq( jdbc , anorm , cache , ws , "mysql" % "mysql-connector-java" % "5.1.35")