FROM gradle:8.11-jdk21 AS builder

WORKDIR /app

COPY ../build.gradle ../settings.gradle ./
COPY ../gradle ../gradle
COPY ../gradlew ./

COPY . ./config-server

RUN ./gradlew :config-server:bootJar --no-daemon

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=builder /app/config-server/build/libs/config-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8888

ENV JAVA_OPTS="-Xms256m -Xmx512m"

HEALTHCHECK --interval=30s --timeout=3s --start-period=60s --retries=3 \
  CMD wget --no-verbose --tries=1 --spider http://localhost:8888/actuator/health || exit 1

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
