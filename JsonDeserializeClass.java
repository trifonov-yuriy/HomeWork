import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeserializeClass <T>
{
    public T jsonDeserialize (String jsonString, Class<T> valueType) throws JsonProcessingException
    {
        T object = null;

        object = new ObjectMapper().readValue(jsonString, valueType);

        return object;
    }
}
