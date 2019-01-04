To Run project use CLI
Build: cd to dir and cmd = gradle build.  very similar to Maven.
	-there are other cmd options, still getting used to this- more research needed
	-Note if you right click project you still run as SpringBoot app in STS
	-Note you do not have all the same UI/Right click Maven targets.  Mostly doing build via CLI
	-corresponds to mvn install
Run:  from cli can use cmd: gradle bootRun.
	---or--- from STS you can right click project and run as Spring boot app.  both do the same thing. see below.
	corresponds to mvn spring-boot:run

Stop: in CLI use cntl+c to stop [boot] app.  in STS there is a stop button.  cntl+c works for gradle or maven and 
	seems a common cli command for many apps.

CLI vs STS: based on experience 
	running project via CLI can be a little cleaner than in sts.  STS bogs down otherwise.  IDE tends to bog down running the project w/i app.
	Build in STS does actually work- see Gradle Tasks tab below- double click on build.  there is no corresponding right click run/maven
	that I have found yet.  there is a right click run as spring boot- if project is boot nature.

Instantiation:
1) Marketplace: Note you have to add Gradle from Eclipse marketplace.  it isnt provided automatically like Maven.
	this was done Nov 18 for STS.  But Eclipse IDE itself has not yet been updated.
2) CLI- Similar to Maven and Ant; downloaded gradle via zip file and extracted to main Documents folder
	then established in system Environmentals.  [Start bar/system icon/search for 'environmentals'
	need new xx_HOME and update path.  Did this in user section for laptop, vs system section.]
3) Add sample Gradle project.  It also seems best after you have done the initial marketplace above to create a new gradle project via
	File/New/Gradle via the wizard.  this instantiated the Gradle Tasks tab.  this tab was not added when spring boot 
	with gradle buildship was created.
4) Dependency mgmt:  I have not found a gradle equivalent to Maven right click pom.xml Spring/Edit Starters for automated dependency Mgmt.  
	You just edit the build.gradle file directly.

Details:
1) gradle bootRun.  Stop app.  in CLI it starts spring project - but cant get it to shutdown.  working on this.
	in spring- console window there is a stop button I use to stop the app.  trying to find corresponding cli cmd
	gradle --stop  {??}.  
	Corresponds to mvn spring-boot:run 
		target in CLI or 
		in STS run as Spring boot project.
	ANSWER: use cntl+c.  per online search.  cli then prompts for confirmation.
	
4) Gradle Dependency Mgmt:  it seems this edit starters item just doesnt apply.  Gradle refers to maven repository, and edit starters 
applies to pom.xml [not the project itself]  given that gradle can refer to multiple build repositories, this may never be a function that is automated
in this way.  see links for decent explanation:
https://www.petrikainulainen.net/programming/gradle/getting-started-with-gradle-dependency-management/
https://docs.gradle.org/current/userguide/declaring_repositories.html#declaring_repositories

this problem was highlighted w/ manual add issue of OpenFeign library.  Since that not only had the dependency itself, but some other 
	related blocks in the build.gradle file.  those interrelated blocks got added properly when using new Spring Starter, but I couldnt 
	make the project build when I attempted to do it manually.
