name := "play-skeleton"

version := "1.0.0"

scalaVersion := "2.13.10"

libraryDependencies += guice

lazy val root = (project in file(".")).enablePlugins(PlayJava)