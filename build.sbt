name := "play-swagger"

version := "1.0.0"

scalaVersion := "2.13.6"

libraryDependencies += guice

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-annotations" % "1.6.1",
)

// https://mvnrepository.com/artifact/org.webjars/swagger-ui
//libraryDependencies += "org.webjars" % "swagger-ui" % "4.15.0"


lazy val root = (project in file(".")).enablePlugins(PlayJava)