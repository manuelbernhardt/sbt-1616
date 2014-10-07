resolvers += Resolver.file("Local Project Repository", file("repository/local"))(Resolver.ivyStylePatterns)

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("templemore" % "sbt-cucumber-plugin" % "0.9.0-SNAPSHOT")

