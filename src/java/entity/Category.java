/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.sql.Timestamp;

public class Category {
    private Long id;
    private String title;
    private Timestamp updated;
    private Timestamp created;

    public Category(Long id, String title, Timestamp created) {
        this.id = id;
        this.title = title;
        this.created = created;
    }

    public Category(){
        
    }

    public Category(Long id, String title, Timestamp updated, Timestamp created) {
        this.id = id;
        this.title = title;
        this.updated = updated;
        this.created = created;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", title=" + title + ", updated=" + updated + ", created=" + created + '}';
    }
    
    
}
