package com.bdsystems.account.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
public class Rules implements Serializable {

    @Id
    private Long id;
    private String authority;

    public Rules() {
    }

    public Rules(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rules rules = (Rules) o;
        return Objects.equals(id, rules.id) && Objects.equals(authority, rules.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authority);
    }
}
