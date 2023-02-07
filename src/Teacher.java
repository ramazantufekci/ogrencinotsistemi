public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String branch,String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Bilgiler: \n"+this.name+" \n"+this.branch+"\n"+this.mpno);
    }
}
