public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    double noteAvarage = 0.20;
    double verbalAvarage = 0.80;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note2,int note3,int verbal1,int verbal2,int verbal3){
        if(note1 >=0 && note1<=100 && verbal1 >=0 && verbal1<=100){
            this.c1.note = note1;
            this.c1.verbal = verbal1;
        }
        if(note2 >=0 && note2<=100 && verbal2 >=0 && verbal2<=100) {
            this.c2.note = note2;
            this.c2.verbal = verbal2;
        }
        if(note3 >=0 && note3<=100 && verbal3 >=0 && verbal3 <= 100) {
            this.c3.note = note3;
            this.c3.verbal = verbal3;
        }

    }

    void isPass(){
        this.avarage = ((this.c1.note*this.noteAvarage)+(this.c2.note*this.noteAvarage)+(this.c3.note*this.noteAvarage)) / 3.0;
        double vavarage = ((this.c1.verbal*this.verbalAvarage)+(this.c2.verbal*this.verbalAvarage)+(this.c3.verbal*this.verbalAvarage)) / 3.0;
        this.avarage = this.avarage+vavarage;

        if(this.avarage>55){
            System.out.println("Hababam sınıfı uyanıyor !");
            this.isPass = true;
        }else{
            System.out.println("Hababam sınıfı, sınıfta kaldı !");
            this.isPass = false;
        }

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name+" Notunuz:\t"+this.c1.note);
        System.out.println(this.c2.name+" Notunuz:\t"+this.c2.note);
        System.out.println(this.c3.name+" Notunuz:\t"+this.c3.note);
        System.out.println("Ortalamanız :"+this.avarage);
    }
}
