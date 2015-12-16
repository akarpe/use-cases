package com.company.app;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.customer.app.Person;


@Path("/deim/")
public interface DEIM {

  @POST
  @Path("/add/")
  Response addCustomer(Person person);

  @GET
  @Path("/test/")
  public String test();

}