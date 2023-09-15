package com.project.entity.business;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.entity.enums.Note;
import com.project.entity.user.User;

import javax.persistence.*;

public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer absentee;

    private Double midtermExam;

    private Double finalExam;

    private Double examAverage;

    private String infoNote;

    private Note letterGrade;

    @ManyToOne
    @JsonIgnore
    private User teacher;

    @ManyToOne
    @JsonIgnore
    private User student;
}
