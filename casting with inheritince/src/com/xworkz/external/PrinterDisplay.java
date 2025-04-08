package com.xworkz.external;

import com.xworkz.internal.Printer;
import com.xworkz.internal.PrinterChild;

public class PrinterDisplay {
    public void display(Printer printer) {
        printer.print();
        printer.scan();
        printer.copy();
        printer.cancelJob();
        printer.loadPaper();
        
        if (printer instanceof PrinterChild) {
            PrinterChild printerChild = (PrinterChild) printer;
            printerChild.printerSpecialAction();
        }
    }
}
