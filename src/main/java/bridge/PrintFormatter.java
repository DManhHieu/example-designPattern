package bridge;

import java.util.List;

public class PrintFormatter implements Formatter{
    @Override
    public String format(String header, List<Detail> detailList) {
        return "PrintFormatter";
    }
}
