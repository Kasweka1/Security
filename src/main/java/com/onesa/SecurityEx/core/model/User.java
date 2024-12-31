package com.onesa.SecurityEx.core.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String username;
    private String password;

    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }
}
