package com.lening.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "lncoach")
public class LnCoach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clnid;
    private String clnname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date clnbirth;
    private String clnsex;
    public Integer getClnid() {
        return clnid;
    }

    public void setClnid(Integer clnid) {
        this.clnid = clnid;
    }

    public String getClnname() {
        return clnname;
    }

    public void setClnname(String clnname) {
        this.clnname = clnname;
    }

    public Date getClnbirth() {
        return clnbirth;
    }

    public void setClnbirth(Date clnbirth) {
        this.clnbirth = clnbirth;
    }

    public String getClnsex() {
        return clnsex;
    }

    public void setClnsex(String clnsex) {
        this.clnsex = clnsex;
    }
}
