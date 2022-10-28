/**
 * Person
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 * Write the following methods (instance methods):
 * *Method named getFirstName without any parameters, it needs to return the value of the
 * firstName field.
 * *Method named getLastName without any parameters, it needs to return the value of the
 * lastName field.
 * *Method named getAge without any parameters, it needs to return the value of the age field.
 * *Method named setFirstName with one parameter of type String, it needs to set the value of the
 * firstName field.
 * *Method named setLastName with one parameter of type String, it needs to set the value of the
 * lastName field.
 * *Method named setAge with one parameter of type int, it needs to set the value of the age field. If
 * the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 * *Method named isTeen without any parameters, it needs to return true if the value of the age field is
 * greater than 12 and less than 20, otherwise, return false.
 * *Method named getFullName without any parameters, it needs to return the full name of the
 * person. *In case both firstName and lastName fields are empty, Strings return an empty String. *In
 * case firstName is an empty String, return firstName.
 * *In case lastName is an empty String, return lastName.
 * To check if s String is empty, use the method isEmpty from the String class. For example,
 * <p>
 * firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
 * contain any characters.
 * TEST EXAMPLE
 * <p>
 * TEST CODE: (Write below code in to main method then check out put)
 * Person person = new Person();
 * person.setFirstName(&quot;&quot;); // firstName is set to empty string
 * person.setLastName(&quot;&quot;); // lastName is set to empty string
 * person.setAge(10);
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * System.out.println(&quot;teen= &quot; + person.isTeen());
 * person.setFirstName(&quot;John&quot;); // firstName is set to John
 * person.setAge(18);
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * System.out.println(&quot;teen= &quot; + person.isTeen());
 * person.setLastName(&quot;Smith&quot;); // lastName is set to Smith
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * <p>
 * OUTPUT
 * fullName=
 * teen= false
 * fullName= John
 * teen= true
 * fullName= John Smith
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */

public class Programme_14_Person {
    //Instance variables
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Programme_14_Person person = new Programme_14_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    //Get Firstname Method
    public String getFirstName() {
        return firstName;
    }

    //Get Lastname Method
    public String getLastName() {
        return lastName;
    }

    //Get age Method
    public int getAge() {
        return age;
    }

    //Set Firstname Method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Set Lastname Method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Set age Method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    //Check is it Teen or not Method
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

    //Get Full name Method
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return getLastName();
        } else if (lastName.isEmpty()) {
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }

}
