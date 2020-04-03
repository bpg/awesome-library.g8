val ScalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.32")

addSbtPlugin("com.47deg"                 % "sbt-microsites"                % "1.1.2")
addSbtPlugin("com.eed3si9n"              % "sbt-unidoc"                    % "0.4.3")
addSbtPlugin("com.geirsson"              % "sbt-ci-release"                % "1.5.2")
addSbtPlugin("com.github.tkawachi"       % "sbt-doctest"                   % "0.9.6")
addSbtPlugin("com.typesafe"              % "sbt-mima-plugin"               % "0.7.0")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"                    % "5.4.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"                  % "0.1.11")
addSbtPlugin("org.portable-scala"        % "sbt-scala-native-crossproject" % "1.0.0")
addSbtPlugin("org.portable-scala"        % "sbt-scalajs-crossproject"      % "1.0.0")
addSbtPlugin("org.scala-js"              % "sbt-scalajs"                   % ScalaJSVersion)
addSbtPlugin("org.scalameta"             % "sbt-mdoc"                      % "2.1.1")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"                  % "2.3.2")
addSbtPlugin("org.scoverage"             % "sbt-scoverage"                 % "1.6.1")
addSbtPlugin("pl.project13.scala"        % "sbt-jmh"                       % "0.3.7")
