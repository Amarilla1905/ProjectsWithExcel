package com.co.forms.models.builders;

import com.co.forms.models.DataForms;
import com.co.forms.utils.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBuilder implements Builder<DataForms> {

//Persoa
    private String name;
    private String email;
    private String currentadress;
    private String permanentadress;

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


    protected static DataForms objDataForms;

    private List<DataBuilder> listData= new ArrayList<>();

    private DataBuilder(Map<String, String> data){
        this.name = data.get("name");
        this.email = data.get("email");
        this.currentadress = data.get("current address");
        this.permanentadress = data.get("permanent address");

    }

    public static DataBuilder dataInformation(List<Map<String, String>> DataFormsCredential){
        return new DataBuilder(DataFormsCredential);

    }

    public DataBuilder(List<Map<String, String>> dataCard) {
        createConstructor(dataCard);
    }

    private void createConstructor(List<Map<String, String>> dataCard) {
        for (Map<String,String> data :dataCard){
            listData.add(new DataBuilder(data));
        }
    }

    public static void setPersona(DataForms dataForms){
            DataBuilder.objDataForms = dataForms;
        }

    @Override
    public DataForms build() {
        DataForms createdDataForms = new DataForms(this);
        DataBuilder.setPersona(createdDataForms);
        return createdDataForms;
    }
    public List<DataBuilder> getListData() {
        return listData;
    }
}
