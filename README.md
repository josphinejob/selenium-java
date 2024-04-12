Features:
* Page Object Model (POM): This framework follows the Page Object Model design pattern, enhancing test maintainability and readability by separating page objects from test logic.
* TestNG Integration: TestNG is integrated for efficient test management, allowing users to organize and execute tests using annotations such as @Test, @BeforeMethod, and @AfterMethod.
* Cross-Browser Compatibility: The framework supports cross-browser testing across major web browsers like Chrome, Firefox, and Edge, ensuring broad compatibility for web applications.
* Parallel Execution: Test execution can be parallelized across multiple threads, optimizing test performance and reducing overall execution time.
* Customizable Reporting: Comprehensive test reports are generated using TestNG, providing detailed insights into test results, including pass/fail status, execution time, and error messages.


Prerequisites:
* Java Development Kit (JDK) installed (version 8 or higher)
* Maven build automation tool installed
* WebDriver binaries for the desired web browsers (e.g., ChromeDriver, GeckoDriver) downloaded and accessible in the system PATH
* IDE (Integrated Development Environment) for Java (e.g., IntelliJ IDEA, Eclipse) installed (optional)
Getting Started


Setup:
* Clone the Repository: Clone the project repository to your local machine using Git.
* Navigate to Project Directory: Change directory to the cloned repository.
* Build the Project: Execute Maven's clean and install commands to build the project and download dependencies: mvn clean install
* Configure WebDriver: Ensure WebDriver binaries for the desired web browsers are available and properly configured. Update the WebDriver paths in the test configuration files or test files if necessary.
* Find Tests: Find test classes under the src/test/java directory. 
* Execute Tests: Run the tests using Maven or your preferred IDE: mvn test
* View Reports: After test execution, view the generated test reports located in the target/surefire-reports directory.