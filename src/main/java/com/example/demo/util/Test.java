package com.example.demo.util;

import com.example.demo.model.CtrCategory;

/**
 * @Auther: 李柏杨
 * @Date: 2020/12/7
 * @Description: com.example.demo
 * @version: 1.0
 */
public class Test {

    public static void test() {
        CtrCategory ctrCategory = CtrCategory.builder().id(1L).bigCat("ssss").build();
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        test();
    }

}
