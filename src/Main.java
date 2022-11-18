public class Main {
    public static void main(String[] args) {
    Student st1 = new Student("Zsoli","42091169");
    st1.setCity("Ásotthalom");
    st1.setMegye("Csongrád");
    st1.setPhone("06309357459");
    System.out.println(st1.toString());
    st1.deposit(2000);
    st1.enroll("How to become rank1 Evoker");
    st1.enroll("Lovári nyelvtan");
    st1.enroll("Cigányság történelme");
    st1.pay(1000);
    st1.showCourses();
    st1.checkBalance();
        System.out.println("extra kód, hogy github örüljön");

    }
}