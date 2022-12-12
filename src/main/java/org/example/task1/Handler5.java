package org.example.task1;

public class Handler5 extends Handler{
    @Override
    public void process(int price) {
        Handler next = getNext();
        if (next!=null) {
            next.process(price % 5);
        } else if(price % 5 > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(price/5 + " * " + 5);

        }
    }

