package com.brodezno.market.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Category {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_categoria")
        private Integer idCategory;
    
        @Column(name = "descripcion")
        private String description;
    
        @Column(name = "estado")
        private Boolean state;

        // Relationships
        @OneToMany(mappedBy = "category")
        private List<Product> products;
    
        public Integer getIdCategory() {
            return idCategory;
        }
    
        public void setIdCategory(Integer idCategory) {
            this.idCategory = idCategory;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getState() {
            return state;
        }

        public void setState(Boolean state) {
            this.state = state;
        }
}
