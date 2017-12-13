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
public class LoginHistoryDTO extends SuperDTO {
    private int logID;
    private UserDTO dTO;
    private String logIN;
    private String logOut;

    public LoginHistoryDTO() {
    }

    public LoginHistoryDTO(int logID, UserDTO dTO, String logIN, String logOut) {
        this.logID = logID;
        this.dTO = dTO;
        this.logIN = logIN;
        this.logOut = logOut;
    }

    public LoginHistoryDTO(UserDTO dTO, String logIN) {
        this.dTO = dTO;
        this.logIN = logIN;
    }

    public LoginHistoryDTO(UserDTO dTO) {
        this.dTO = dTO;
    }

    
    
    /**
     * @return the logID
     */
    public int getLogID() {
        return logID;
    }

    /**
     * @param logID the logID to set
     */
    public void setLogID(int logID) {
        this.logID = logID;
    }

    /**
     * @return the dTO
     */
    public UserDTO getdTO() {
        return dTO;
    }

    /**
     * @param dTO the dTO to set
     */
    public void setdTO(UserDTO dTO) {
        this.dTO = dTO;
    }

    /**
     * @return the logIN
     */
    public String getLogIN() {
        return logIN;
    }

    /**
     * @param logIN the logIN to set
     */
    public void setLogIN(String logIN) {
        this.logIN = logIN;
    }

    /**
     * @return the logOut
     */
    public String getLogOut() {
        return logOut;
    }

    /**
     * @param logOut the logOut to set
     */
    public void setLogOut(String logOut) {
        this.logOut = logOut;
    }
  
    
}
