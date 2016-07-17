FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/clojure-in-a-dock2.jar /clojure-in-a-dock2/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojure-in-a-dock2/app.jar"]
