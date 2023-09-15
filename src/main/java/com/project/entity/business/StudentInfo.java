package com.project.entity.business;

import com.project.entity.enums.Note;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
