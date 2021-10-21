# dibApi
dib Api service

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.dib-artificial:dibApi:3.0.1'
	}
Share this release:

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.dib-artificial</groupId>
	    <artifactId>dibApi</artifactId>
	    <version>3.0.1</version>
	</dependency>
Share this release:

Link
That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).

Link
That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).

If the project doesn't have any GitHub Releases you can use the short commit hash or 'master-SNAPSHOT' as the version.
