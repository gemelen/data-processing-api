import compiler._
import deps._

ThisBuild / scalaVersion := "2.12.11"
ThisBuild / version := "0.1"
ThisBuild / turbo := true
ThisBuild / scalacOptions := CompilerOpts.scalacFlags
ThisBuild / scalafmtConfig := baseDirectory.value / "project" / ".scalafmt.conf"

lazy val root = project
  .in(file("."))
  .enablePlugins(RootProjectPlugin)
  .aggregate(
    api
  )

lazy val api = project
  .in(file("api"))
  .enablePlugins(LibraryProjectPlugin)
  .enablePlugins(GithubPlugin)
  .settings(
    name := "data-processing-api",
    libraryDependencies ++=
      cats
  )
