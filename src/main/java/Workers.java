public class Workers {


    String firstName;
    String secondName;
    int age;

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return (firstName + " " + secondName);
    }



}
