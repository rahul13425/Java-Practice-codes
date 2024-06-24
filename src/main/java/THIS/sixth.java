package THIS;

public class sixth {

    sixth m ()    // use the current class instance in the method
    {
      return this;  // this can be used to return the current class instance from the method
    }

    public static void main(String[] args) {
        sixth sx = new sixth();
        sx.m();
    }
}
