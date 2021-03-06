 package vending.gui;


import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Buy;
import model.Reselect;
import model.Stop;
import model.Vending;
import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;


@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame implements GUIInterface {
	
	static Vending machine;
	 // Variables declaration - do not modify                     
    private javax.swing.JButton btnBuy ;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JTextField changeTF;
    private javax.swing.JRadioButton debrecenRB;
    private javax.swing.JRadioButton gyorRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moneyTF;
    private javax.swing.JRadioButton pecsRB;
    private javax.swing.JRadioButton szegedRB;
    // End of variables declaration    
    
   
    
    static void init (){
		machine = Action.create(Vending.class);
		Action.start(machine);
		}
       
                           
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pecsRB = new javax.swing.JRadioButton();
        debrecenRB = new javax.swing.JRadioButton();
        gyorRB = new javax.swing.JRadioButton();
        szegedRB = new javax.swing.JRadioButton();
        btnBuy = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        moneyTF = new javax.swing.JTextField();
        changeTF = new javax.swing.JTextField();
        
        //ModelExecutor.create().setTraceLogging(true).start(GUI::init);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       // setTitle("Ticket Vending Machine By Dhiraj Kumar Tripathi (TEA5KC)");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Ticket Vending Machine");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Ticket"));

        pecsRB.setText("Pecs  4500 ft");
        pecsRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pecsRBActionPerformed(evt);
            }
        });

        debrecenRB.setText("Debrecen 5000 ft");
        debrecenRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debrecenRBActionPerformed(evt);
                
            }
        });

        gyorRB.setText("Gyor 3000 ft");
        gyorRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gyorRBActionPerformed(evt);
            }
        });

        szegedRB.setText("Szeged 4000 ft");
        szegedRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szegedRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gyorRB)
                    .addComponent(pecsRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(debrecenRB)
                    .addComponent(szegedRB))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pecsRB)
                    .addComponent(debrecenRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gyorRB)
                    .addComponent(szegedRB)))
        );

        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	
            	btnCancelActionPerformed(evt);
            	 
                              
            }
        });

        jLabel2.setText("Insert Money :");

        jLabel3.setText("Change :");

        changeTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnBuy)
                        .addGap(131, 131, 131)
                        .addComponent(btnClear)
                        .addGap(134, 134, 134)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(moneyTF)
                                    .addComponent(changeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(moneyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuy)
                    .addComponent(btnClear)
                    .addComponent(btnCancel))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //cancel selections
       // System.exit(0);
    	JFrame frame = new JFrame();

        int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to close the application?", "Please Confirm",JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
        	Action.send(new Stop(), machine);
            frame.dispose();
            System.exit(0);
            
            }
      }                                         

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Clears all Selections and Text fields
        gyorRB.setSelected(false);
        debrecenRB.setSelected(false);
        pecsRB.setSelected(false);
        szegedRB.setSelected(false);
        changeTF.setText(" ");
        moneyTF.setText(" ");
        Action.send(new Reselect(), machine);
        
    }                                        

    private void pecsRBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // Changing Radio Button
        if (pecsRB.isSelected()){
            gyorRB.setSelected(false);
            szegedRB.setSelected(false);
            debrecenRB.setSelected(false);
        }
    }                                      

    private void gyorRBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // Changing Radio Button
        if (gyorRB.isSelected()){
        debrecenRB.setSelected(false);
        pecsRB.setSelected(false);
        szegedRB.setSelected(false);}
    }                                      

    private void debrecenRBActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Changing Radio Button
        if (debrecenRB.isSelected()){
        gyorRB.setSelected(false);
        pecsRB.setSelected(false);
        szegedRB.setSelected(false);}
    }                                          

    private void szegedRBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Changing radio Button
        if (szegedRB.isSelected()){
        gyorRB.setSelected(false);
        debrecenRB.setSelected(false);
        pecsRB.setSelected(false);
        }
        
    }                                        

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // This will pay for purchase ticket
        double money = 0;
        money = Double.parseDouble(moneyTF.getText());
        if (pecsRB.isSelected()){
        money = money - 4500;}
        else if (debrecenRB.isSelected()){
            money = money - 5000;}
        else if (gyorRB.isSelected()){
        money = money - 3000;}
        else if (szegedRB.isSelected()){
        money = money - 4000;}
        
        if (money < 0){
        JOptionPane.showMessageDialog(rootPane, "Sorry you don't have Enough Balance");}
        else {
        changeTF.setText(Double.toString(money));
        
        }
        Action.send(new Buy(), machine);
      
       
        
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    	ModelExecutor.create().setTraceLogging(true).start(GUI::init);
		GUI G = new GUI();
		G.initComponents();
		G.setBackground(Color.WHITE);
    	G.setSize(new Dimension(750, 900));
		G.setTitle("Ticket Vending Machine by Dhiraj Kumar Tripathi");
		G.setVisible(true);
        /* Create and display the form */
        
    }

                  
}
