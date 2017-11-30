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
public class LoginHistoryDTO {
    private int logID;
    private UserDTO dTO;
    private LocalDateTime logIN;
    private LocalDateTime logOut;

    public LoginHistoryDTO() {
    }

    public LoginHistoryDTO(int logID, UserDTO dTO, LocalDateTime logIN, LocalDateTime logOut) {
        this.logID = logID;
        this.dTO = dTO;
        this.logIN = logIN;
        this.logOut = logOut;
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
    public LocalDateTime getLogIN() {
        return logIN;
    }

    /**
     * @param logIN the logIN to set
     */
    public void setLogIN(LocalDateTime logIN) {
        this.logIN = logIN;
    }

    /**
     * @return the logOut
     */
    public LocalDateTime getLogOut() {
        return logOut;
    }

    /**
     * @param logOut the logOut to set
     */
    public void setLogOut(LocalDateTime logOut) {
        this.logOut = logOut;
    }
  
    
}
