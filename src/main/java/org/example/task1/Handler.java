package org.example.task1;

import lombok.Getter;
import lombok.Setter;

public abstract class Handler {
    public abstract void process(int price);
    @Getter @Setter
    public Handler next;
}
