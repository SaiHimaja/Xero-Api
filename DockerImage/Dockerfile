#Dockerfile

FROM openjdk:11-jdk-slim

WORKDIR /app

COPY . .

RUN apt-get update && apt-get install -y maven

RUN mvn clean install

# Adding the credentials
# Use docker secrets to store the credentials
ENV XERO_CLIENT_ID=your-client-id
ENV XERO_CLIENT_SECRET=your-client-secret
ENV REDIRECT_URI=your_redirect_uri
ENV AUTHORIZATION_CODE=your_authorization_code

# Defining the entry point to run the application
CMD ["mvn", "exec:java", "-Dexec.mainClass= com.src.testApi.App"]


#Build the docker file for docker image: docker build -t my-xero-app .
#run the docker file: docker run -it --rm my-xero-app

