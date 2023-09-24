ThisBuild / scalaVersion := "2.13.12"
ThisBuild / organization := "ru.m2"

lazy val root = (project in file("."))
  .aggregate(vslice, layers, util)

lazy val vslice = (project in file("vslice"))
  .settings(
    name := "vertical slice"
  )
  .dependsOn(util)

lazy val layers = (project in file("layers"))
  .settings(
    name := "layers"
  )
  .dependsOn(util)

lazy val util = (project in file("util"))
  .settings(
    name := "util"
  )
