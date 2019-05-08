package com.huawei.devcloud;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;

/**
 * Root resource (exposed at "intro" path)
 */
@Path("showcase")
public class ShowcaseService {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    public String getIt() {
        return "showcase";
    }
    
    @GET
    @Path("/getSoftwareInfo")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    public String getSoftwareInfo() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "true");
        
        String value1 = ReadProperties.readValue("software.msg1");
        String value2 = ReadProperties.readValue("software.msg2");
        String value3 = ReadProperties.readValue("software.msg3");

        map.put("value1", value1);
        map.put("value2", value2);
        map.put("value3", value3);
        JSONArray json = new JSONArray();
        json.put(map);
        System.out.println(json.toString());
        return json.toString();//"getSoftwareInfo";
    }
    
    @GET
    @Path("/getSchoolInfo")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    public String getSchoolInfo() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "true");
        
        String value1 = ReadProperties.readValue("school.msg1");
        String value2 = ReadProperties.readValue("school.msg2");
        String value3 = ReadProperties.readValue("school.msg3");
        
        map.put("value1", value1);
        map.put("value2", value2);
        map.put("value3", value3);
        JSONArray json = new JSONArray();
        json.put(map);
        System.out.println(json.toString());
        return json.toString();//"getSoftwareInfo";
    }
    
    @GET
    @Path("/getEnterprisesInfo")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    public String getEnterprisesInfo() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "true");
        
        String value1 = ReadProperties.readValue("enterprises.msg1");
        String value2 = ReadProperties.readValue("enterprises.msg2");
        String value3 = ReadProperties.readValue("enterprises.msg3");
        
        map.put("value1", value1);
        map.put("value2", value2);
        map.put("value3", value3);
        JSONArray json = new JSONArray();
        json.put(map);
        System.out.println(json.toString());
        return json.toString();//"getSoftwareInfo";
    }
    
    @GET
    @Path("/getEpibolyInfo")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    public String getEpibolyInfo() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "true");
        
        String value1 = ReadProperties.readValue("epiboly.msg1");
        String value2 = ReadProperties.readValue("epiboly.msg2");
        String value3 = ReadProperties.readValue("epiboly.msg3");
        
        map.put("value1", value1);
        map.put("value2", value2);
        map.put("value3", value3);
        JSONArray json = new JSONArray();
        json.put(map);
        System.out.println(json.toString());
        return json.toString();//"getSoftwareInfo";
    }
}