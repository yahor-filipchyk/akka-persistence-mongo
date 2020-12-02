libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.10")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.1.1")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.2")
