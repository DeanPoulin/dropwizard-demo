package com.hmsonline.cubert.resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.acme.demo.resources.PingResource;
import com.sun.jersey.api.client.ClientResponse;
import com.yammer.dropwizard.testing.ResourceTest;

public class PingResourceTest extends ResourceTest {

    @Test
    public void testPing() throws Exception {
        ClientResponse response = client().resource("/ping").get(ClientResponse.class);
        assertEquals(200, response.getStatus());
    }

    @Override
    protected void setUpResources() throws Exception {
        PingResource resource = new PingResource();
        addResource(resource);
    }
}
