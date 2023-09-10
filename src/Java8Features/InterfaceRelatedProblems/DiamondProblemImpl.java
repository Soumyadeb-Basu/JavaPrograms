package Java8Features.InterfaceRelatedProblems;

public class DiamondProblemImpl implements DiamondProblemInterface1,DiamondProblemInterface2{

    @Override
    public void printMsg() {
        DiamondProblemInterface1.super.printMsg();
        DiamondProblemInterface2.super.printMsg();
    }

    public static void main(String[] args) {
        DiamondProblemImpl ob= new DiamondProblemImpl();
        ob.printMsg();
    }
}

