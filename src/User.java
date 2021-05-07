public class User {
    int id;
    String name;
    int value;

    public User(){}

    public User(int i, String name, int value) {
        this.id =i;
        this.name=name;
        this.value=value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}