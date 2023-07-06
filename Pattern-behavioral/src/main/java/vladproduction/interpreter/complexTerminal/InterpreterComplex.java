package vladproduction.interpreter.complexTerminal;

public class InterpreterComplex {

    static Expression buildInterpreterTree(){

        Expression terminal1 = new TerminalExpression("Lion");
        Expression terminal2 = new TerminalExpression("Tiger");
        Expression terminal3 = new TerminalExpression("Elephant");

        // Tiger and Elephant
        Expression alternation1 = new AndExpression(terminal2,terminal3);
        // Lion or (Tiger and Elephant)
        Expression alternation2 = new OrExpression(terminal1,alternation1);

        return new AndExpression(terminal3,alternation2);
    }

    public static void main(String[] args) {
//        String context = "Lion";  //Lion:true
//        String context = "Tiger";
//        String context = "Elephant";
        String context = "Tiger Elephant";  //Tiger Elephant:true
//        String context = "Lion Elephant";  //Lion Elephant:true
//        String context = "Lion Tiger";  //Lion Tiger:false

        Expression define = buildInterpreterTree();
        System.out.println(context + ":"+ define.interpret(context));


    }
}
