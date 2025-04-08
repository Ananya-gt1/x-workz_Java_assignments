package com.xworkz.external;

import com.xworkz.internal.Table;
import com.xworkz.internal.TableChild;

public class TableDisplay {
    public void display(Table table) {
        table.supportItems();
        table.fold();
        table.extend();
        table.clean();
        table.assemble();
        
        if (table instanceof TableChild) {
            TableChild tableChild = (TableChild) table;
            tableChild.tableSpecialAction();
        }
    }
}
