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
public class UserDTO extends SuperDTO{
    private int userID;
    private String title;
    private String epf;
    private String fname;
    private String lname;
    private String designation;
    private String officeMail;
    private String personalMail;
    private String contact;
    private String username;
    private String password;

    public UserDTO() {
    }

    public UserDTO(int userID, String title, String epf, String fname, String lname, String designation, String officeMail, String personalMail, String contact, String username, String password) {
        this.userID = userID;
        this.title = title;
        this.epf = epf;
        this.fname = fname;
        this.lname = lname;
        this.designation = designation;
        this.officeMail = officeMail;
        this.personalMail = personalMail;
        this.contact = contact;
        this.username = username;
        this.password = password;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the epf
     */
    public String getEpf() {
        return epf;
    }

    /**
     * @param epf the epf to set
     */
    public void setEpf(String epf) {
        this.epf = epf;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the officeMail
     */
    public String getOfficeMail() {
        return officeMail;
    }

    /**
     * @param officeMail the officeMail to set
     */
    public void setOfficeMail(String officeMail) {
        this.officeMail = officeMail;
    }

    /**
     * @return the personalMail
     */
    public String getPersonalMail() {
        return personalMail;
    }

    /**
     * @param personalMail the personalMail to set
     */
    public void setPersonalMail(String personalMail) {
        this.personalMail = personalMail;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
