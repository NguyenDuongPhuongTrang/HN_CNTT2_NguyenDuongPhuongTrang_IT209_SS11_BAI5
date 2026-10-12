# Stage 1: Build ứng dụng Spring Boot
FROM gradle:8.7-jdk17 AS builder
WORKDIR /app
# Sao chép Gradle Wrapper và cấu hình
COPY gradlew .
COPY gradle/ ./gradle/
COPY build.gradle settings.gradle ./
# Cấp quyền thực thi cho Gradle Wrapper
RUN chmod +x gradlew
# Sao chép mã nguồn
COPY src/ ./src/
# Build file JAR bằng Gradle Wrapper
RUN ./gradlew bootJar --no-daemon

# Stage 2: Chạy ứng dụng
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
