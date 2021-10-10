package com.hendisantika.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/10/21
 * Time: 18.41
 */
@Path("/")
public class HelloController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap hello() {
        return new HashMap() {{
            put("hello", "world");
        }};
    }
}
