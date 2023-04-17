package com.co.forms.models.builders;

import com.co.forms.models.DataForms;
import com.co.forms.utils.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBuilder implements Builder<DataForms> {


    private String name;
    private String last_name;
    private String age;
    private String type_document;
    private String number_document;

    public String getName() {return name;}

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

    protected static DataForms objDataForms;

    private List<DataBuilder> listData= new ArrayList<>();

    private DataBuilder(Map<String, String> data){
        this.name = data.get("name");
        this.last_name = data.get("last_name");
        this.age = data.get("age");
        this.type_document = data.get("type_document");
        this.number_document = data.get("number_document");;

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
