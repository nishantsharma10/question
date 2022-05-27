package com.stackroute.studentmanagement.service;

import com.stackroute.studentmanagement.errorhandler.StudentAlreadyExistsException;
import com.stackroute.studentmanagement.errorhandler.StudentNotFoundException;
import com.stackroute.studentmanagement.model.Student;
import com.stackroute.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/*
Add appropriate annotation/s to create a bean for service layer
Implement all the functionality based on the StudentService Interface
 */

public class StudentServiceImpl implements StudentService{

    /*
      Inject the repository bean
     */

}
