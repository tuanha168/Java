public class ex1 {
    public static void main(String[] args) {
        Student studentA = new Student("Paul Lee", 3.5);
        Student studentB = new Student("Peter Tan", 3.9);
        System.out.println(studentA.getName());
        System.out.println(studentA.setGpa());
        System.out.println(studentB.getName());
        System.out.println(studentB.setGpa());
    }
}