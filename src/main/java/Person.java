public class Person {

    private  String name;
    private int age;
    private String adresse;


    public Person(String name,int age,String adresse){
        this.name=name;
        this.age=age;
        this.adresse=adresse;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
