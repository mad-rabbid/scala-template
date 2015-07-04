import sbt._

object Dependencies {
  object Versions {
  }

  lazy val logback = "ch.qos.logback" % "logback-classic" % "1.1.2"

  lazy val scalaTest = "org.scalatest" % "scalatest_2.11" % "2.2.5" % "test"

  val mpiDependencies = Seq(
    logback,
    scalaTest
  )
}