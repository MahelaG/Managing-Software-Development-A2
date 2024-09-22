public abstract class Person {
    private String name;
    private int age;
    private String gender;
    private String status; //New attribute

    //Constructor
    public Person(String name,int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.status = determineStatus(age); // Setting status based on age
    }

    // New method to determine status based on conditions
    private String determineStatus(int age){
        if (age >=18 && age <=70){
            return "active";
        } else {
            return "inactive";
        }
    }


    public String Details() {
        return "Person, name: " + getName() + ", age: " + getAge() + ", gender: " + getGender();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
