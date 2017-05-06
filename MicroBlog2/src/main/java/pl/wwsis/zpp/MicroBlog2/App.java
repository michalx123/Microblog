package pl.wwsis.zpp.MicroBlog2;
import static spark.Spark.*;

import java.util.*;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;



/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
        get("/hello", (request, response) -> {
        	Map<String, Object> attributes = new HashMap<>();
        	attributes.put("message", "Hello World!");
        	int a = 4+4;
        	attributes.put("adding", a);
        	return new ModelAndView(attributes, "hello.ftl");
        	
        }, new FreeMarkerEngine());
    }
}
