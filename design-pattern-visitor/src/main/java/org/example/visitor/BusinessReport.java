package org.example.visitor;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {

    private List<Staff> staff = new ArrayList<Staff>() {
        {
            add(new Engineer("工程师A", 10000l));
            add(new Engineer("工程师B", 30000l));
            add(new Engineer("工程师C", 40000l));
            add(new Engineer("工程师D", 5000l));
            add(new Manager("产品经理A", 7l));
            add(new Manager("产品经理B", 4l));
        }
    };

    public void showReport(Visitor visitor) {
        staff.stream().forEach(s -> s.accept(visitor));
    }
}
