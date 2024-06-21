package com.brodezno.market.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PurchaseProductPK implements Serializable{

        @Column(name = "id_compra")
        private Integer idPurchase;

        @Column(name = "id_producto")
        private Integer idProduct;

        // Constructor with parameters
        public PurchaseProductPK(Integer idPurchase, Integer idProduct) {
            this.idPurchase = idPurchase;
            this.idProduct = idProduct;
        }

        // Getters and setters
        public Integer getIdPurchase() {
            return idPurchase;
        }

        public void setIdPurchase(Integer idPurchase) {
            this.idPurchase = idPurchase;
        }

        public Integer getIdProduct() {
            return idProduct;
        }

        public void setIdProduct(Integer idProduct) {
            this.idProduct = idProduct;
        }
}
