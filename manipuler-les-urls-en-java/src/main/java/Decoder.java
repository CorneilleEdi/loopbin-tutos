import java.net.URISyntaxException;
import java.net.URI;

/*
public class Decoder {
    public static void main(String[] args) {
        try {
            URL url = new URL("mongo://corneille:verniselle@localhost:27017/utilisateur?authDB=admin");

            System.out.println("protocole = " + url.getProtocol());
            System.out.println("domaine = " + url.getAuthority());
            System.out.println("host = " + url.getHost());
            System.out.println("port = " + url.getPort());
            System.out.println("chemin = " + url.getPath());
            System.out.println("query = " + url.getQuery());
            System.out.println("cheminComplet = " + url.getFile());
            System.out.println("hash = " + url.getRef());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}*/

public class Decoder {
    public static void main(String[] args) {
        try {
            URI url = new URI("mongo://corneille:verniselle@localhost:27017/utilisateur?authDB=admin&db=0");

            System.out.println("protocole = " + url.getScheme());
            System.out.println("host = " + url.getHost());
            System.out.println("port = " + url.getPort());
            System.out.println("chemin = " + url.getPath());
            System.out.println("query = " + url.getQuery());
            System.out.println("information d'authentification = " + url.getUserInfo());

        } catch ( URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
