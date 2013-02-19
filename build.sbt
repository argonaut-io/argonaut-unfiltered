organization := "io.mth"

name := "unfiltered-cors"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered" % "0.6.7",
  "net.databinder" %% "unfiltered-filter" % "0.6.7" % "test",
  "net.databinder" %% "unfiltered-jetty" % "0.6.7" % "test",
  "io.argonaut" %% "argonaut" % "6.0-SNAPSHOT" % "test" cross(CrossVersion.full)
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2",
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "http://oss.sonatype.org/content/repositories/releases"
)
