package com.nga.rockschoolscheduler.forms;

import com.nga.rockschoolscheduler.dao.StudentRepository;
import com.nga.rockschoolscheduler.entity.Student;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("students")
public class StudentTableForm extends VerticalLayout {

     private StudentRepository repository;

    private Grid<Student> grid;

    @Autowired
    public StudentTableForm(StudentRepository repository) {
        this.repository = repository;

        this.grid = new Grid<>(Student.class);

        this.grid.setColumns(
                "firstName", "lastName", "gender", "birthDate", "telNumber",
                "vkAccount", "instAccount", "subjectId", "instructorId");

        add(this.grid);
        setSizeFull();

        updateList();

    }

    private void updateList() {
        grid.setItems(repository.findAll());
    }
}
