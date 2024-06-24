package org.example;

public class Test4 {

    int i;
    public void value(int i)
    {
        this.i=i;
    }
    void show ()
    {
       System.out.println(i);
    }

        public static void main(String[] args) {
            Test4 es = new Test4();
            es.value(10);
            es.show();
        }
    }

