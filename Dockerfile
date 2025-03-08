# Use a Temurin (Adoptium) base image with Java 21
FROM eclipse-temurin:21-jre-alpine

# Set the working directory in the container
WORKDIR /ProjectLegion

# Copy the packaged JAR file from the target directory (Maven build)
COPY target/*.jar ProjectLegion.jar

# Expose the port your application listens on (if applicable)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "ProjectLegion.jar"]
