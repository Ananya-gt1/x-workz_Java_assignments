package com.xworkz.external;

import com.xworkz.internal.Notebook;
import com.xworkz.internal.NotebookChild;

public class NotebookDisplay {
    public void display(Notebook notebook) {
        notebook.write();
        notebook.draw();
        notebook.open();
        notebook.close();
        notebook.flipPage();
        
        if (notebook instanceof NotebookChild) {
            NotebookChild notebookChild = (NotebookChild) notebook;
            notebookChild.notebookSpecialAction();
        }
    }
}
