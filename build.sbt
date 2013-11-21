name := "scala-exploring-unit-type"

version := "1.0"

scalaVersion := "2.10.2"

fork in run := true

scalacOptions in Compile += "-Ywarn-value-discard"
