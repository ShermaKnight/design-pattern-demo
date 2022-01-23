package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class User implements Serializable, Cloneable {

    private Integer id;
    private String userName;
    private List<Address> addresses;

    public User(Integer id, String userName, List<Address> addresses) {
        this.id = id;
        this.userName = userName;
        this.addresses = addresses;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
