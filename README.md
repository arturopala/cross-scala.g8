cross-scala.g8
===

A [Giter8](http://www.foundweekends.org/giter8/) template for creating cross-scala.g8



How to create a new project based on the template?
---

* Go to directory where you want to create the template
* Decide your project name (the hardest part :))
* Run the command

    `sbt new {GITHUB_USER}/cross-scala.g8`

or    

* Install g8 commandline tool (http://www.foundweekends.org/giter8/setup.html)
* Run the command

    `g8 {GITHUB_USER}/cross-scala.g8 --libraryName="Hello World" --githubUser="Artur Opala" --githubEmail="opala.artur@gmail.com" --package="com.github" -o cross-scala`
    
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
	$libraryNameCamel$ -> HelloWorld
	$libraryNameNoSpaceLowercase$ -> helloworld
	$libraryNameHyphen$ -> hello-world
	$libraryName$ -> Hello World
	$githubUserNoSpaceLowercase$ -> arturopala
	$githubUserHyphen$ -> artur-opala
	$githubUser$ -> Artur Opala

and produce the folders and files as shown below:

    ├── .github
	│   └── workflows
	│       ├── build.yml
	│       ├── release.yml
	│       └── site.yml
	│
	├── .gitignore
	├── .jvmopts
	├── .sbtopts
	├── .scalafix.conf
	├── .scalafmt.conf
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