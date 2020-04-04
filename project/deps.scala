import sbt._

object v {
  val cats      = "2.1.1"
}

object deps {
  // cats
  val catsCore                = "org.typelevel"                     %% "cats-core"                     % v.cats

  // combined
  val cats = Seq(catsCore)
}

