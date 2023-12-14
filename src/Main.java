public class Main {

  public static void main(String[] args) {
   Person person = new Person("Alex", "Braun");
   Employee employee = new Employee("Alex", "Braun", 2300);
    System.out.println(person.info());
    System.out.println(employee.info());
  }
}
