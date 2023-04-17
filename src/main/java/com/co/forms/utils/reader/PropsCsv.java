package com.co.forms.utils.reader;

import net.thucydides.core.steps.stepdata.CSVTestDataSource;
import net.thucydides.core.steps.stepdata.TestDataSource;
import static com.co.forms.models.enums.ManagementCSV.FILTRO;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;



public class PropsCsv {
    private PropsCsv() { }

    public static List<Map<String, String>> getDataCsv(String nombreCSV, String filtro) throws IOException {
        TestDataSource testData = new CSVTestDataSource("src/test/resources/datadriven/" + nombreCSV + ".csv", ';');
        return converterDataCsvList(testData, filtro);
    }

    public static List<Map<String, String>> converterDataCsvList(TestDataSource dataPrueba, String filtro) {
        List<Map<String, String>> dataCargada = dataPrueba.getData();
        if ("".equals(filtro)) {
            return dataCargada;
        }
        String[] arrayDatosParaFiltrar = filtro.split(";");
        return filterDataCSV(arrayDatosParaFiltrar, dataCargada);
    }

    public static List<Map<String, String>> filterDataCSV(String[] array, List<Map<String, String>> dataCargada) {
        return dataCargada.stream().filter(fila -> inArray(array, fila.get(FILTRO.getManagementTypeData()))).collect(Collectors.toList());
    }

    public static boolean inArray(String[] arr, String item) {
        if (arr.length > 0) {
            for (String n : arr) {
                if (Objects.equals(item, n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Map<String, String> getDataCsvMap(String nombreCSV, String filtro) throws IOException {
        return getDataCsv(nombreCSV, filtro).get(0);
    }
}
