package fr.fxjavadevblog;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
class ObjectResourcesTest {
    @Test
    void testListObjectsEndpoint() {
        given()
          .when().get("/api/objects")
          .then()
             .statusCode(200)
             .body(containsString("Devices:"));
    }

}