package com.brodezno.market.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "compras")
public class Purchase {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_compra")
        private Integer idPurchase;
    
        @Column(name = "id_cliente")
        private String idClient;
    
        @Column(name = "fecha")
        private LocalDateTime date;
    
        @Column(name = "medio_pago")
        private String paymentMethod;
    
        @Column(name = "comentario")
        private String comment;
    
        @Column(name = "estado")
        private String state;

        // Relationships
        @ManyToOne
        @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
        private Client client;

        @OneToMany(mappedBy = "purchase")
        private List<PurchaseProduct> products;
    
        public Integer getIdPurchase() {
            return idPurchase;
        }
    
        public void setIdPurchase(Integer idPurchase) {
            this.idPurchase = idPurchase;
        }
    
        public String getIdClient() {
            return idClient;
        }
    
        public void setIdClient(String idClient) {
            this.idClient = idClient;
        }
    
        public LocalDateTime getDate() {
            return date;
        }
    
        public void setDate(LocalDateTime date) {
            this.date = date;
        }
    
        public String getPaymentMethod() {
            return paymentMethod;
        }
    
        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }
    
        public String getComment() {
            return comment;
        }
    
        public void setComment(String comment) {
            this.comment = comment;
        }
    
        public String getState() {
            return state;
        }
    
        public void setState(String state) {
            this.state = state;
        }
}
