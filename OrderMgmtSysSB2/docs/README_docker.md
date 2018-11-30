Quickstart: Build & Run a project on docker
1) Assumes docker toolbox/kitematic on local machine and dockerFile in base of SpringBoot project
2) this will build your projects jar file on local docker [virtual machine] instance
3) Launch Docker from desktop, open kitematic
4) if you already have you java project built in a container- delete the old instance
5) in CLI cd to project root
6) cmd: docker build .
7) cmd: docker run -p 8080:8080 [image id]
	note you need your image id from the previous build step. this starts spring.  if it works on local host [gradle bootRun]
	it should produce same '[project] started in xx sec' type message at the end.  container now up and running
8) test in browser/postman.  
	Note IE edge has some issues with docker local- use firefox or chrome.  http://192.168.99.100:8080/ 
	[whatever ip is] plus the endpoint.
9) In Kitematic delete the project
	think by naming this I can overwrite java spring project- but havent figured this out yet.
	have to delete the old and build again.


Launch- Docker Toolbox:  
	see desktop icon for local instance. see Notepad docker file for cmds
	Can use Kitematic app as a UI presentation vs cli- either works for starting app.

Docker HyperV.  Note downloaded Docker Toolbox version.  the standard version on the javacodegeeks website required
	you to have Windows OS Pro.  I have Windows OS Home- and this will not allow HyperV virtual machine to be installed
	see docker website and download page for details.
	