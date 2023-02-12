
public class Student {
    public String name;
    public int age;
    public String group;

public static void main(String[] args) {
    
    
        Student Bob = new Student() ;
        Bob.setData("Bob", 17, "65/45");

        Student Aren = new Student() ;
        Aren.setData("Aren", 20, "65/45");

        Bob.getData();
        Aren.getData();
    
 }
    public void setData(String name, int age, String group) {
        this.name =name;
        this.age =age;
        this.group =group;
    } 

    public void getData(){
        System.out.println(
            this.name + " Is " + this.age + " years old " + " is in group " + this.group
        );
    }

}



