name := "testapp"

version := "1.0"

lazy val `testapp` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc ,
  cache ,
  filters ,
  javaWs ,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final",
   "mysql" % "mysql-connector-java" % "5.1.30")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  