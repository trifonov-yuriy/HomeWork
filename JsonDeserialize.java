import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeserialize <T>
{
    public T jsonDeserialize(String jsonString, Class<T> valueType, ObjectMapper objectMapper) throws JsonProcessingException
    {
        T object = null;
        object = objectMapper.readValue(jsonString, valueType);
        return object;
    }
}
