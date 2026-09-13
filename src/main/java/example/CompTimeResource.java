package example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class CompTimeResource {
  @GET @Path("healthz") public Map<String,String> health() { return Map.of("status", "ok"); }
  @POST @Path("balances") public Map<String,String> pending() { return Map.of("error", "balance workflow pending"); }
}
