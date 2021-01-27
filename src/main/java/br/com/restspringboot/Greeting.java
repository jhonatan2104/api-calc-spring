package br.com.restspringboot;

public class Greeting {
    private final long id;
    private final Double content;

    public Double getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public Greeting(long id, Double content) {
        this.id = id;
        this.content = content;
    }

}
