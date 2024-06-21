package com.brodezno.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "compras_productos")
public class PurchaseProduct {
    
        @EmbeddedId
        private PurchaseProductPK id;
    
        @Column(name = "cantidad")
        private Integer quantity;
    
        @Column(name = "total")
        private Double total;
    
        @Column(name = "estado")
        private Boolean state;

        // Relationships
        @ManyToOne
        @JoinColumn(name = "id_compra", insertable = false, updatable = false)
        private Purchase purchase;

        @ManyToOne
        @JoinColumn(name = "id_producto", insertable = false, updatable = false)
        private Product product;
    
        public PurchaseProductPK getId() {
            return id;
        }

        public void setId(PurchaseProductPK id) {
            this.id = id;
        }
    
        public Integer getQuantity() {
            return quantity;
        }
    
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
    
        public Double getTotal() {
            return total;
        }
    
        public void setTotal(Double total) {
            this.total = total;
        }
    
        public Boolean getState() {
            return state;
        }
    
        public void setState(Boolean state) {
            this.state = state;
        }
}
