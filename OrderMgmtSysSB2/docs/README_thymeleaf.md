For Thymeleaf UI implementation, Need to:

1) have thymeleaf dependency loaded in gradle.build [same is true for maven but structure is slightly diff]
	implementation('org.springframework.boot:spring-boot-starter-thymeleaf') [or compile()]
2) need to have a ui style controller separate from restController [@Controller vs @RestController]
3) for microservices projects its a good idea have a separate base url 
	ie Controller = /xx and RestController = api/xx
4) Add your thymeleaf html files under /main/resources/templates [defaul loc.  note diff from AnjularJS here]
	if adding ar dir structure include path in call. ie return "folder\file"
5) in html file add the xml namespace in <html> block
	<html lang="en" xmlns:th="http://www.thymeleaf.org">
6) xx

Startup:
Note that like Gradle the IDE needs [or should have] the marketplace download added.  its not like maven
  search for Thymeleaf- it will enable helper menus to showup while writing code.  The Marketplace Eclipse version works in STS.
Once its added you dont have to mess with it, but it is a reqd download