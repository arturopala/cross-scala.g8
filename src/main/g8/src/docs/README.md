![Build](https://github.com/$githubUserNoSpaceLowercase$/$libraryNameHyphen$/workflows/Build/badge.svg) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/$package$.$githubUserNoSpaceLowercase$/$libraryNameHyphen$_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/$package$.$githubUserNoSpaceLowercase$/$libraryNameHyphen$_2.13)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-@SCALA_JS_VERSION@.svg)](https://www.scala-js.org)

$libraryName$
===

This is a micro-library for Scala

    "$package$.$githubUserNoSpaceLowercase$" %% "$libraryNameHyphen$" % "@VERSION@"

Cross-compiles to Scala versions @SUPPORTED_SCALA_VERSIONS@, 
and ScalaJS version `@SCALA_JS_VERSION@`, and ScalaNative version `@SCALA_NATIVE_VERSION@`.

Motivation
---

Usage
---

```scala mdoc
import $package$.$githubUserNoSpaceLowercase$.$libraryNameNoSpaceLowercase$._

$libraryNameCamel$.say()
```

Development
---

Compile

    sbt compile

Compile for all Scala versions

    sbt +compile

Test

    sbt rootJVM/test

Test with all Scala versions

    sbt +test

Generate README and docs

    sbt docs/mdoc