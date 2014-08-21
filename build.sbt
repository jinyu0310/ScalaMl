organization := "Patrick Nicolas"

name := "scalaml"

version := "0.9"

scalaVersion := "2.10.3"

// Build org.scalaml library without examples/apps
sourceDirectories in Compile := Seq(file("src/main/scala/"))


// The build script assumes that the following jar file are
// included in the lib
// lib/colt.jar, CRF.jar, CRF-Trove_3.0.2.jar, LBFGS.jar and libsvm_sml.jar

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-math3" % "3.3",
  "org.jfree" % "jfreechart" % "1.0.17",
  "com.typesafe.akka" %% "akka-actor" % "2.1.0",
  "org.apache.spark" %% "spark-core" % "1.0.0",
  "org.apache.spark" %% "spark-mllib" % "1.0.0"
)


// Options for the Scala compiler should be customize
scalacOptions ++= Seq("-unchecked", "-optimize", "-Yinline")

