package com.project.entity.business;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.entity.enums.Term;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class EducationTerm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Education term must not be empty")
    @Enumerated(EnumType.STRING)
    private Term term;

    @NotNull(message = "Start date must not be empty")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate startDate;
}
