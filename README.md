# SerenityTestingOpenCartNTT

This README provides instructions for setting up and running a Serenity with Cucumber BDD Testing project using Java, IntelliJ, and TestNG.

## Prerequisites

Before you begin, ensure you have the following software installed:

- **Java Development Kit (JDK) 8**
- **Apache Maven 3.6.0 or later**
- **IntelliJ IDEA (Community or Ultimate Edition)**
- **Git (for version control)**

## Project Setup

### Clone the Repository

First, clone the repository to your local machine:

```bash
git clone <repository-url>
cd Serenity
```

### Import the Project into IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Click on `File` > `Open...`.
3. Select the `pom.xml` file located in the root directory of the cloned repository.
4. Click `Open as Project`.

### Configure JDK

Ensure your project is configured to use JDK 8:

1. Go to `File` > `Project Structure`.
2. Under `Project Settings`, select `Project`.
3. Set `Project SDK` to `1.8` (JDK 8).

## Dependencies

The project dependencies are managed by Maven. The key dependencies are:

- **Serenity Core:** 2.0.40
- **Serenity JUnit:** 2.0.40
- **Serenity Cucumber:** 1.9.31
- **Serenity Screenplay:** 2.0.40
- **JUnit:** 4.12
- **Logback Classic:** 1.0.13
- **AssertJ Core:** 3.6.2
- **Hamcrest:** 1.3
- **Gson:** 2.8.0
- **Serenity Rest Assured:** 2.0.90

These dependencies are specified in the `pom.xml` file.

## Running Tests

### Using Maven

To run the tests using Maven, execute the following command in the terminal:

```bash
mvn clean verify
```

This command will:

1. Clean the target directory.
2. Run the tests.
3. Generate Serenity reports in the `target/site/serenity` directory.

### Using IntelliJ IDEA

To run the tests from IntelliJ IDEA:

1. Open the `Run` menu.
2. Select `Edit Configurations...`.
3. Click the `+` icon to add a new configuration.
4. Select `Maven`.
5. Set the `Working Directory` to the project root.
6. In the `Command Line`, enter `clean verify`.
7. Click `OK`.
8. Run the configuration.

## Running Tests in Parallel

The project is configured to run tests in parallel using Maven Failsafe Plugin. This is controlled by the `parallel.tests` property in the `pom.xml` file. The default is set to `4`.

To run tests in parallel:

```bash
mvn clean verify -Pparalelo
```

## Generating Reports

Serenity automatically generates detailed test reports. After running the tests, you can find the reports in the `target/site/serenity` directory.

To view the reports:

1. Navigate to the `target/site/serenity` directory.
2. Open the `index.html` file in your web browser.

## Additional Configuration

### WebDriver Base URL

You can set the base URL for the WebDriver by updating the `webdriver.base.url` property in the `pom.xml` file or passing it as a system property during the Maven build:

```bash
mvn clean verify -Dwebdriver.base.url=http://your.base.url
```

### Custom Tags

You can customize the tags for the Serenity reports by updating the `tags` property in the `pom.xml` file or passing it as a system property during the Maven build:

```bash
mvn clean verify -Dtags=yourTag
```

## Conclusion

This README provided instructions for setting up and running a Serenity with Cucumber BDD Testing project using Java, IntelliJ, and TestNG. Follow the steps carefully to ensure the project is configured correctly.

If you encounter any issues or have any questions, please refer to the Serenity BDD documentation or seek help from the project's maintainers.
