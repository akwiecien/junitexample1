import java.util.UUID;

public class javaClass {

    private String id;
    private String name;
    private int age;

    public javaClass(){
        this.id = UUID.randomUUID().toString();
    }



}
