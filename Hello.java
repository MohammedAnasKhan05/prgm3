package example1.example1;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class example1 {

    public static void main(String[] args)
            throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();

        FileReader fileReader =
                new FileReader("C:\\jsonfile\\emp.json");

        Object obj = jsonParser.parse(fileReader);

        JSONObject empObj = (JSONObject) obj;

        String fname = (String) empObj.get("firstname");
        String lname = (String) empObj.get("lastname");

        System.out.println("first name " + fname);
        System.out.println("last name " + lname);
    }
}
