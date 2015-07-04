import sbt.Keys._

lazy val gitHeadCommitSha = settingKey[String]("Current git commit short SHA")
gitHeadCommitSha in ThisBuild := Process("git rev-parse --short HEAD").lines.head

val release = settingKey[Boolean]("")
release := sys.props("release") == "true"

version in ThisBuild := {
  val stringVersion = "1.0"
  if (release.value) stringVersion else s"$stringVersion-${gitHeadCommitSha.value}"
}