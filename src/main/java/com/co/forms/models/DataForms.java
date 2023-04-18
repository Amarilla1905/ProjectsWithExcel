package com.co.forms.models;

import com.co.forms.models.builders.DataBuilder;

public class DataForms {


    private String name;
    private String email;
    private String currentadress;
    private String permanentadress;


    public DataForms(DataBuilder dataBuilder) {
        this.name = dataBuilder.getListData().get(0).getName();
        this.email = dataBuilder.getListData().get(0).getEmail();
        this.currentadress = dataBuilder.getListData().get(0).getCurrentadress();
        this.permanentadress = dataBuilder.getListData().get(0).getPermanentadress();


    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentadress() {
        return currentadress;
    }

    public String getPermanentadress() {
        return permanentadress;
    }
}

