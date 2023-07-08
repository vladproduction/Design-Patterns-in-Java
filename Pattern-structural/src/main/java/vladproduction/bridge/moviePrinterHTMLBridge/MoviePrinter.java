package vladproduction.bridge.moviePrinterHTMLBridge;

import java.util.ArrayList;
import java.util.List;

//one half of the Bridge
public class MoviePrinter extends Printer {

    private Movie movie;

    //point of view: Composition is come to play from here
    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Runtime",movie.getRuntime()));
        details.add(new Detail("Year", movie.getYear()));
        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
