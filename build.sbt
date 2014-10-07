import templemore.sbt.cucumber.CucumberPlugin

name := """sbt-1616"""

version := "1.0-SNAPSHOT"

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

lazy val root = (project in file(".")).settings(CucumberPlugin.cucumberSettingsWithTestPhaseIntegration :_*)
