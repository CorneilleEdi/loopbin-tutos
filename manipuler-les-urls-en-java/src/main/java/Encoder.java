import okhttp3.HttpUrl;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class Encoder {


    static URL encoderAvecURL() {
        URL url = null;
        try {
            String protocol = "https";
            String host = "loopbin.dev";
            String file = "/tutos/redis";
            int port = 80;

            url =  new URL(protocol, host, port, file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }

    static URI encoderAvecURI() {
        URI uri = null;
        try {

            String protocol = "mongodb";
            String host = "localhost";
            int port = 0;
            String path = "/utilisateur";
            String auth = "corneille:vermiselle";
            String fragment = "installation";
            String query = "authDb=admin";

            uri =  new URI(protocol, auth, host, port, path, query, fragment);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return uri;
    }

    static HttpUrl encoderAvecOkHTTP() {
        return new HttpUrl.Builder()
                .scheme("https")
                .host("www.google.com")
                .addPathSegment("search")
                .addQueryParameter("q", "polar bears")
                .build();
    }

    public static void main(String[] args) {
        URL url = encoderAvecURL();
        URI uri = encoderAvecURI();
        HttpUrl httpUrl = encoderAvecOkHTTP();


        System.out.println("url => " + url);
        System.out.println("uri => " + uri);
        System.out.println("httpUrl => " + httpUrl);
    }

}
