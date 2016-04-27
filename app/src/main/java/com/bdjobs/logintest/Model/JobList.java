
package com.bdjobs.logintest.Model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JobList {

    @SerializedName("jobs")
    @Expose
    private List<Job> jobs = new ArrayList<Job>();

    /**
     * 
     * @return
     *     The jobs
     */
    public List<Job> getJobs() {
        return jobs;
    }

    /**
     * 
     * @param jobs
     *     The jobs
     */
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

}
