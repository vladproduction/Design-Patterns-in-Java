package vladproduction.prototype.demoShallowCopy;

import java.util.ArrayList;
import java.util.List;

public class PrototypeExampleDemo {
    public static void main(String[] args) {
        String sql = "select * from movies where name = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Rambo - First blade");
        Marker marker = new Marker();

        State firstState = new State(sql,parameters,marker);
        System.out.println(firstState.getSql());
        System.out.println(firstState.getParameter());
        System.out.println(firstState.getMarker());

        State secondState = firstState.clone();
        System.out.println(secondState.getSql());
        System.out.println(secondState.getParameter());
        System.out.println(secondState.getMarker());
    }
}
                //shadow copy(not deep clone)

        /*      select * from movies where name = ?
                [Rambo - First blade]
                vladproduction.prototype.demoShallowCopy.Marker@7229724f
                select * from movies where name = ?
                [Rambo - First blade]
                vladproduction.prototype.demoShallowCopy.Marker@7229724f       */
