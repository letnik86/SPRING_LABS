package ru.specialist.DAO;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    @Autowired
    public void setTeacherRepository(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Transactional(readOnly=true)
    public List<Teacher> findAll() {
        return Lists.newArrayList(teacherRepository.findAll());
    }

    @Transactional(readOnly=true)
    public Teacher findById(int id) {
        return teacherRepository.findOne(id);
    }


    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void delete(int id) {
        teacherRepository.delete(id);
    }
}
