package com.acme.demo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.acme.demo.webservice.model.Pong;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.yammer.dropwizard.jersey.caching.CacheControl;
import com.yammer.metrics.annotation.Timed;

@Path("/ping")
@Component
@Api(value = "/ping", description = "Ping Resource")
public class PingResource {
    
    @Timed
    @GET
    @Path("/")
    @CacheControl(isPrivate = true, maxAge = 0, noCache = true)
    @ApiOperation(value = "Ping", notes = "Respond to Ping Requests", response = Pong.class)
    @Produces({ MediaType.APPLICATION_JSON })
    public Pong ping() {
        Pong response = new Pong();
        response.setMessage("pong");
        
        return response;
    }
}