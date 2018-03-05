package com.tims.clone.Tims.System.People.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "people", type="people")

public class PeopleModel {
    @Id
    private String id;

    private String emri;

    private String mbiemri;

    public PeopleModel(String id, String emri, String mbiemri) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }
}
