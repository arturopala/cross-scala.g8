![Build](https://github.com/$githubUserNoSpaceLowercase$/$libraryNameHyphen$/workflows/Build/badge.svg) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/$package$.$githubUserNoSpaceLowercase$/$libraryNameHyphen$_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/$package$.$githubUserNoSpaceLowercase$/$libraryNameHyphen$_2.13)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.5.0.svg)](https://www.scala-js.org)

$libraryName$
===

This is a micro-library for Scala

    "$package$.$githubUserNoSpaceLowercase$" %% "$libraryNameHyphen$" % "0.1.0"

Cross-compiles to Scala versions `2.13.4`, `2.12.13`, `2.11.12`, `3.0.0-RC1`, `3.0.0-M3`, 
and ScalaJS version `1.5.0`, and ScalaNative version `0.4.0`.

Motivation
---

Usage
---

```scala
import $package$.$githubUserNoSpaceLowercase$.$libraryNameNoSpaceLowercase$._

$libraryNameCamel$.say()
// res0: String = "$libraryName$!"
```

Development
---

Compile

    sbt compile

Compile for all Scala versions

    sbt +compile

Test

    sbt rootJVM/test
    sbt rootJS/test
    sbt rootNative/test

Test with all Scala versions

    sbt +test
    sbt +rootJVM/test


Generate README and docs

    sbt docs/mdoc

Apply scalafixes

    sbt rootJMV/scalafixAll    

Github Actions
---

 - **Build** runs on every push or pull request
 - **Release** releases artefacts on Maven Central, for a setup follow <https://github.com/olafurpg/sbt-ci-release/blob/main/readme.md>
 - **Site** updates README and pushes API docs to Github Pages
