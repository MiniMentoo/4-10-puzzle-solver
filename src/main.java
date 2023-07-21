public class main {
    public static void main(String[] args) throws InvalidExpression {
        RevPolishCalc calc = new RevPolishCalc();
        System.out.println(solve(new char[] {'6' , '9', '6', '4', 'x', 'x', 'x'}));
    }
//BRACKETS
    //SOLUTIONS INVOLVING BRACKETS DON'T WORK
    //MAKE THEM WORK
    public static String solve(char[] num) throws InvalidExpression {
        RevPolishCalc calculator = new RevPolishCalc();
        StringBuilder builder = new StringBuilder();
        char swap;
        char[] ops = {'+', '-', '*', '/'};
        for(int i = 0; i < 24; i++) {
            if ( i == 0 ) {
                //no swap
            } else if (i == 18) { //bit clumsy but i won't iterate over last 6 without a specific type of loop
                swap = num[2];
                num[2] = num[0];
                num[0] = swap;
            }
            else if ( i % 6 == 0 ) {
                swap = num[0];
                num[0] = num[3];
                num[3] = swap;
            } else if ( i % 2 == 0 ) {
                swap = num[1];
                num[1] = num[3];
                num[3] = swap;
            } else {
                swap = num[2];
                num[2] = num[3];
                num[3] = swap;
            }
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        num[4] = ops[j];
                        num[5] = ops[k];
                        num[6] = ops[l];
                        String s = num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4] + " " + num[5] + " " + num[6];
                        if (equalsTen(s, calculator)) {
                            builder.append(s);
                            builder.append('\n');
                        }
                    }
                }
            }
        }
        return builder.toString();
    }

    public static boolean equalsTen(String sum, RevPolishCalc calculator) throws InvalidExpression {
        return calculator.evaluate(sum) == (float) 10;
    }
}
