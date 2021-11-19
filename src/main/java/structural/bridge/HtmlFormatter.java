package structural.bridge;

import java.util.List;

public class HtmlFormatter implements Formatter{
    @Override
    public String format(String header, List<Detail> detailList) {
        return "HTMLFormatter";
    }
}
