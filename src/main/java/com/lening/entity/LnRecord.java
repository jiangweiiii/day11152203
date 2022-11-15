package com.lening.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "lnrecord")
public class LnRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rlnid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date rlndate;
    private Integer rlnduration;
    private List<Subject> sList;

    public Integer getRlnid() {
        return rlnid;
    }

    public void setRlnid(Integer rlnid) {
        this.rlnid = rlnid;
    }

    public Date getRlndate() {
        return rlndate;
    }

    public void setRlndate(Date rlndate) {
        this.rlndate = rlndate;
    }

    public Integer getRlnduration() {
        return rlnduration;
    }

    public void setRlnduration(Integer rlnduration) {
        this.rlnduration = rlnduration;
    }



    public List<Subject> getsList() {
        return sList;
    }

    public void setsList(List<Subject> sList) {
        this.sList = sList;
    }
}
