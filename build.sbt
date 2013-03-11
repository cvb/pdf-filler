name := "pdf-filler"

organization := "fme"

version := "0.0.1"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test",
  "com.itextpdf" % "itextpdf" % "5.0.6"
)

initialCommands := "import fme.pdffiller._"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
