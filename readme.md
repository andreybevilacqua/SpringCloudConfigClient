# Spring Cloud Config Client

## Intro
This is a project to practice the Spring Cloud Configuration Server. I created this client solution to use my Spring config server.

It uses Java 8, Maven, Spring Boot 2.0.5, Spring Cloud 2.0.2.


## How to startup
To startup, follow order below:

    - Start ConfigServer via application main class.
    - Start client via application main class.

Access `http://localhost:8020/sentence` to check the full sentence created.


## Endpoints
    - ConfigServer: http://localhost:8001/SpringCloudConfigServer/default/
    - client-solution: http://localhost:8002/lucky-word
    - client-solution: http://localhost:8002/lucky-word2


## Test Spring Cloud Bus
To test Spring Cloud Bus with RabbitMQ:
- Access `http://localhost:8002/lucky-word` to check the sentence complete;
- Change the luckyWord value in lucky-word-client.yml to any word;
- Commit that change in the github (simulating a backing files server);
- Make a POST request to http://localhost:8001/actuator/bus-refresh.
- Now the new lucky word should appear.