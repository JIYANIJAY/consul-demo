FROM openjdk:19-jdk-alpine3.16
RUN mkdir /app
COPY app.jar /app/app.jar
EXPOSE 9091
CMD ["java", "-jar", "./app/app.jar"]

#ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom",  "-jar", "./app/campaign-app-configs.jar"]
