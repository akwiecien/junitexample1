import java.util.UUID;

public class javaClass {

    private String id;

    public javaClass(){
        this.id = UUID.randomUUID().toString();
    }

    public String GetId(){
        return this.id;
    }


}
