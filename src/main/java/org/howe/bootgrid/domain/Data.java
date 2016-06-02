package org.howe.bootgrid.domain;

public class Data {
    private Integer id;
    private String name;

    public Data(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
