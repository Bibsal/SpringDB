************What is Spring?*************
Spring is a Dependency Injection framework to,
make java application loosely coupled.
Spring framework makes the easy development of
JavaEE application.
It was developed by Rod Johnson in 2003

--------------------------------------------------

Softwares:
1=>Eclipse/Netbeans/Intelli]
2=>TomcatServer
3=>Mysql for database
4=>Sqlyog , workbench or phpmyadmin for mysql gui


1-Create maven project
2-Adding dependencies =>spring core , spring context
3-creating beans
4-creating configuration file=>config.xml
5-Setter Injection
6-Main class which can pull the object and use


---------------------------------------------------
# Spring IoC Container :-
* Creation of object
* Holding them in memory
* Injecting them into another object as required 

# So, The complete lifecycle of an object from it's creation 
to it's destruction is maintained by Spring IoC Container. 
By doing this hame ready to use objects mil jaynge, 
and we can directly get our objects in our applications 
and hame khud objects nhi bnane pdnge


# Application Context :-
* Application context represents our IoC container 
* And iski implementation tin tarike sae mostly di gai 
* i.e * ClasspathXMLApplicationContext (basically ye scan karta hai hamari xml configuration ko from the java class path)
	  * AnnotationConfigApplicationContext (basically ye un beans(class) ko scan krta hai jisme hamne use kiya ho Annotations)
	  * FileSystemXMLApplicationContext (ye hum tab use krte hai jab hame file configuration ki file ko file system sae scan krani ho tho use karna)

---------------------------------------------------------

* Like in hibernate we have Configuration file likewise 
* in Spring we have an xml file where we declare beans(class) and it's dependencies
 
---------------------------------------------------------

# Steps for Project :-

* Create Maven Project
* Add dependencies => spring core, spring context
* Create beans(means create a class where all getters,setters etc are present) 
     (or java pojo) [or in simple terms beans means to create getters,setters,constructors,toString etc]
* Create configuration file => config.xml
* Now inside config.xml we'll do setter injection using property field and also set the values there
* And lastly go to main class and write the code i.e. call classpathxmlapplicationcontext class so that it can pull the object and use our other files.

----------------------------------------------------------