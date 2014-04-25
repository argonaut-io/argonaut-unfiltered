# argonaut-unfiltered

[![Build Status](https://travis-ci.org/argonaut-io/argonaut-unfiltered.png)](https://travis-ci.org/argonaut-io/argonaut-unfiltered)

### What is argonaut-unfiltered?

This library is a basic integration for using [argonaut](http://argonaut.io) with the
[unfiltered](http://unfiltered.databinder.net/Unfiltered.html) web toolkit.

### Documentation

* [User Docs](http://argonaut.io/doc/integration/)

### SBT Settings

Just add argonaut-unfiltered as a dependency:

    "io.argonaut" %% "argonaut-unfiltered" % "6.0-RC1"


### Release

Add to `~/.sbt/0.12.3/sonatype.sbt`


    credentials += Credentials("Sonatype Nexus Repository Manager",
                               "oss.sonatype.org",
                               "<username>",
                               "<password>")


Run:
    ./sbt "+publish"
