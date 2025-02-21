# Use Ubuntu as the base image
FROM ubuntu:latest

# Install Java and wget for JUnit
RUN apt-get update && apt-get install -y openjdk-17-jdk wget

# Set the working directory inside the container
WORKDIR /app

# Copy Java source files
COPY devcal.java .
COPY devcaltest.java .

# Download JUnit
RUN wget -q https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.2/junit-platform-console-standalone-1.9.2.jar -O junit.jar

# Compile Java files
RUN javac -cp .:junit.jar devcal.java devcaltest.java

# Run JUnit tests
RUN java -jar junit.jar -cp . --select-class devcaltest

# Run the Calculator program
ENTRYPOINT ["java", "devcal"]

