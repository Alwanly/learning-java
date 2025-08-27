# lib Directory

This folder is used to maintain external dependencies (JAR files) for the Java project.

## Purpose
- Store third-party library JAR files
- Manage external dependencies that are not available through package managers
- Include libraries that your Java application depends on

## Usage
1. Download JAR files for libraries you need
2. Place them in this `lib` folder
3. The JAR files will be automatically included in the classpath when building/running the project

## Examples of libraries you might add:
- Database drivers (MySQL, PostgreSQL, etc.)
- Utility libraries (Apache Commons, Google Guava, etc.)
- JSON processing libraries (Jackson, Gson, etc.)
- Testing frameworks (JUnit, TestNG, etc.)

## Note
- Only add JAR files that are not managed by build tools like Maven or Gradle
- Consider using Maven or Gradle for better dependency management in larger projects
- JAR files in this folder should be committed to version control (unlike the `bin` folder)
