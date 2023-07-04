package vladproduction.prototype.demoShallowCopy;

import java.util.List;

public class State implements Cloneable{
    private String sql;
    private List<String> parameter;
    private Marker marker;

    public State(String sql, List<String> parameter, Marker marker) {
        this.sql = sql;
        this.parameter = parameter;
        this.marker = marker;
    }

    public State clone() {
        try{
            return (State) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<String> getParameter() {
        return parameter;
    }

    public void setParameter(List<String> parameter) {
        this.parameter = parameter;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }
}
