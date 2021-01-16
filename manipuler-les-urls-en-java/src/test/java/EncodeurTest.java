import okhttp3.HttpUrl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class EncodeurTest {
    @Test
    public void testEncodeurAvecURL() throws MalformedURLException {
        String protocol = "https";
        String host = "loopbin.dev";
        String file = "/tutos/redis";
        int port = 80;

        URL url = new URL(protocol, host, port, file);

        Assertions.assertEquals(url.toString(), "https://loopbin.dev:80/tutos/redis");
    }

    @Test
    public void testEncodeurAvecURI() throws URISyntaxException {
        String protocol = "mongodb";
        String host = "localhost";
        int port = 0;
        String path = "/utilisateur";
        String auth = "corneille:vermiselle";
        String fragment = "installation";
        String query = "authDb=admin";

        URI uri = new URI(protocol, auth, host, port, path, query, fragment);

        Assertions.assertEquals(uri.toString(), "mongodb://corneille:vermiselle@localhost:0/utilisateur?authDb=admin#installation");
    }

    @Test
    public void testEncodeurAvecOkHTTP() {

        // OKHTTP ne support pas les scheme autre que HTTP et HTTPS
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("www.redislabs.com")
                .addQueryParameter("db", "0")
                .username("johndoe")
                .password("fenty762")
                .build();

        Assertions.assertEquals(httpUrl.toString(), "https://johndoe:fenty762@www.redislabs.com/?db=0");
    }
}
