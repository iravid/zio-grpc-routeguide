resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.34")

val zioGrpcVersion = "0.4.0"

libraryDependencies ++= Seq(
  "com.thesamet.scalapb.zio-grpc" %% "zio-grpc-codegen" % zioGrpcVersion,
)

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.6")
