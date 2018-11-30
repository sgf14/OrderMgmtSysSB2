To Run project use CLI
Build: cd to dir and cmd = gradle build.  very similar to Maven.
	-there are other cmd options, still getting used to this- more research needed
	-Note if you right click project you still run as SpringBoot app in STS
	-Note you do not have all the same UI/Right click Maven targets.  Mostly doing build via CLI
	-corresponds to mvn install
Run:  from cli can use cmd: gradle bootRun.
	---or--- from STS you can right click project and run as Spring boot app.  both do the same thing. see below.
	corresponds to mvn spring-boot:run

Stop: in CLI use cntl+c to stop app.  in STS there is a stop button.  cntl+c works for gradle or maven.

CLI vs STS: based on experience 
	running project via CLI can be a little cleaner than in sts.  STS tends to bog down running the project w/i app.


Instantiation:
1) Note you have to add Gradle from Eclipse marketplace.  it isnt provided automatically like Maven.
this was done Nov 18 for STS.  But Eclipse IDE itself has not yet been updated.
2) CLI- Similar to Maven and Ant downloaded gradle via zip file and extracted to main Documents folder
	then established in system Environmentals.  [Start bar/system icon/search for 'environmentals'
	need new xx_HOME and update path.  Did this in user section for laptop, vs system section.

Details:
1) gradle bootRun.  Stop app.  in CLI it starts spring project - but cant get it to shutdown.  working on this.
	in spring- console window there is a stop button I use to stop the app.  trying to find corresponding cli cmd
	gradle --stop  {??}.  
	Corresponds to mvn spring-boot:run 
		target in CLI or 
		in STS run as Spring boot project.
	ANSWER: use cntl+c.  per online search.  cli then prompts for confirmation.