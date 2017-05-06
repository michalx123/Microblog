
import static spark.Spark.*;

public class KlasaTest {

	public static void main(String[] args) {
		get("/hello", (request, response) -> "Hello World");
		post("/hello", (request, response) -> { return request.body();
		});
		get("/private", (request, response) -> { response.status(401);
		return "go away!"; });
		get("/users/:name", (request, response) -> {
		return "Selected user " + request.params(":name");
		});
		get("/news/:section", (request, response) -> { response.type("text/html");
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><news><b>" + request.params("section") + "</b></news>";
		});
		get("/protected", (request, response) -> { halt(403, "I don't think so!!!");
		return null; });
		get("/redirect", (request, response) -> { response.redirect("/news/world");
		return null; });
		get("/", (request, response) -> { return "root";
		});
		} 

	}


