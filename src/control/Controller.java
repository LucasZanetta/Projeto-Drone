/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import java.util.Set;
import model.Aircraft;
import model.Operator;

/**
 *
 * @author Lucas
 */
public class Controller {

    public void access() {

        insertObjects();

    }

    private void insertObjects() {

        CsvFileReader fileReader = new CsvFileReader();

        fileReader.readCsv("C:\\Users\\Lucas\\Documents\\NetBeansProjects\\DroneProject\\src\\csvFiles\\intenseTest.csv");

        DataController dataController = new DataController();

        dataController.operatorDatabase((Set<Operator>) fileReader.operator);
        dataController.aircraftDatabase((List<Aircraft>) fileReader.aircraft);
    }

}
