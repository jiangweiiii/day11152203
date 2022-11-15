package com.lening.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.org.apache.bcel.internal.generic.INEG;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "lntrainee")
public class LnTrainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tlnid;
    private String tlnname;
    private String tlnsex;
    private Integer tlnage;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tlnindate;
    private Integer sLnid;
    private Integer cLnid;
    private List<LnRecord> rList = new ArrayList<>();
    private LnCoach lnCoach = new LnCoach();
    private Subject subject = new Subject();

    public Integer getsLnid() {
        return sLnid;
    }

    public void setsLnid(Integer sLnid) {
        this.sLnid = sLnid;
    }

    public Integer getcLnid() {
        return cLnid;
    }

    public void setcLnid(Integer cLnid) {
        this.cLnid = cLnid;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<LnRecord> getrList() {
        return rList;
    }

    public void setrList(List<LnRecord> rList) {
        this.rList = rList;
    }

    public LnCoach getLnCoach() {
        return lnCoach;
    }

    public void setLnCoach(LnCoach lnCoach) {
        this.lnCoach = lnCoach;
    }

    public Integer getTlnid() {
        return tlnid;
    }

    public void setTlnid(Integer tlnid) {
        this.tlnid = tlnid;
    }

    public String getTlnname() {
        return tlnname;
    }

    public void setTlnname(String tlnname) {
        this.tlnname = tlnname;
    }

    public String getTlnsex() {
        return tlnsex;
    }

    public void setTlnsex(String tlnsex) {
        this.tlnsex = tlnsex;
    }

    public Integer getTlnage() {
        return tlnage;
    }

    public void setTlnage(Integer tlnage) {
        this.tlnage = tlnage;
    }

    public Date getTlnindate() {
        return tlnindate;
    }

    public void setTlnindate(Date tlnindate) {
        this.tlnindate = tlnindate;
    }
}
