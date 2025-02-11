
val BetterMonadicForVersion = "0.3.1"
val CatsEffectVersion       = "3.2.8"
val CatsVersion             = "2.6.1"
val GitHub4sVersion         = "0.29.1"
val KindProjectorVersion    = "0.13.2"
val MacroParadiseVersion    = "2.1.1"
val MinitestVersion         = "2.9.6"
val NewtypeVersion          = "0.4.4"
val ScalaCheckVersion       = "1.15.4"
val ScalaTestVersion        = "3.2.9"
val ScalaTestPlusVersion    = "3.2.2.0"
val SilencerVersion         = "1.7.1"
val SimulacrumVersion       = "1.0.1"
val ZIOVersion              = "1.0.11"

lazy val root = (project in file("."))
  .settings(
    scalaVersion       := "2.12.12",
    crossScalaVersions := Seq("2.12.12", "2.13.4"),
    Test / test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedLaunchOpts ++= List(
      "-Xms1024m",
      "-Xmx1024m",
      "-XX:ReservedCodeCacheSize=128m",
      "-XX:MaxPermSize=256m",
      "-Xss2m",
      "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(
      Resolver.ivyStylePatterns),
    Global / onChangedBuildSource := ReloadOnSourceChanges,
    // Adding dependencies in order to force Scala Steward to help us
    // update the g8 template as well
    libraryDependencies ++= Seq(
      "com.47deg"         %%% "github4s"         % GitHub4sVersion      % Test,
      "dev.zio"           %%% "zio-streams"      % ZIOVersion           % Test,
      "dev.zio"           %%% "zio"              % ZIOVersion           % Test,
      "io.estatico"       %%% "newtype"          % NewtypeVersion       % Test,
      "io.monix"          %%% "minitest-laws"    % MinitestVersion      % Test,
      "io.monix"          %%% "minitest"         % MinitestVersion      % Test,
      "org.scalatest"     %%% "scalatest"        % ScalaTestVersion     % Test,
      "org.scalatestplus" %%% "scalacheck-1-14"  % ScalaTestPlusVersion % Test,
      "org.scalacheck"    %%% "scalacheck"       % ScalaCheckVersion    % Test,
      "org.typelevel"     %%% "cats-core"        % CatsVersion          % Test,
      "org.typelevel"     %%% "cats-effect-laws" % CatsEffectVersion    % Test,
      "org.typelevel"     %%% "cats-effect"      % CatsEffectVersion    % Test,
      "org.typelevel"     %%% "cats-laws"        % CatsVersion          % Test,
      "org.typelevel"     %%% "simulacrum"       % SimulacrumVersion    % Test,
      compilerPlugin(("org.typelevel" % "kind-projector" % KindProjectorVersion).cross(CrossVersion.full) % Test),
      compilerPlugin(("com.github.ghik" % "silencer-plugin" % SilencerVersion).cross(CrossVersion.full) % Test),
      compilerPlugin(("org.scalamacros" % "paradise" % MacroParadiseVersion).cross(CrossVersion.patch) % Test),
      compilerPlugin("com.olegpy" %% "better-monadic-for" % BetterMonadicForVersion % Test)
    )
  )
