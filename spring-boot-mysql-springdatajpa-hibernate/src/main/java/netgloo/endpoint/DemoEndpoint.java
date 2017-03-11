package netgloo.endpoint;

import netgloo.models.User;
import netgloo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.HashSet;

@Component
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class DemoEndpoint {

    private static final Logger log = Logger.getLogger(DemoEndpoint.class.getName());

    @Autowired
    private UserService userService;

    @GET
    @Path("/{id}")
    public User getEventVersion1(@PathParam("id") String id) {
        log.info( "getOneUser !!");
        return userService.findById(id);
    }


    @GET
    @Path("/getAllUsers")
    public List<User> getAllUsers() {

        log.info( "getAllUsers !!");

        List<User> users = userService.findAllUsers();
        log.info("DemoEndpoint:getAllUsers called:" + users.size());

        return users;

    }
}