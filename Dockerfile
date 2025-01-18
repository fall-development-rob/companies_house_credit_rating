# Use an official Java runtime as a base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Expose the port your app runs on
EXPOSE 8080

# Default command to keep the container alive
CMD ["tail", "-f", "/dev/null"]