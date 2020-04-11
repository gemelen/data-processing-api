logLevel := Level.Info

// all sorts of packaging, incl. docker
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.0")

// scalafmt sbt support
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.2")

// publish to Bintray repository
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.6")
