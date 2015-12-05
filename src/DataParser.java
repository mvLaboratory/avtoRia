import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class DataParser {
    public static DataParser instance;

    public static DataParser getInstance() {
        if (instance == null) instance = new DataParser();
        return instance;
    }

    private DataParser() {
    }

    public static void readSite() {
        Document document = null;
        String url = "https://auto.ria.com/search/?category_id=0&marka_id=0&model_id=0&state=0#state[0]=0&s_yers[0]=0&po_yers[0]=0&currency=1&marka_id[0]=0&model_id[0]=0&countpage=10/";
        Connection connection = Jsoup.connect(url);
        try {
            document = connection.get();
        }
        catch (IOException e) {
            System.out.println("Can't open site!");
            return;
        }

        System.out.println(document);
    }
}
