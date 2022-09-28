FROM openjdk:18
COPY target/docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java", "-jar", "/docker-spring-boot.jar"]

#docker network create team-trip-advisor-network
#docker run --name team-trip-advisor-db --network team-trip-advisor-network -p 3306:3306 -e MYSQL_ROOT_PASSWORD=Heelgeheim123 -e MYSQL_DATABASE=team-trip-advisor-db -e MYSQL_USER=aaron -e MYSQL_PASSWORD=Heelgeheim123 -d mysql/mysql-server:8.0.30

#docker exec -it c5096d55535cd172f3faa4205dcb807e764bb045b4d67eb63140faab4e18e38b bash
#mysql -uaaron -pHeelgeheim123
#use team-trip-advisor-db

#docker build -t api .
#docker run --network team-trip-advisor-network --name team-trip-advisor-api -p 8080:8080 -d api
