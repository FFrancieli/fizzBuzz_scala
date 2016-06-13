lazy val root = (project in file("."))
	.settings(
	    name := "hello",
	    version := "1.0",
	    scalaVersion := "2.11.7")
	.settings(
		libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
		)

