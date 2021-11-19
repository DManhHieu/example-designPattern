package bridge;

import java.util.List;

public abstract class Printer {
    private String header;
    private List<Detail> detailList;
    public abstract List<Detail> getDetails();
    public abstract String getHeader();
    public String print(Formatter formatter){
        return formatter.format(header,detailList);
    }
}
