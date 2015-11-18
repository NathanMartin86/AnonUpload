package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by macbookair on 11/18/15.
 */
@Entity
@Table (name= "files")
public class AnonFile {
    @Id
    @GeneratedValue
    public int id;

    @Column (nullable = false)
    public String originalName;

    @Column (nullable = false)
    public String name;

    @Column (nullable = false)
    public boolean isPermanent;

    @Column (nullable = false)
    public String comment;


}
