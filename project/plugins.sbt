logLevel := Level.Info

// all sorts of packaging, incl. docker
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.0")

// scalafmt sbt support
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.2")

// publish to GH package registry
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.0")
