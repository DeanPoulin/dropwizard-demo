Demo Dropwizard Webservice
======

This is a demo dropwizard webservice to show the simplicity of leveraging a spring based dropwizard service.

To build and run this service:

1. mvn clean install
2. cd webservice/target
3. tar -xvf demo-webservice-0.0.1-SNAPSHOT.tar.gz
4. cd demo-webservice-0.0.1-SNAPSHOT
5. ./bin/demo
 
You now have a RESTful service running at http://localhost:9023. The service configuration, including the port, can be set in [webservice/conf/config.yaml](https://github.com/DeanPoulin/dropwizard-demo/blob/master/webservice/conf/config.yaml).

This service currently responds to:

```bash
curl -X GET -H "Content-Type: application/json" -H "Cache-Control: no-cache" http://localhost:9023/ping
```

with

```json
{
   "message": "pong"
}
```

You can also view Swagger documentation for this webservice via http://localhost:9023/developers as seen below:

![Swagger Documentation](https://raw.github.com/DeanPoulin/dropwizard-demo/master/developers.png)

Google Swagger API Docs for more examples...
