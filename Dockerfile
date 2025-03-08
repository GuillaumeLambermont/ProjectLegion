# Use a Temurin (Adoptium) base image with Java 21
FROM eclipse-temurin:21-jre-alpine

# Set the working directory in the container
WORKDIR /projectlegion

# Copy the packaged JAR file from the target directory (Maven build)
COPY target/*.jar projectlegion.jar

# Expose the port your application listens on (if applicable)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "projectlegion.jar"]
