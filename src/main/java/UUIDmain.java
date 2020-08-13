import java.util.UUID;
public class UUIDmain {
    public static  void main (String[] args)
    {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        System.out.println((randomUUIDString));
    }
}
