package org.example.task1;

public class Handler50 extends Handler{
    @Override
    public void process(int price) {
        Handler next = getNext();
        if (next!=null) {
            next.process(price % 50);
        } else if(price % 50 > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(price/50 + " * " + 50);
    }
}
