package com.nga.rockschoolscheduler;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {

        Button studentTableBtn = new Button("Students");
        Button instructorTableBtn = new Button("Instructors");
        Button subjectTableBtn = new Button("Subjects");

        HorizontalLayout buttons = new HorizontalLayout(studentTableBtn,
                instructorTableBtn, subjectTableBtn);
        add(buttons);
    }
}
