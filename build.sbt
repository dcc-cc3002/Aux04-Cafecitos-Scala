ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

//noinspection SpellCheckingInspection
lazy val root = (project in file("."))
  .settings(
    name := "Aux04-Cafecitos-Scala",
    idePackagePrefix := Some("cl.uchile.dcc")
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12"
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.12"
