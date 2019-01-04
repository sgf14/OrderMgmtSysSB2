Note lombok is a java preprocessor and therefore needs some special IDE
setup to enable its annotated methods to be seen & active.

1) Add lombok dependency to project- pom or gradle file.

2) At a project level, enable Annotation Processing
	2.a) -Properties/Java Compiler/Annotation Processing- click checkbox
	2.b) close IDE.  If lombok jar has to be initialized- as listed in step 3 below.  Dec18- this is already done for STS.  But specifcally note yet for Eclipse.
	
3) One time only [for IDE] :
	3.a) Get lombok jar file. 		
	3.b) Open CLI as Admin.  in jar dir cmd: java -jar [your lombokxx file].jar and return to trigger popup.
	3.c) select the IDE to apply it to [it looks for what is on machine]
		and hit apply.
	3.d) update STS.ini file in vmarg section add 		'-javaagent:lombok.jar'
	3.e) re-launch sts.  if it wont launch make sure your javaagent line is right

see lombok word doc with details
note that upon setup needed to delete the C:\xx javaagent it added
and add java agent manually


Details:
Lombok- the lombok project uses annotations to limit the amount of code you need to write.  For Java it is a productivity tool.  ie @Getter annotation means you dont have to manually write the getters and setter methods in the POJO class.  However as a pre-processor it comes with a one time cost.  You have to setup your IDE to use it or the IDE will not recognize the ability to use the lombok methods in other client classes- even when the lombok dependency is added correctly- and the project wont compile either- until you have done the setup described.


2) Note that once I set this up in LombokTest project, the lombok builder() method worked on any other project also.  Didnt end up having to do this on every project [at the project level].
3.a) Can open project folder w/ jar [Properties/Java BuildPath/Libraries]  to get locatio of lombox dependency- its the same thing as downloading zip from Lombok site.  You can copy the jar file to Downloads or some other convenient place, in order to open it in CLI.
3.b) you have to have admin rights to execute the jar against the STS/Eclipse.exe base dir.  you can double click the .jar file, and it will open the same prompts- but since that is not admin it will fail to execute.
3.c) Note that if the little lombok red chili icon is next to the IDE, lombok is already associated to that IDE [as is the case with STS today].
3.e) note if IDE will no longer launch there is something wrong with the .ini file.  in sts case it automatically added a javaagent setting but it was the whole path, and since lombok.jar file was already in root dir, it just needed line above.  Once I cleared this bad path out, and added right one STS launched fine- w/ lombok preprocessor attached correctly.
if its still active- this link was very helpful:
http://codeomitted.com/setup-lombok-with-stseclipse-based-ide/
