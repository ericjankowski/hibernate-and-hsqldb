hibernate-and-hsqldb
====================

A small hello world example using hibernate and hsqldb

Steps to recreate
=================

1.  Create Maven quickstart application using:  

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.1

2.  Download HSQLDB from: 

http://sourceforge.net/projects/hsqldb/files/ 

and unpack .zip file.

3.  Create application (write some Java code).  Code here is taken from Chapter 2 of Java Persistance with Hibernate by Christian Bauer and Gavin King

	a.  Add dependencies to pom.xml (page 42)
	b.  Copy jar dependencies into /lib folder (for Ant build -- Yes, this is dumb)
	b.  Create Message class (page 43)
	c.  Create hibernate mapping file - Message.hbm.xml (page 45)
	d.  Create HibernateUtil class (page 56)
	e.  Create HelloWorld class with main method (page 46 and 48)
	f.  Create hibernate.cfg.xml file (page 51)
	g.  Create log4j.properties file (page 58)
	h.  Create build.xml file (page 60)



TODO
====

1. Add hsql files to .gitignore
2. Find a way to perform functions of the Ant build with Maven
