package com.org.myapi;

import java.lang.String;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/whoami")
public interface WhoamiResource {
  @GET
  @Produces("application/json")
  String getsDetailsAboutMe();
}
