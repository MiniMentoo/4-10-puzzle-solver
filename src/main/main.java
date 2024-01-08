public class main {
    public static void main(String[] args) throws InvalidExpression {
        EquationGenerator gen = new EquationGenerator();
        System.out.println(gen.solve(new char[] {'7' , '3', '3', '1', 'x', 'x', 'x'}));
    }
}
