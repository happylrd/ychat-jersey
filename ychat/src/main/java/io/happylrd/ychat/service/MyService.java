package io.happylrd.ychat.service;

import io.happylrd.ychat.domain.MyBean;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/my")
public class MyService {

    @GET
    @Path("/info")
    @Produces(MediaType.APPLICATION_JSON)
    public MyBean getInfo() {
        MyBean bean = new MyBean();
        bean.setName("happylrd");
        bean.setAge(20);
        return bean;
    }
}
