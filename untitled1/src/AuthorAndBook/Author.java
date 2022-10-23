package AuthorAndBook;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (isValid(gender)){
            this.gender = gender;
        }else {
            System.out.println("Not required type");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "authors name "+name+",authors email "+email;
    }

    boolean isValid(char gender){
        return (gender == 'm' || gender == 'f');
    }
}
