<h1><B>Cucumber BDD - Test Automation Framework</B></h1>

**Pre-Requisites**

1. Download and install either of the following browsers: Chrome or Firefox or Edge
2. Download and install Java 8
3. Download and install Apache Maven

**Project Specification**

1. Language: Selenium WebDriver with Java
2. Operating System configurations in framework: Windows, macOS, and Unix like environment
3. Build tool: Maven
4. Framework: Cucumber for BDD Framework (with JUnit)
5. Browsers Configured in framework: Chrome/Firefox/Edge
6. IDE used to develop the framework: IntelliJ IDEA Community Edition 2021.2.2

**Steps to run this project from the terminal**

1. Inside the project, under the "config" folder, there is a "config.properties" file, where you can update your desired
   browser like "chrome" or "firefox" or "edge". Default browser is set to "chrome"
2. Go to the project location from the terminal
3. Run maven build lifecycle - mvn compile
4. Run maven build lifecycle - mvn test

**Report**

1. Cucumber pretty report path: \target\cucumber-reports\index.html
2. If any test step fails, the screenshots will be embedded and attached to the cucumber pretty report

**Challenges while setup**

1. While resolving the maven dependencies of the project, disconnect any VPN or go behind the firewall as it may not let the pom.xml
   to connect to the Maven repo and download the dependencies which are required to run this project.
