package example.calcengine;



/**
 * Created by kartik on 8/28/16.
 */

public class Main {
    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("The result is: " + equation.getResult());

        }

        System.out.println();
        System.out.println("Overloading execution");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationoverload = new MathEquation('d');
        equationoverload.execute(leftDouble,rightDouble);

        System.out.print("The Result using double is: ");
        System.out.println(equationoverload.getResult());

        equationoverload.execute(leftInt,rightInt);
        System.out.println("The result using int is: "+equationoverload.getResult());

        equationoverload.execute((double)leftInt,rightInt);
        System.out.println("The result using best overloading is: "+equationoverload.getResult());

        System.out.println();
        System.out.println("Inheritance and over loading");
        System.out.println();

        // Instantiating the child classes through array of objects

        CalculateBase[] calculators = {
                new Divider(100.0d,50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d,17.0d),
                new Multiplier(11.0d,3.0d)
        };

        for (CalculateBase calculator:calculators)
        {
            calculator.calculate();
            System.out.println("The result is: " + calculator.getResult());
        }

    }

//    public static MathEquation create(double leftVal, double rightVal, char opCode)
//        {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//        return equation;
//
//    }


}
