Features:
* Page Object Model (POM): This framework follows the Page Object Model design pattern, enhancing test maintainability and readability by separating page objects from test logic.
* TestNG: Testing framework. Integrated for using annotations, assertions and test suites.
* Surefire-plugin: For testng xml configuration and report.


Prerequisites:
* Java Development Kit (JDK) installed (version 8 or higher)
* Maven build automation tool installed
* WebDriver binary for the desired web browsers (e.g., ChromeDriver, GeckoDriver) downloaded and accessible in the system PATH
* IDE (Integrated Development Environment) for Java (e.g., IntelliJ IDEA, Eclipse) installed (optional)


Setup and test execution:
* Clone the Repository: Clone the project repository to your local machine using Git.
* Navigate to Project Directory: Change directory to the cloned repository.
* Build the Project: Execute Maven's clean and install commands to build the project and download dependencies: mvn clean install
* Configure WebDriver: Ensure WebDriver binaries for the desired web browsers are available and properly configured. Update the WebDriver paths in the test configuration files or test files if necessary.
* Find Tests: Find test classes under src/test/java directory. 
* Find Pages: Find pages under src/main/java directory.
* Execute Tests: Run all tests using Maven: mvn clean test. Run only one sample test: mvn test -Dgroups=sample. Run only sanity tests :  mvn test -Dgroups=sanity
* View Reports: After test execution, view emailable-report.html located in the target directory.
