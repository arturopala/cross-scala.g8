// To sync with Maven central, you need to supply the following information:
sonatypeProfileName := "$package$.$githubUserNoSpaceLowercase$"

pomExtra in Global := {
  <url>github.com/$githubUserNoSpaceLowercase$/$libraryNameHyphen$</url>
  <developers>
    <developer>
      <id>$githubUserNoSpaceLowercase$</id>
      <name>$githubUser$</name>
      <url>https://pl.linkedin.com/in/$githubUserNoSpaceLowercase$</url>
    </developer>
  </developers>
}

import ReleaseTransformations._

releaseCrossBuild := true
releaseUseGlobalVersion := true
releaseVersionBump := sbtrelease.Version.Bump.Minor

usePgpKeyHex("D9267F3ECB3CF847330BA02AAAC19B29BEF3DCBF")

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  releaseStepCommandAndRemaining("+test"),
  setReleaseVersion,
  releaseStepCommandAndRemaining("docs/mdoc"),
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("+publishSigned"),
  releaseStepCommand("sonatypeBundleRelease"),
  setNextVersion,
  commitNextVersion,
  pushChanges
)
