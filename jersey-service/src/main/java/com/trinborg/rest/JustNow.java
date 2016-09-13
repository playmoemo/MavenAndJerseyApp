package com.trinborg.rest;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * Root resource (exposed at "justnow" path)
 *
 * @author Øyvind Trinborg
 */
@Path("justnow")
public class JustNow {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getJustNowInformation() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        return "<h1>Date & Time</h1></br>"
                + "<h2>Date: " + date.toString() + "</h2></br>"
                + "<h2>Time: " + time.toString() + "</h2>";
    }
}
