organization := "io.argonaut"

name := "argonaut-unfiltered"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.4", "2.11.7")

libraryDependencies ++= Seq(
  "io.argonaut" %% "argonaut" % "6.1",
  "net.databinder" %% "unfiltered" % "0.8.4",
  "net.databinder" %% "unfiltered-filter" % "0.8.4" % "test",
  "net.databinder" %% "unfiltered-jetty" % "0.8.4" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2",
  "oss snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "oss releases" at "http://oss.sonatype.org/content/repositories/releases"
)

releasePublishArtifactsAction := PgpKeys.publishSigned.value

releaseCrossBuild := true

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("BSD-3-Clause" -> url("http://www.opensource.org/licenses/BSD-3-Clause"))

homepage := Some(url("http://argonaut.io"))

useGpg := true

pomExtra := (
      <scm>
        <url>git@github.com:markhibberd/argonaut.git</url>
        <connection>scm:git:git@github.com:markhibberd/argonaut.git</connection>
      </scm>
      <developers>
        <developer>
          <id>tonymorris</id>
          <name>Tony Morris</name>
          <url>http://tmorris.net</url>
        </developer>
        <developer>
          <id>mth</id>
          <name>Mark Hibberd</name>
          <url>http://mth.io</url>
        </developer>
        <developer>
          <id>seanparsons</id>
          <name>Sean Parsons</name>
        </developer>
      </developers>
)

publishTo <<= version.apply(v => {
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
})
