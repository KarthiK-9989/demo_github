ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.0"

lazy val root = (project in file("."))
  .settings(
    name := "deploy789"
  )
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.1"
