import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONreguest {
    private HttpURLConnection connection = null;
    private String Request = "http://api.openweathermap.org/data/2.5/weather?q=Kyiv&appid=409efe890aee01355b0ecab0876d4f8d";

    public String getRequest(){
        try {
            URL url = new URL(Request);
            connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            br.close();
            return response.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*public String getApiRequest(String city) {
        try {
            URL url = new URL(apiRequest+"q="+city+"&APPID="+apiKey);
            connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            br.close();
            return response.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
