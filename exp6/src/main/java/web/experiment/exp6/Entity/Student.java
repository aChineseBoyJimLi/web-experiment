package web.experiment.exp6.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    private Date birthday;
    private String stuId;

    public Student(){}

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBirthday(Date d){
        this.birthday = d;
    }
    public void setStuId(String id){
        this.stuId = id;
    }

    public Date getBirthday(){
        return this.birthday;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getStuId(){
        return this.stuId;
    }

}
