import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Person
{
    private String firstName;

    private String lastName;

    private int age;

    private String phoneNumber;

    public String getFirstName()
    {
        return firstName;
    }


    public String getLastName()
    {
        return lastName;
    }


    public int getAge()
    {
        return age;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }



}
