import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.* ;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class MovieApiTest {

    @BeforeAll
    public static void setUp(){
        RestAssured.baseURI = "http://www.omdbapi.com" ;
    }
    @AfterAll
    public static void tearDown(){
        reset();
    }

    @Order(1)
    @DisplayName("Test Search Movie or OpenMovieDB Test")
    @Test

    public void testMovie(){
        given()
                .queryParam("apiKey", "5b5d0fe8")
                .queryParam("t", "Mortal Kombat").                
        when()
                .get().prettyPeek().
        then()
                .statusCode(is(200) )
                .contentType(ContentType.JSON)
                .body("Runtime", is("101 min"))
                .body("Director", is("Paul W.S. Anderson"))
                .body("Country", is("United States"))

        ;
    }


    // @Order(1)
    // @DisplayName("Getting the log of request and response")
    // @Test

    // public void testSendingRequestAndGetTheLog() {
    //     given()
    //             .queryParam("apiKey", "5b5d0fe8")
    //             .queryParam("t", "John Wick")
    //             .log().all().
    //             when()
    //             .get().
    //             then()
    //             .log().all()
    //             .statusCode(is(200))
    //             .body("Writer", is("Derek Kolstad"))
    //             .body("Actors", containsString("Keanu Reeves"))
    //            // .body("Ratings[1].Source", is("Rotten Tomatoes"))
    //     ;
    }




// .body("Ratings[0].Source", is("Internet Movie Database"))

