name := """hello-akka"""

version := "1.0"

scalaVersion := "2.11.2"

lazy val akkaVersion = "2.3.6"

libraryDependencies ++= Seq(
  "com.akkademy-db"   %% "akkademy-db"  % "0.0.1-SNAPSHOT",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test"
)
