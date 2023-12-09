package InnerClass.examples;

public class InnerClassExmpl_localMethod {

    public void innerClassMethod() {

        class Inner {

            public void print() {
                System.out.println("Inside Local method Inner class");
            }

        }

        Inner obj= new Inner();
        obj.print();

    }

}
