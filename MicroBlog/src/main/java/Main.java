import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pl.wwsis.microblog.dao.FollowerDao;
import pl.wwsis.microblog.dao.impl.FollowerDaoImpl;
import pl.wwsis.microblog.dao.impl.WpisDaoImpl;
import pl.wwsis.microblog.model.Follower;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/*", (request, response) -> {

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World");
            int a = 100 + 11;
            attributes.put("dodawanie", a);
            
            return new ModelAndView(attributes, "hello.ftl");
        }, new FreeMarkerEngine());
        
    }
}