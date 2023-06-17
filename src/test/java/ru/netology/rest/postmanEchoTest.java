package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class postmanEchoTest {

    @Test
    void shouldPostmanEchoApiTest() {
        given()
                .baseUri("https://postman-echo.com")
                //.body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .body("ru.netology.api.postman")
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                //.body(/* --> ваша проверка здесь <-- */)
                .body("data", equalTo("ru.netology.api.postman"))
        ;
    }
}