resolvers += Resolver.file("Local Project Repository", file("repository/local"))(Resolver.ivyStylePatterns)

addSbtPlugin("templemore" % "sbt-cucumber-plugin" % "0.9.0-SNAPSHOT")

