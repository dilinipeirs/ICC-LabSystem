/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dto;

/**
 *
 * @author Dilini Peiris
 */
public class ConcreteWorkDTO extends SuperDTO {

    private String concreteGrade;
    private Double cement;
    private Double water;
    private Double admix;
    private Double fine_agg;
    private Double course_agg;
    private Double fly_ash;
    private Double silica_fume;
    private Double ratio;

    public ConcreteWorkDTO() {
    }

    public ConcreteWorkDTO(String concreteGrade, Double cement, Double water, Double admix, Double fine_agg, Double course_agg, Double fly_ash, Double silica_fume, Double ratio) {
        this.concreteGrade = concreteGrade;
        this.cement = cement;
        this.water = water;
        this.admix = admix;
        this.fine_agg = fine_agg;
        this.course_agg = course_agg;
        this.fly_ash = fly_ash;
        this.silica_fume = silica_fume;
        this.ratio = ratio;
    }

    /**
     * @return the concreteGrade
     */
    public String getConcreteGrade() {
        return concreteGrade;
    }

    /**
     * @param concreteGrade the concreteGrade to set
     */
    public void setConcreteGrade(String concreteGrade) {
        this.concreteGrade = concreteGrade;
    }

    /**
     * @return the cement
     */
    public Double getCement() {
        return cement;
    }

    /**
     * @param cement the cement to set
     */
    public void setCement(Double cement) {
        this.cement = cement;
    }

    /**
     * @return the water
     */
    public Double getWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    public void setWater(Double water) {
        this.water = water;
    }

    /**
     * @return the admix
     */
    public Double getAdmix() {
        return admix;
    }

    /**
     * @param admix the admix to set
     */
    public void setAdmix(Double admix) {
        this.admix = admix;
    }

    /**
     * @return the fine_agg
     */
    public Double getFine_agg() {
        return fine_agg;
    }

    /**
     * @param fine_agg the fine_agg to set
     */
    public void setFine_agg(Double fine_agg) {
        this.fine_agg = fine_agg;
    }

    /**
     * @return the course_agg
     */
    public Double getCourse_agg() {
        return course_agg;
    }

    /**
     * @param course_agg the course_agg to set
     */
    public void setCourse_agg(Double course_agg) {
        this.course_agg = course_agg;
    }

    /**
     * @return the fly_ash
     */
    public Double getFly_ash() {
        return fly_ash;
    }

    /**
     * @param fly_ash the fly_ash to set
     */
    public void setFly_ash(Double fly_ash) {
        this.fly_ash = fly_ash;
    }

    /**
     * @return the silica_fume
     */
    public Double getSilica_fume() {
        return silica_fume;
    }

    /**
     * @param silica_fume the silica_fume to set
     */
    public void setSilica_fume(Double silica_fume) {
        this.silica_fume = silica_fume;
    }

    /**
     * @return the ratio
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * @param ratio the ratio to set
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

//    @Override
//    public String toString() {
//        return getConcreteGrade() + " " + getCement();
//    }

}
