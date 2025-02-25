package com.br.addc.AddClients.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class ClientDto {

    @NotEmpty(message = "O nome é obrigatorio")
    private String firstname;

    @NotEmpty(message = "O sobrenome é obrigatorio")
    private String lastname;

    @NotEmpty(message = "O email é obrigatorio")
    @Email
    private String email;

    private String phone;

    private String address;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
