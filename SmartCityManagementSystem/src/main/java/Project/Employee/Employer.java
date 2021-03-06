/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Employee;

import Project.Job.JobDirectory;

/**
 *
 * @author harooniqbal
 */
public class Employer {
    private String name;
    private int id;
    private String address;
    private EmployeeDirectory employeeDirectory;
    private JobDirectory jobDirectory;
    
    private static int count = 1;

    public Employer() {
        id = count;
        count++;
        jobDirectory = new JobDirectory();
        employeeDirectory = new EmployeeDirectory();
    }

    public int getId() {
        return id;
    }
    
 public void setId(int id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
