package structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
    private Movie movie;
    @Override
    public List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title",movie.getTitle()));
        details.add(new Detail("duration", movie.getDuration()));
        details.add(new Detail("kind", movie.getKind()));
        details.add(new Detail("year", movie.getYear()));
        return details;
    }

    @Override
    public String getHeader() {
        return movie.getTitle();
    }
    public MoviePrinter(Movie movie){
        this.movie=movie;
    }
}
