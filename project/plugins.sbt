val ScalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).getOrElse("1.1.1")

addSbtPlugin("com.codecommit"            % "sbt-github-actions"            % "0.9.2")
addSbtPlugin("com.47deg"                 % "sbt-microsites"                % "1.2.1")
addSbtPlugin("com.eed3si9n"              % "sbt-unidoc"                    % "0.4.3")
addSbtPlugin("com.geirsson"              % "sbt-ci-release"                % "1.5.3")
addSbtPlugin("com.github.tkawachi"       % "sbt-doctest"                   % "0.9.7")
addSbtPlugin("com.typesafe"              % "sbt-mima-plugin"               % "0.8.0")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"                    % "5.6.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"                  % "0.1.13")
addSbtPlugin("org.portable-scala"        % "sbt-scala-native-crossproject" % "1.0.0")
addSbtPlugin("org.portable-scala"        % "sbt-scalajs-crossproject"      % "1.0.0")
addSbtPlugin("org.scala-js"              % "sbt-scalajs"                   % ScalaJSVersion)
addSbtPlugin("org.scalameta"             % "sbt-mdoc"                      % "2.2.6")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"                  % "2.4.2")
addSbtPlugin("org.scoverage"             % "sbt-scoverage"                 % "1.6.1")
addSbtPlugin("pl.project13.scala"        % "sbt-jmh"                       % "0.4.0")
