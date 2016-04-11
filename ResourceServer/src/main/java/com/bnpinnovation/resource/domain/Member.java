package com.bnpinnovation.resource.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by sajacaros on 2016-04-07.
 */
@Data
@Entity
@NoArgsConstructor
public class Member implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String username;
    private String remark;

    public Member(String name, String username, String remark) {
        this.name = name;
        this.username = username;
        this.remark = remark;
    }
}
