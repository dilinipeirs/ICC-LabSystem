/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dto;

import java.time.LocalDateTime;

/**
 *
 * @author Dilini Peiris
 */
public class FormDTO extends SuperDTO {
    private int formID;
    private UserDTO u;
    private LocalDateTime createDateTime;
    private ConcreteWorkDTO concreteWorkDTO;
    private Double moisture_fine;
    private Double moisture_course;
    private Double adj_water;
    private Double abj_ratio;

    public FormDTO() {
    }

    public FormDTO(int formID, UserDTO u, LocalDateTime createDateTime, ConcreteWorkDTO concreteWorkDTO, Double moisture_fine, Double moisture_course, Double adj_water, Double abj_ratio) {
        this.formID = formID;
        this.u = u;
        this.createDateTime = createDateTime;
        this.concreteWorkDTO = concreteWorkDTO;
        this.moisture_fine = moisture_fine;
        this.moisture_course = moisture_course;
        this.adj_water = adj_water;
        this.abj_ratio = abj_ratio;
    }

    /**
     * @return the formID
     */
    public int getFormID() {
        return formID;
    }

    /**
     * @param formID the formID to set
     */
    public void setFormID(int formID) {
        this.formID = formID;
    }

    /**
     * @return the u
     */
    public UserDTO getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(UserDTO u) {
        this.u = u;
    }

    /**
     * @return the createDateTime
     */
    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    /**
     * @param createDateTime the createDateTime to set
     */
    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * @return the concreteWorkDTO
     */
    public ConcreteWorkDTO getConcreteWorkDTO() {
        return concreteWorkDTO;
    }

    /**
     * @param concreteWorkDTO the concreteWorkDTO to set
     */
    public void setConcreteWorkDTO(ConcreteWorkDTO concreteWorkDTO) {
        this.concreteWorkDTO = concreteWorkDTO;
    }

    /**
     * @return the moisture_fine
     */
    public Double getMoisture_fine() {
        return moisture_fine;
    }

    /**
     * @param moisture_fine the moisture_fine to set
     */
    public void setMoisture_fine(Double moisture_fine) {
        this.moisture_fine = moisture_fine;
    }

    /**
     * @return the moisture_course
     */
    public Double getMoisture_course() {
        return moisture_course;
    }

    /**
     * @param moisture_course the moisture_course to set
     */
    public void setMoisture_course(Double moisture_course) {
        this.moisture_course = moisture_course;
    }

    /**
     * @return the adj_water
     */
    public Double getAdj_water() {
        return adj_water;
    }

    /**
     * @param adj_water the adj_water to set
     */
    public void setAdj_water(Double adj_water) {
        this.adj_water = adj_water;
    }

    /**
     * @return the abj_ratio
     */
    public Double getAbj_ratio() {
        return abj_ratio;
    }

    /**
     * @param abj_ratio the abj_ratio to set
     */
    public void setAbj_ratio(Double abj_ratio) {
        this.abj_ratio = abj_ratio;
    }
    
    
}
