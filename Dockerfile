# QuickBite - Order Service
# Jar được build sẵn bằng: ./gradlew bootJar  (tạo build/libs/app.jar)
# (không build trong Docker vì VPS chỉ có 1 GB RAM)
FROM eclipse-temurin:17-jre

WORKDIR /app
COPY build/libs/app.jar app.jar

EXPOSE 8080

# Giới hạn heap để vừa với VPS 1 GB RAM
ENTRYPOINT ["java", "-Xms128m", "-Xmx256m", "-jar", "app.jar"]
