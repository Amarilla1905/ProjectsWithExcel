package com.co.forms.models;

import com.co.forms.models.builders.DataBuilder;

public class DataForms {

    private String name;
    private String last_name;
    private String age;
    private String type_document;
    private String number_document;


    public DataForms(DataBuilder dataBuilder) {
        this.name = dataBuilder.getListData().get(0).getName();
        this.last_name = dataBuilder.getListData().get(0).getLast_name();
        this.age = dataBuilder.getListData().get(0).getAge();
        this.type_document = dataBuilder.getListData().get(0).getType_document();
        this.number_document = dataBuilder.getListData().get(0).getNumber_document();

    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAge() {
        return age;
    }

    public String getType_document() {
        return type_document;
    }

    public String getNumber_document() {
        return number_document;
    }
}