import com.cedarsoftware.util.io.JsonReader;

public class JsonParser {

    public static void StringToJson(String input){
        Object obj  = JsonReader.jsonToJava(input);

    }

}
