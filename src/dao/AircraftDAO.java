/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Aircraft;
import connection.DatabaseService;

/**
 *
 * @author Lucas
 */
public class AircraftDAO {
    
    public void insertAircraftDatabase(Aircraft aircraft, Connection conn) throws SQLException {
        
        PreparedStatement ps = null;

        try {

            double maxWeigth = Double.parseDouble(aircraft.getMaxWeigth());

            String date = aircraft.getExpirationDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date dataC = new java.sql.Date(sdf.parse(date).getTime());           

            DatabaseService data = new DatabaseService();            

            ps = conn.prepareStatement("insert into cadastro_drone.aeronave (cod_aeronave, tipo_uso, fabricante, modelo, num_serie, peso_max, data_validade, idoperador) values (?,?,?,?,?,?,?,?)");

            ps.setString(1, aircraft.getCodAircraft());
            ps.setString(2, aircraft.getTypeUse());
            ps.setString(3, aircraft.getProducer());
            ps.setString(4, aircraft.getModel());
            ps.setString(5, aircraft.getSerialNumber());
            ps.setDouble(6, maxWeigth);
            ps.setDate(7, dataC);
            ps.setInt(8, aircraft.getIdOperator());
            ps.execute();

        } catch (NumberFormatException | SQLException | ParseException e) {

            System.err.println(e);

        } finally {

            if (ps != null) {

                ps.close();
            }

        }
    }
    
}
