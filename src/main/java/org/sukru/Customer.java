package org.sukru;

import java.util.concurrent.atomic.AtomicLong;

public class Customer {

    private static AtomicLong counter = new AtomicLong(0);
    private Long id;
    private String name;

    public Customer() {
        this.id = counter.incrementAndGet();
        this.name = "Ege";
    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

  

}
