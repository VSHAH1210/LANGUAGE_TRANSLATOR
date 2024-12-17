import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Translator {
    private final String APIkey="AIzaSyBZwn6u6yY-ropAoJPMZdubF5Kgz4B2e3k";
    public String translate(String text, String targetedLang){
        try{
            String urlString = "https://translation.googleapis.com/language/translate/v2?key="+APIkey;
            URL url=new URL(urlString);

            //Connection request
            HttpURLConnection connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setDoOutput(true);

            String jsonInputString = "{\"q\": \"" + text + "\", \"target\": \"" + targetedLang + "\"}";
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return extractTranslation(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
            return "Error in translation.";
        }
    }

    // Basic method to extract translated text from JSON response (using org.json library)
    private String extractTranslation(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);
        return jsonObject.getJSONObject("data").getJSONArray("translations").getJSONObject(0).getString("translatedText");
    }
    }

