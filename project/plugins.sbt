addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.9.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.8.0-M1")

addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.5.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:_")
