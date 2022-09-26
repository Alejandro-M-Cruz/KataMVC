package View;

import Model.ContactModel;
import javax.swing.*;
import java.awt.BorderLayout;

public class ContactDisplayView extends JPanel implements ContactView {
    private JTextArea display;
    private ContactModel contactModel;
    
    public ContactDisplayView(ContactModel contactModel) {
        this.contactModel = contactModel;
        createGUI();
        this.refreshContact(this.contactModel.getFirstName(),
                            this.contactModel.getLastName(),
                            this.contactModel.getTitle(),
                            this.contactModel.getOrganization());
    }
    
    @Override
    public void refreshContact(String firstName, String lastName, String title, String organization) {
        this.display.setText("CONTACT: \n Name: "+firstName+", "+lastName+"\n Title: "+title+"\n Organization:  "+organization+" ");
    }
    
    private void createGUI() {
        this.display = new JTextArea(10,40);
        this.display.setEditable(false);
        setLayout(new BorderLayout());
        JScrollPane scrollDisplay = new JScrollPane(this.display);
        this.add(scrollDisplay, BorderLayout.CENTER);
    }
}
