package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "sinhvien")
public class SinhVien {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    @ManyToOne
    @JoinColumn(name = "lophocId")
    private LopHoc lopHoc;

   public SinhVien(){

    }
    public SinhVien(String id, String firstName, String lastName, int age, String address){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.address=address;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }
    public LopHoc getLopHoc() {
        return lopHoc;
    }
    @Override
    public String toString() {
        
        return "SinhVien"+"[ id="+id+" firstName= "+firstName+" lastName= "+lastName+" age= "+age+" address= "+address+" lopHoc="+lopHoc.getMaLop()+"]";
    }
}
