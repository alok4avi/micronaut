package micronaut.howdy.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/howdy")
public class GreetingController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Howdy from Micronaut!!";
    }
}