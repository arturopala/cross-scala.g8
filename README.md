cross-scala.g8
===

A [Giter8](http://www.foundweekends.org/giter8/) template for creating cross-scala.g8

Creates an `sbt` project cross-compiling to Scala versions `2.13.5`, `2.12.13`, `2.11.12`, `3.0.0`, and ScalaJS version `1.5.1`, and ScalaNative version `0.4.0`.

Inside the box
---

 - SBT cross-build
 - Example Hello World code
 - Unit tests setup with <https://scalameta.org/munit/>
 - Scalafmt formatter <https://scalameta.org/scalafmt/>
 - README generation using  <https://scalameta.org/mdoc/>
 - Site generation with <https://www.scala-sbt.org/sbt-site/>
 - Scaladoc publishing on Github Pages with <https://sbt-github-pages.kevinly.dev/>
 - Github Actions for building, releasing, publishing and site generation.



How to create a new project based on the template?
---

* Go to directory where you want to create the template
* Decide your project name (the hardest part :))
* Run the command

    `sbt new arturopala/cross-scala.g8 --libraryName="Hello World" --githubUser="Artur Opala" --githubEmail="foo@gmail.com" --package="com.github" -o cross-scala`

or    

* Install g8 commandline tool (http://www.foundweekends.org/giter8/setup.html)
* Run the command

    `g8 arturopala/cross-scala.g8 --libraryName="Hello World" --githubUser="Artur Opala" --githubEmail="foo@gmail.com" --package="com.github" -o cross-scala`
    
and then
    
    cd cross-scala
    git init
	git add .
	git commit -m start
  
* Test generated project using command 

    `sbt +test`
    

How to test the template and generate an example project?
---

* Run `./test.sh` 

An example project will be then created and tested in `target/sandbox/cross-scala`

How to modify the template?
---

 * review template sources in `/src/main/g8`
 * modify files as you need, but be careful about placeholders, paths and so on
 * run `./test.sh` in template root to validate your changes
 
or (safer) ...

* run `./test.sh` first
* open `target/sandbox/cross-scala` in your preferred IDE, 
* modify the generated example project as you wish, 
* build and test it as usual, you can run `sbt +test`,
* when you are done switch back to the template root
* run `./update-g8.sh` in order to port your changes back to the template.
* run `./test.sh` again to validate your changes

What is in the template?
--

Assuming the command above 
the template will supply the following values for the placeholders:

    $packaged$ -> com/github
	$package$ -> com.github
	$githubEmail$ -> foo@gmail.com
	$libraryName$ -> Hello World
	$libraryNameCamel$ -> HelloWorld
	$libraryNameNoSpaceLowercase$ -> helloworld
	$libraryNameHyphen$ -> hello-world
	$githubUser$ -> Artur Opala
	$githubUserNoSpaceLowercase$ -> arturopala
	$githubUserHyphen$ -> artur-opala

and produce the folders and files as shown below:

    ├── .github
	│   └── workflows
	│       ├── build.yml
	│       ├── publish.yml
	│       ├── release.yml
	│       └── site.yml
	│
	├── .gitignore
	├── .jvmopts
	├── .sbtopts
	├── .scalafix.conf
	├── .scalafmt.conf
	├── .vscode
	│   └── launch.json
	│
	├── build.sbt
	├── LICENSE
	├── project
	│   ├── build.properties
	│   └── plugins.sbt
	│
	├── README.md
	└── src
	    ├── docs
	    │   └── README.md
	    │
	    ├── main
	    │   └── scala
	    │       └── com
	    │           └── github
	    │               └── arturopala
	    │                   └── helloworld
	    │                       └── HelloWorld.scala
	    │
	    ├── site
	    │   └── index.html
	    │
	    └── test
	        └── scala
	            └── com
	                └── github
	                    └── arturopala
	                        └── helloworld
	                            ├── AnyWordSpecCompat.scala
	                            └── HelloWorldSpec.scala