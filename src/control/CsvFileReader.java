/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import model.Aircraft;
import model.Operator;

/**
 *
 * @author Lucas
 */
public class CsvFileReader {

    public Set<Operator> operator = new HashSet<>();
    public List<Aircraft> aircraft = new ArrayList<>();

    public void insertAircraft(String[] data, int idOperator) {

        Aircraft newAircraft = new Aircraft();
        newAircraft.setCodAircraft(data[0]);
        newAircraft.setTypeUse(data[4]);
        newAircraft.setProducer(data[5]);
        newAircraft.setModel(data[6]);
        newAircraft.setSerialNumber(data[7]);
        newAircraft.setMaxWeigth(data[8]);
        newAircraft.setExpirationDate(data[1]);
        newAircraft.setOperatorCpfCnpj(data[3]);
        newAircraft.setOperatorName(data[2]);
        newAircraft.setIdOperator(idOperator);

        aircraft.add(newAircraft);
    }

    public boolean insertOperator(String[] data, boolean verification, int idOperator) {

        Operator newOperator = new Operator();
        newOperator.setName(data[2]);
        newOperator.setCpfCnpj(data[3]);
        newOperator.setCityState(data[9]);
        newOperator.setBranchActivity(data[10]);
        newOperator.setIdOperator(idOperator);
        verification = operator.add(newOperator);
        return verification;
    }

    public void readCsv(String way) {

        String csvFile = way;
        BufferedReader csvContent;
        String row;
        String fieldSeparator = ";";
        String[] data;
        int idOperator = 1;
        boolean verification = true;

        try {

            csvContent = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "iso-8859-1"));

            while ((row = csvContent.readLine()) != null) {

                data = row.split(fieldSeparator);

                if (insertOperator(data, verification, idOperator)) {

                    insertAircraft(data, idOperator);
                    idOperator++;

                } else {

                    for (Operator o : operator) {

                        if (o.getCpfCnpj().equalsIgnoreCase(data[3]) && o.getName().equalsIgnoreCase(data[2])) {

                            insertAircraft(data, o.getIdOperator());
                        }
                    }
                }

            }

        } catch (IOException e) {

        }

    }

}
