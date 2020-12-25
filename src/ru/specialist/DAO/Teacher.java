package ru.specialist.DAO;

import javax.persistence.*;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(name="Teacher.findAll", 	query="select t from Teacher t")
})

@Entity
@Table(name = "teachers")
public class Teacher implements Serializable {
    private Integer id;
    private String name;
    private String addr;
    private String phone;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "addr")
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-3d %-50s %4d",
                getId(), getName(), getPhone());
    }
}
