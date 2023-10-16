import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaJedi {

    public JTextField idJedi;
    public JTextField nomeJedi;
    public JTextField ladoJedi;
    private JButton buttongravar;

    public void desenhaTelaJedi(){


    JFrame frameJedi = new JFrame();
    ImageIcon imageIconJedi = new ImageIcon("jedi.png");
    //FlowLayout layoutJedi = new FlowLayout(FlowLayout.LEADING);
    GridLayout gridlayoutJedi = new GridLayout(3, 0, 0, 0);
    JPanel panelJedi = new JPanel(gridlayoutJedi, false);
    JLabel labelid = new JLabel("Id Jedi");
    JLabel labelnome;
    JLabel labellado = new JLabel("Lado");
    JButton buttongravar = new JButton("Gravar");


    frameJedi.add(panelJedi);

    
    frameJedi.setIconImage(imageIconJedi.getImage());
    frameJedi.setTitle("Cadastra jedi");
    frameJedi.setSize(500,500);
    frameJedi.setResizable(false);
    frameJedi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameJedi.getContentPane().setLayout(gridlayoutJedi);

   /*  frameJedi.setVisible(true);
    frameJedi.add(idJedi = new JTextField());
    frameJedi.add(nomeJedi = new JTextField());
    frameJedi.add(ladoJedi = new JTextField());
*/

    

    panelJedi.add(labelid);
    panelJedi.add(idJedi = new JTextField(null, "Texto pronto", 15));
    this.idJedi.setSize(150, 50);
    panelJedi.add(labelnome = new JLabel("Nome: "));
    panelJedi.add(nomeJedi = new JTextField(null, null, 15));
    panelJedi.add(labellado);
    panelJedi.add(ladoJedi = new JTextField(null, null, 15));

    frameJedi.add(buttongravar);


         buttongravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            System.out.println(idJedi.getText());
            System.out.println(nomeJedi.getText());
            System.out.println(ladoJedi.getText());

         }
         });
    panelJedi.setVisible(true);
    frameJedi.setVisible(true);
    frameJedi.pack();

   /*  panelJedi.add(frameJedi, panelJedi, 0);
    frameJedi.add(frameJedi,gridlayoutJedi, 0);
    */

    }

    public static void main(String[] args) {
        TelaJedi telaJedi = new TelaJedi();
        telaJedi.desenhaTelaJedi();

    } 
}
