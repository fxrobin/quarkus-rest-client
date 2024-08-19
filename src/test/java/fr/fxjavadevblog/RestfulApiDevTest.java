package fr.fxjavadevblog;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.*;

import java.util.Set;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest

class RestfulApiDevTest {

    @RestClient
    RestfulApiDev api;

    @Test
    void simpleTestApi() {
        assertNotNull(api);
        Set<RestfulApiDev.Device> devices = api.list();
        assertThat(devices).isNotEmpty()
                           .anyMatch(e -> "Apple iPad Mini 5th Gen".equals(e.getName()));

        devices.forEach(System.out::println);                           
    }

}
