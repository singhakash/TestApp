# Creating Play Hibernate JPA app

Create a new java play project from intellij

Create model

Add Db details

	db.default.driver="com.mysql.jdbc.Driver"
	db.default.url="jdbc:mysql://localhost:3306/dbName"
	db.default.user="username"
	db.default.password="password"
	db.default.jndiName=DefaultDS
	jpa.default=defaultPersistenceUnit
	
	

Adding Dependencies

	libraryDependencies ++= Seq(
	  javaJdbc ,
	  cache ,
	  filters ,
	  javaWs ,
	  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
	  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final",
	   "mysql" % "mysql-connector-java" % "5.1.30")

   
Adding conf/loggers.xml(optional fro logs only)
  
  
