package com.co.forms.models.enums;

public enum ManagementCSV {
FILTRO("filtro");
private String managementTypeData;

    private ManagementCSV(String managementTypeData) {
        this.setManagementTypeData(managementTypeData);
    }


    public String getManagementTypeData() {
        return managementTypeData;
    }

    private void setManagementTypeData(String managementTypeData) {
        this.managementTypeData = managementTypeData;
    }
}