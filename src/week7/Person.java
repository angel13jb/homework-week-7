package week7;

public class Person {
    //class Person with three instance variables
    String firstname;
    String lastname;
    int age;
    //string type method without parameters with return field
    public String getFirstName() {
        return firstname;
    }
    //string type method without parameters with return field
    public String getLastname() {
        return lastname;
    }
    //int type method without parameters with return field
    public int getAge() {
        return age;
    }
    //instance method with one parameter string type and set field
    public void setFirstname(String firstname) {
        this.firstname = firstname;

    }
    //instance method with string type parameter with set value
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    //instance method with int type variable with set value
    public void setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            this.age = 0;
        }
    }
    //boolean type method
    public boolean isTeen() {
        int a = this.age;
        boolean x;
        if (a > 12 && a < 20) {
            x = true;
        } else {
            x = false;
        }
        return x;
    }
    //string methos no parameters return fullname
    public String getFullName() {
        String Fullname;
        String e;
        if (firstname.isEmpty() == true && lastname.isEmpty() == true) {//if field empty return empty string
            e = "";
        } else {
            e = firstname.concat(lastname);
        }
        return e;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstname("");
        person.setLastname("");
        person.setAge(10);
        System.out.println("fullName=" + person.getFullName());//empty
        System.out.println("teen=" + person.isTeen());//false
        person.setFirstname("John");//john
        person.setAge(18);
        System.out.println("fullName=" + person.getFullName());//
        System.out.println("teen=" + person.isTeen());//true
        person.setLastname("Smith");
        System.out.println("fullName=" + person.getFullName());//john smith

    }

}
