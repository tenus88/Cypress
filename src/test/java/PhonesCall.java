import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.* ;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PhonesCall {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://pcat-ci.mobile.xfinity.com/products";
    }

    @AfterAll
    public static void tearDown() {
        reset();
    }

    @Order(1)
    @DisplayName("Test Phones devices")
    @Test

    public void testDevices() {
        given()
                .log().all().
                contentType(ContentType.JSON).
         when()
                .get().prettyPeek().
         then()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
//                .body("displayName", is("Holographic White"))
//                .body("Director", is("Paul W.S. Anderson"))
//                .body("Country", is("USA"))

        ;
    }
}
