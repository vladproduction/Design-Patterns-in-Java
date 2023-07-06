package vladproduction.interpreter.terminalExpression;

public class InterpreterDemo {

    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lion");
        return terminal1;
    }

    public static void main(String[] args) {
        String context = "Lion";

        Expression define = buildInterpreterTree();
        System.out.println(context + ":"+ define.interpret(context));
        //Lion:true
    }
}
