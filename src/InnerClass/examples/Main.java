package InnerClass.examples;

public class Main {

    public static void main(String[] args) {

        InnerClassExmpl_nonStatic obj= new InnerClassExmpl_nonStatic();
        obj.showOuter();

        InnerClassExmpl_nonStatic.Inner obj1= obj.new Inner();
        obj1.showInner();

        InnerClassExmpl_Static stObj= new InnerClassExmpl_Static();
        stObj.Outer();

        //Creating Object of Static Inner class
        InnerClassExmpl_Static.Inner stInner= new InnerClassExmpl_Static.Inner();
        stInner.Inner();

        InnerClassExmpl_localMethod object= new InnerClassExmpl_localMethod();
        object.innerClassMethod(); //Calling local method inner class

        AnonymousInnerClass objNormal= new AnonymousInnerClass();
        objNormal.print();

        AnonymousInnerClass objAnonymous= new AnonymousInnerClass() {
            @Override
            public void print() {
                System.out.println("Inside Anonymous class- override method");
            }
        };

        objAnonymous.print();

        InnerClassExmpl_AbstractClass objAbstract= new InnerClassExmpl_AbstractClass() {
            @Override
            void testPrint() {
                System.out.println("Inside Abstract method implementation");
            }
        };

        objAbstract.testPrint();

    }
}
