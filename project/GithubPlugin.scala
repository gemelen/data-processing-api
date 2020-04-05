import sbtghpackages.GitHubPackagesPlugin
import sbtghpackages.GitHubPackagesPlugin.autoImport._
import sbt.Keys._
import sbt._

object GithubPlugin extends AutoPlugin {

  override def requires: sbt.Plugins = GitHubPackagesPlugin

  override lazy val projectSettings = Seq(
    ThisBuild / publishMavenStyle := true,
    ThisBuild / githubOwner := "gemelen",
    ThisBuild / githubRepository := "data-processing-api"
  )

}
