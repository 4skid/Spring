package ru.tukmakov.springcourse.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Item should not be empty")
    @Column(name = "item_name")
    private String itemName;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person owner;

    public Item() {
    }

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotEmpty(message = "Item should not be empty") String getItemName() {
        return itemName;
    }

    public void setItemName(@NotEmpty(message = "Item should not be empty") String itemName) {
        this.itemName = itemName;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return itemName;
    }
}
