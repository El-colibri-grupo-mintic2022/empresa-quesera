package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Transaction <Enterprise, user> {
    private long id;

    private String concept;

    private float amount;

    private user user;

    private Enterprise enterprise;

    private LocalDateTime createdAt;

    private LocalDateTime  updatedAt;

    //Constructor

    public Transaction(long id, String concept, float amount, user user, Enterprise enterprise, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super();
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //Encapsulamiento


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
