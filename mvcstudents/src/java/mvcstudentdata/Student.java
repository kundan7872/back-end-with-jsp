/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcstudentdata;

/**
 *
 * @author Kundan Singh
 */
public class Student {
public Student(){
    
}
    public Student(int stId, String stName, String stDob, String stFatherName, String stMob, String stEmail) {
        this.stId = stId;
        this.stName = stName;
        this.stDob = stDob;
        this.stFatherName = stFatherName;
        this.stMob = stMob;
        this.stEmail = stEmail;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStDob() {
        return stDob;
    }

    public void setStDob(String stDob) {
        this.stDob = stDob;
    }

    public String getStFatherName() {
        return stFatherName;
    }

    public void setStFatherName(String stFatherName) {
        this.stFatherName = stFatherName;
    }

    public String getStMob() {
        return stMob;
    }

    public void setStMob(String stMob) {
        this.stMob = stMob;
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }
    private  int stId;
    private  String stName;
    private String stDob;
    private String stFatherName;
    private  String stMob;
    private String stEmail;
    
}
