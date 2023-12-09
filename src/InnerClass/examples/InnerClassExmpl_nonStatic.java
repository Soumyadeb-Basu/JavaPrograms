package InnerClass.examples;

public class InnerClassExmpl_nonStatic {

    public void showOuter() {
        System.out.println("Inside Outer class method.");
    }

    public class Inner {

        public void showInner() {
            System.out.println("Inside Inner class method.");
        }

    }
}
