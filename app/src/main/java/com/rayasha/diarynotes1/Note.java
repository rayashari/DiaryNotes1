package com.rayasha.diarynotes1;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by wim on 5/14/16.
 */
public class Note extends RealmObject{

    @PrimaryKey
    private int id;
    private String note;
    private String dateModified;


    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }


}
