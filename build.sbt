import Dependencies._
import sbt.Keys._

scalaVersion in ThisBuild := "2.11.6"

// Use with assemblyPackageDependency
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false, includeDependency = false)

lazy val commonSettings = Seq(
  organization := "ru.mail.money.cpg"
)

lazy val `gollum-demo` = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "gollum-demo",
    libraryDependencies ++= mpiDependencies
  )