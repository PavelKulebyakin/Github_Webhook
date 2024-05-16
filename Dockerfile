# Use a base image with Java installed
FROM eclipse-temurin:21-alpine

# Set the working directory inside the container
# WORKDIR /app

# Copy the packaged JAR file into the container
COPY build/libs/webhook-0.0.1-SNAPSHOT.jar your-application.jar

# Expose the port your app runs on
EXPOSE 8080

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "your-application.jar"]
