package Model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.lang.annotation.Repeatable;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table
public class Enterprise {

    @Id
    private long id;

    @Column(length = 50, nullable = false)
    @Column(unique=true)
    private String name;

    @Column(length = 50, nullable = false)
    @Column(unique=true)
    private String document;

    @Column(length = 50, nullable = false)
    private String phone;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 50, nullable = false)
    private List<User> users;


    @Column(length = 50, nullable = false)
    private List<Transaction> transaction;

    @Column(length = 50)
    private LocalDateTime createdAt;

    @Column(length = 50)
    private LocalDateTime  updatedAt;


    //Constructor

    public Enterprise(long id, String name, String document, String phone, String address,
                      List<User> users, List<Transaction> transaction, LocalDateTime createdAt,
                      LocalDateTime updatedAt) {
        super();
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transaction = transaction;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
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

