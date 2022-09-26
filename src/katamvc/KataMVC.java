package katamvc;

import Model.*;
import View.ContactDisplayView;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class KataMVC {

    public static void main(String[] args) {
        ContactModel contactModel = new ContactModel("Zacarías","Daltón","CTO","World Ltd.");
        
        ContactDisplayView contactDisplayView = new ContactDisplayView(contactModel);
        createGUI(contactDisplayView, "Contact Manager...");

        contactModel.setTitle("FO");
        
        ContactDisplayView contactDisplayView1 = new ContactDisplayView(contactModel);
        createGUI(contactDisplayView1, "Contact Manager 1...");
    }
    
    private static void createGUI(JPanel contents, String windowName) {
        JFrame applicationFrame = new JFrame(windowName);
        applicationFrame.getContentPane().add(contents);
        applicationFrame.addWindowListener(new WindowCloseManager());
        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }    
    
    private static class WindowCloseManager extends WindowAdapter {
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    }
}
