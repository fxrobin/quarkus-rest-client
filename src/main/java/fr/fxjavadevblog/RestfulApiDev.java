package fr.fxjavadevblog;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import lombok.Data;

import java.util.Map;
import java.util.Set;


@RegisterRestClient(baseUri = "https://api.restful-api.dev")
public interface RestfulApiDev {

    @GET
    @Path("/objects")
    Set<Device> list();

    @Data
    class Device {
        private String id;
        private String name;
        private Map <String, String> data;
    }
}
