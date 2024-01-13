package InnerClass.examples;

public class InnerClassExmpl_Static {

    public void Outer() {

        System.out.println("Inside Outer Class");

    }

    public static class Inner {

        public void Inner() {

            System.out.println("Inside Static Inner class");

        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
