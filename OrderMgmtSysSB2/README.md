keeping for programming notes- see /docs folder
**** THIS IS OLD ***
** see OmsXX grouping of the 3 projects. Product, Order and Customer **
this 1st one was created under lesson 1 as ProductService before I understood the full microservice design/interaction
left all in place for startup notes

Purpose: A springboot microservices project 
	using Gradle as build tool, thymeleaf for ui, docker housing PostgreSQL db and build, and deployed on kubernetes.
	Point is to run several interacting microservice containers [docker] w/ load balancing-orchestration [kubernetes].
	This is ProductService,  See OrderService and CustomerService- related spring projects that are the other interacting services.

Quickstart- To RUN project:
1) DB: Launch local docker instance on desktop
2) DB: using docker CLI or Kitematic app- start oms_postgres to start local instance of db container. cmd: docker container start oms_postgres
3) Gradle Build: CLI- cd to dir and cmd: gradle build. to build project.  can then gradle bootRun for local or do docker
4) Dockerise java app: docker CLI: delete old java spring_boot.  see below*
	4.1) CLI- cmd: docker build . get image id
	4.2) CLI- cmd: docker run --name spring_boot -p 8080:8080 [image-id]
5) Test: launch new browser & or postman to test has been 192.168.99.100 endpoint /product & other

Source: javacodegeeks website.  Nov 18- Springboot, docker, kubernetes workshop.
https://www.javacodegeeks.com/2018/11/spring-microservices-docker-kubernetes.html

Todo pile:
1) [done 11/21/18] deploy per website- completed but w/ db issue- wont commit across sessions.
2) [done 11/26/18] fix db commit issue.  fixed- see application.properties note. only enable java table create on first instance.
3) kubernetes- waiting on JCG part 2- copied below from end of part 1 [part 2 overview]
	Spring cloud, Ribbon for Service Discovery and client side load balancing
	OpenFeign Client
	Kubernetes for container management
	API gateways
4) add thymeleaf.  not part of JCG, but doing to learn
5) add junit tests for endpoints.
6) version control- upload to github

DETAILS:  see docs dir and README files for details + those below
Gradle: Similar to maven you can do a CLI launch or right click project.  
	See README_gradle.md for details

Docker:  common CLI cmds below.  Once Docker toolbox instance launched you can use Kitematic app as a UI interface
	See Notepad docker_postgres.txt file for more details.
	See README_docker.md for details.
	*Deleting old java app, then recreating
		- there has to be a better way than this.  to overwrite the existing, but I havent figured it out yet.
	
Kubernetes:
	See README_kubernetes.md for details.

Details: