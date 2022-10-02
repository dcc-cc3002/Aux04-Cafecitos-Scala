ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

//noinspection SpellCheckingInspection
lazy val root = (project in file("."))
  .settings(
    name := "Aux04-Cafecitos-Scala",
    idePackagePrefix := Some("cl.uchile.dcc")
  )
