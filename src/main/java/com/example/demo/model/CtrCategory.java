package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CtrCategory {
    /**
     * 主键ID
     */

    private Long id;


    private String bigCat;


    private String middleCat;


    private String smallCat;



}