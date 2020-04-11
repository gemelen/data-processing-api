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
  .enablePlugins(BintrayPlugin)
  .settings(
    name := "data-processing-api",
    bintrayRepository := "data-platform",
    licenses += ("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0")),
    libraryDependencies ++=
      cats
  )
