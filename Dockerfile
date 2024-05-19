# Start with a base image
FROM openjdk:11

RUN mkdir /MyCashBacksApp

COPY src/main/java/*.class /MyCashBacksApp

WORKDIR /MyCashBacksApp

CMD java MyApp

