package io.andre.quarkus;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// @RestController
// @RequestMapping("/hello")
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    // @GetMapping
    @GET
    public List<User> findAll(){
        return User.findAll().list();        
    }

    // @PostMapping
    @POST
    public void save(){
        User.persist(new User(1, "Andre", 35));

    }

}