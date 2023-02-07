public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca","TRH","905469874563");
        Teacher t2 = new Teacher("Graham Bell","FZK","000");
        Teacher t3 = new Teacher("Külyutmaz","BIO","1111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        tarih.printTeacher();

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50,23,32,45);
        s1.isPass();

        Student s2 = new Student("Güdüek necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,56,76,45);
        s2.isPass();
    }
}
