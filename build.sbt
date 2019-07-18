val cdkVersion = "1.0.0.DEVPREVIEW"

lazy val root = (project in file("."))
  .settings(
    organization := "com.github.yoshiyoshiifujii",
    scalaVersion := "2.12.8",
    name := "scala-cdk-example",
    libraryDependencies ++= Seq(
      "software.amazon.awscdk" % "core" % cdkVersion,
      "software.amazon.awscdk" % "s3" % cdkVersion
    )
  )
