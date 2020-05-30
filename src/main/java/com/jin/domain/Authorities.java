package com.jin.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Authorities implements GrantedAuthority {

    @Id
    @GeneratedValue
    private Long id;
    private String authority;
    @ManyToOne
    private User user;
}
