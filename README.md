# argonaut-unfiltered

[![Build Status](https://travis-ci.org/markhibberd/argonaut-unfiltered.png)](https://travis-ci.org/markhibberd/argonaut-unfiltered)

### What is argonaut-unfiltered?

This library is a basic integration for using [argonaut](http://argonaut.io) with the
[unfiltered](http://unfiltered.databinder.net/Unfiltered.html) web toolkit.

### Documentation

* [User Docs](http://argonaut.io/doc/integration/)

### SBT Settings

Just add argonaut as a dependency (6.0-SNAPSHOT is the only version available on oss.sonatype.org at the moment):

    "io.argonaut" %% "argonaut-unfiltered" % "6.0-SNAPSHOT"


### Release

Add to `~/.sbt/0.12.1/sonatype.sbt`


    credentials += Credentials("Sonatype Nexus Repository Manager",
                               "oss.sonatype.org",
                               "<username>",
                               "<password>")


Run:
    ./sbt "+publish"
