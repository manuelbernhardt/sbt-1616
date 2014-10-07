import templemore.sbt.cucumber.CucumberPlugin

name := """sbt-1616"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).settings(CucumberPlugin.cucumberSettingsWithTestPhaseIntegration :_*)
