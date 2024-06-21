package com.brodezno.market.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Client {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private String idClient;
    
        @Column(name = "nombre")
        private String name;
    
        @Column(name = "apellidos")
        private String lastname;
    
        @Column(name = "celular")
        private Long cellphone;
    
        @Column(name = "direccion")
        private String address;
    
        @Column(name = "correo_electronico")
        private String email;

        // Relationships
        @OneToMany(mappedBy = "client")
        private List<Purchase> purchases;
    
        public String getIdClient() {
            return idClient;
        }
    
        public void setIdClient(String idClient) {
            this.idClient = idClient;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getLastname() {
            return lastname;
        }
    
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    
        public Long getCellphone() {
            return cellphone;
        }
    
        public void setCellphone(Long cellphone) {
            this.cellphone = cellphone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}
