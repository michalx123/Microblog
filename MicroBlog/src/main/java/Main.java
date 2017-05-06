import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.TemplateEngine;
import spark.template.freemarker.FreeMarkerEngine;

public class Main {
    public static void main(String[] args) {
        get("/*", (request, response) -> {
        	
        	Map <String, Object> attributes = new HashMap<>();
        	attributes.put("message","Hello World");
        	int a = 100+10;
        	attributes.put("dodawanie elo", a);
        	return new ModelAndView(attributes, "hello.ftl");
        }, new FreeMarkerEngine());
        
    }
}