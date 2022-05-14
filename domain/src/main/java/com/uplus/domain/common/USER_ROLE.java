package com.uplus.domain.common;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "USER_ROLE")
public class USER_ROLE {
        @Id
        private String id;
        private String name;
        private int password;
    }

