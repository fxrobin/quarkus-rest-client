package fr.fxjavadevblog;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class ObjectResources {

    @RestClient
    RestfulApiDev apiDev;

    @GET
    @Path("/objects")
    @Produces(MediaType.TEXT_PLAIN)
    public String objects() {
        StringBuilder sb = new StringBuilder();
        sb.append("Devices:\n");
        apiDev.list().forEach(d -> sb.append("- ").append(d.getName()).append("\n"));
        return sb.toString();
    }
}
