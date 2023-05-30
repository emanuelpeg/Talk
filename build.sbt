val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Talk",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.13",
      "dev.zio" %% "zio-json" % "0.5.0",
      "io.d11" %% "zhttp" % "2.0.0-RC11",
      "io.getquill" %% "quill-zio" % "4.6.0.1",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
