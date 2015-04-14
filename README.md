Demo Dropwizard Webservice
======

This is a demo dropwizard webservice to show the simplicity of leveraging a spring based dropwizard service.

To build and run this service:

1. mvn clean install
2. cd webservice/target
3. tar -xvf demo-webservice-0.0.1-SNAPSHOT.tar.gz
4. cd demo-webservice-0.0.1-SNAPSHOT
5. ./bin/demo

This service response to GET /ping and will respond with

```json
{
   "message": "pong"
}
```

