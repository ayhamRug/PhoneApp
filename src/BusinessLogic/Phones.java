package BusinessLogic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Phones {

    // Websites advised to use (by the experts):
    // https://www.gsmarena.com/ - specs about the phones

    private List<Phone> phones;

    public Phones(){
        try {
            phones = getFromJSONFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

    public List<Phone> getPhones() {
        return phones;
    }

    //loading the database

    private List<Phone> getFromJSONFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, true);

        // as boolean getters names doesn't start from get
        // and if we want to deserialize them, we have to set this
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);

        String path = System.getProperty("user.dir");
        path = path.toString()+"/data/phonesArray.json";

        File f = new File(path);
        if(!f.canRead()) {
            path = System.getProperty("user.dir")+"\\data\\phonesArray.json";
        }

        byte[] jsonPhones = Files.readAllBytes(Paths.get(path));
        JsonNode phoneNodes = objectMapper.readTree(jsonPhones).get("phones");
        ObjectReader reader = objectMapper.readerFor(new TypeReference<List<Phone>>() {});
        List<Phone> phoneList = reader.readValue(phoneNodes);

        return phoneList;
    }
}
