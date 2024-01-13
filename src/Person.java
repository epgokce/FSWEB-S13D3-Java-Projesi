public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,
                  double salary, boolean isMarried, String[] hobbies) {
        this(firstName, lastName, age);
        if (salary < 11500) {
            this.salary = 11500;
        } else {
            this.salary = salary;
        }
        this.isMarried = isMarried;
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age > 13 && this.age < 19;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String[] getHobbies() {
        return hobbies;
    }
}