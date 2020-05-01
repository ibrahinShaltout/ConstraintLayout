package com.example.constraintlayout.data_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmployeeItemData {

    @SerializedName("JobTitle")
    @Expose
    private String JobTitle;

    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    @SerializedName("Location")
    @Expose
    private String Location;

    @SerializedName("StartJobDate")
    @Expose
    private String StartJobDate;

    public EmployeeItemData(String JobTitle, String CompanyName, String Location, String StartJobDate) {
        this.JobTitle = JobTitle;
        this.CompanyName = CompanyName;
        this.Location = Location;
        this.StartJobDate = StartJobDate;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.JobTitle = jobTitle;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        this.CompanyName = companyName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getStartJobDate() {
        return StartJobDate;
    }

    public void setStartJobDate(String startJobDate) {
        this.StartJobDate = startJobDate;
    }
}
