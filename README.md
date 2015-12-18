# Creating Play Hibernate JPA app

Create a new java play project from intellij

Create model

package models;

	import javax.persistence.*;

	/**
	 * Created by Akash Singh on 12/18/2015.
	 */
	@Entity
	@Table(name="member")
	public class Member{

		@Id
		@Column(name = "id", nullable = false)
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;

		@Column(columnDefinition = "varchar(255) default ''")
		private String name;
	}

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
  
  
