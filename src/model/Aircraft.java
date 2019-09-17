/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas
 */
public class Aircraft {
    
    private int idAircraft;
    private int idOperator;
    private String codAircraft;
    private String typeUse;
    private String producer;
    private String model;
    private String serialNumber;
    private String maxWeigth;
    private String expirationDate;
    private String operatorName;
    private String operatorCpfCnpj;

    public int getIdAircraft() {
        return idAircraft;
    }

    public void setIdAircraft(int idAircraft) {
        this.idAircraft = idAircraft;
    }

    public int getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(int idOperator) {
        this.idOperator = idOperator;
    }

    public String getCodAircraft() {
        return codAircraft;
    }

    public void setCodAircraft(String codAircraft) {
        this.codAircraft = codAircraft;
    }

    public String getTypeUse() {
        return typeUse;
    }

    public void setTypeUse(String typeUse) {
        this.typeUse = typeUse;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMaxWeigth() {
        return maxWeigth;
    }

    public void setMaxWeigth(String maxWeigth) {
        this.maxWeigth = maxWeigth;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorCpfCnpj() {
        return operatorCpfCnpj;
    }

    public void setOperatorCpfCnpj(String operatorCpfCnpj) {
        this.operatorCpfCnpj = operatorCpfCnpj;
    }

    
    
}
