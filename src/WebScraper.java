import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {

    //inputs


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static void main(String[] unused) {
        System.out.println("Ran");
    }

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int CountOc(String text, String lookFor) {
        //conver all string to lower case and separate at spaces
        String[] ReadHere = (text.toLowerCase()).split("\\P{L}+");
        //convertlookfor to lower case
        String SearchFor = lookFor.toLowerCase();
        int coun = 0;
        for (int i = 0; i < ReadHere.length; i++) {
            if (SearchFor.equals(ReadHere[i])) {
                coun++;
            }
        }
        return (coun);
    }

}

