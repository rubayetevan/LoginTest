
package com.bdjobs.logintest.Model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Job {

    @SerializedName("jobid")
    @Expose
    private String jobid;
    @SerializedName("jobTitle")
    @Expose
    private String jobTitle;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("deadline")
    @Expose
    private String deadline;
    @SerializedName("publishDate")
    @Expose
    private String publishDate;
    @SerializedName("eduRec")
    @Expose
    private String eduRec;
    @SerializedName("experience")
    @Expose
    private String experience;
    @SerializedName("standout")
    @Expose
    private String standout;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("lantype")
    @Expose
    private String lantype;
    @SerializedName("totaljobs")
    @Expose
    private String totaljobs;
    @SerializedName("error")
    @Expose
    private String error;

    /**
     * 
     * @return
     *     The jobid
     */
    public String getJobid() {
        return jobid;
    }

    /**
     * 
     * @param jobid
     *     The jobid
     */
    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    /**
     * 
     * @return
     *     The jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 
     * @param jobTitle
     *     The jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * 
     * @return
     *     The companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 
     * @param companyName
     *     The companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 
     * @return
     *     The deadline
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * 
     * @param deadline
     *     The deadline
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * 
     * @return
     *     The publishDate
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * 
     * @param publishDate
     *     The publishDate
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 
     * @return
     *     The eduRec
     */
    public String getEduRec() {
        return eduRec;
    }

    /**
     * 
     * @param eduRec
     *     The eduRec
     */
    public void setEduRec(String eduRec) {
        this.eduRec = eduRec;
    }

    /**
     * 
     * @return
     *     The experience
     */
    public String getExperience() {
        return experience;
    }

    /**
     * 
     * @param experience
     *     The experience
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    /**
     * 
     * @return
     *     The standout
     */
    public String getStandout() {
        return standout;
    }

    /**
     * 
     * @param standout
     *     The standout
     */
    public void setStandout(String standout) {
        this.standout = standout;
    }

    /**
     * 
     * @return
     *     The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 
     * @param logo
     *     The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 
     * @return
     *     The lantype
     */
    public String getLantype() {
        return lantype;
    }

    /**
     * 
     * @param lantype
     *     The lantype
     */
    public void setLantype(String lantype) {
        this.lantype = lantype;
    }

    /**
     * 
     * @return
     *     The totaljobs
     */
    public String getTotaljobs() {
        return totaljobs;
    }

    /**
     * 
     * @param totaljobs
     *     The totaljobs
     */
    public void setTotaljobs(String totaljobs) {
        this.totaljobs = totaljobs;
    }

    /**
     * 
     * @return
     *     The error
     */
    public String getError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    public void setError(String error) {
        this.error = error;
    }

}
