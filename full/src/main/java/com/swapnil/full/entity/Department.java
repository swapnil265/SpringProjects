package com.swapnil.full.entity;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    //differnet types of annotations available to add Hibernate validations
    @NotBlank(message = "Please add the Department Name")
   // @Length(max=5 ,min=1)
   // @Size(max=10 ,min=1)
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
