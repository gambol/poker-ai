name := "Poker"

version := "1.0"

scalaVersion := "2.12.1"

//lazy val root = Project("root", file("."))

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test
    exclude("junit", "junit-dep")
)