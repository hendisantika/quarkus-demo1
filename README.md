# quarkus-demo1 Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory. Be aware that it’s not an _über-jar_ as
the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-demo1-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html
.

# quarkus-demo1

# A Simple Hello-World CRUD Rest API with Quarkus

## Tools

- Java 11
- Quarkus 2.0.0.Final

## How to run

 ```
$ mvn compile quarkus:dev
 ```

## How to build

 ```
$ mvn clean package
 ```

## How to run binary build

 ```
$ java -jar target\quarkus-app\quarkus-run.jar
 ```

## Get all data

```
$ curl -L -X GET 'http://localhost:8080/transfer/'
```

## Create new data

 ```
$ curl -L -X POST 'http://localhost:8080/transfer/' \
-H 'Content-Type: application/json' \
--data-raw '{
    "accountFrom":"4444",
    "accountTo": "55555",
    "amount" : 50000
}'
```

## Troubleshooting

Sometimes we run binary build directly and got below error,

```
no main manifest attribute, in target\quarkus-demo1-1.0-SNAPSHOT.jar
``` 

above error happens because we are executing the wrong jar file within `target` folder, the right one (despite not an
uberjar file) is actually on folder `target\quarkus-app`

## Docker build

Run below command to do a docker build

```
$ docker build -t quarkus-demo1 .
```

And run it by using below command

```
$ docker run quarkus-demo1
```

Make sure to set the database connection on `application.properties` correctly first.
