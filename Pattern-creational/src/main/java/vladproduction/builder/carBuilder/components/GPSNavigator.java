package vladproduction.builder.carBuilder.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "221-B, Baker street, London to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
