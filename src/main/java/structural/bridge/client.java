package structural.bridge;

public class client {
    public static void main(String[] args) {
        Movie movie=new Movie();
        Printer printer= new MoviePrinter(movie);
        System.out.println(printer.print(new PrintFormatter()));
        System.out.println(printer.print(new HtmlFormatter()));
    }
}
