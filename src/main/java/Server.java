import static spark.Spark.*;

public class Server
{
    public static void main(String[] args)
    {
        port(80);

        init();

        get("/hello", (req, res) -> "Hello World");

        get("/hashtag/:hashtag", (request, response) -> {
            return "Hashtag: " + request.params(":hashtag");
        });

    }
}
