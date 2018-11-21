package web.experiment.exp6;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import web.experiment.exp6.Entity.Student;
import web.experiment.exp6.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;


@Controller
@SpringBootApplication
public class Exp6Application {
    @Autowired
    private StudentRepository stuRespo;

    @RequestMapping(path="/text")
    public String text(){
        return "text";
    }


    @PostMapping(path="/add")
    @ResponseBody
    public String addNewStu(@RequestBody Student stu){
        stu.setName(stu.getName());
        stu.setAge(stu.getAge());
        stu.setBirthday(stu.getBirthday());
        stu.setStuId(stu.getStuId());
        stuRespo.save(stu);
        return "success";
    }

    @GetMapping(path="/get")
    @ResponseBody

    public List<Student> getStudents(){
        List<Student> list = new ArrayList<Student>();
        Pageable pageable = new PageRequest(0,10, new Sort(Sort.Direction.ASC,"id"));
        Page<Student> page = stuRespo.findAll(pageable);
        list = page.getContent();
        return list;
    }


    public static void main(String[] args) {
        SpringApplication.run(Exp6Application.class, args);
    }
}
