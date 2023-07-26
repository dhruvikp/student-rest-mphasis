package com.simplilearn.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StudentCreateRequestModel {

    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;

}
