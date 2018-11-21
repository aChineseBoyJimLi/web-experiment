package web.experiment.exp6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.experiment.exp6.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
