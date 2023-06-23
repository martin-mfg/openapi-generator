# Helidon Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/petstore-helidon-server-mp.jar
```

## Exercise the application

```
curl -X GET http://localhost

```

## Try health and metrics

```
curl -s -X GET http://localhost/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET http://localhost/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET http://localhost/metrics
{"base":...
. . .
```