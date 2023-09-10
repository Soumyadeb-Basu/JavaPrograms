package Java8Features.InterfaceRelatedProblems;

public class DefaultMethodInterfaceImpl implements DefaultMethodInterface {
    @Override
    public void print() {
        System.out.println("Hello. In Impl Class.");
    }

    public static void main(String[] args) {
        DefaultMethodInterface ob1= new DefaultMethodInterfaceImpl();
        ob1.printGeneric();
        ob1.print();
    }
}
