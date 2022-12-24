package lab13.task2;

public class Person {
    private String name;
    private String surname;
    private String second_name;

    public Person(String surname,String name, String second_name) {
        this.name = name;
        this.surname = surname;
        this.second_name = second_name;
    }

    public String getFullName(){
        if (name == "" || second_name == ""){
            return surname;
        }
        else{
            return surname + " " + name.charAt(0) + "." + second_name.charAt(0) + ".";
        }
    }

}
