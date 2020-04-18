# StarWarsRolodex

Getting Setup


### What I want you to know :)

* Why is OOP (Object Oriented Programming) important?
* What is inheritance?
* What is encapsulation?
* What is polymorphism?
* What are the access modifiers and what do they mean?
* What are the static and final keywords?
* What is an abstract class vs. interface? What keywords in Java enable the use of each for inheritance?
* What is method overriding?
* What is method overloading?

# Installing Tools / Development Environment

Cmder (Optional), but I like it much better than the Windows CMD
Java JDK
Git for Windows
TortiseGIT
Maven
VS Code

# Before You Start Installing
I like to pick a folder for development executable to exist. Ex. C:\devtools. Things like Maven and Cmder just live somewhere and get added to the PATH variable to be executable.

# Installing the JDK
Download the JDK from here and install: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html#license-lightbox

By default, the JDK should install to ../Program Files/java/jdk.../
Add a new system level environment variable named JAVA_HOME and it will point to this folder

Then, add the following to your system level PATH variable: %JAVA_HOME%\bin

# Installing Git For Windows
Download GFW from here and install: https://github.com/git-for-windows/git/releases/download/v2.26.1.windows.1/Git-2.26.1-64-bit.exe

# Installing TortiseGit
Download TortiseGit from here and install: https://download.tortoisegit.org/tgit/2.10.0.0/TortoiseGit-2.10.0.2-64bit.msi

# Installing Maven
Download the Maven binaries from here and unzip to the folder I mentioned above in the "Before You Start.."
http://apache.mirrors.pair.com/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip

The Maven install guide is pretty good, but I'll highlight the mains steps: http://maven.apache.org/install.html
Once the folder is in place, you'll need to set the Maven environment variables

Set M3_HOME to the path of the unzipped folder of Maven
Add to the system level PATH variable to include %M3_HOME%\bin

