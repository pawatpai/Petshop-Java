package PetShop;
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class NewJFrame extends JFrame implements ActionListener {

    public NewJFrame() {
        initComponents();
    }

    public void initComponents() {

        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        txtSub = new JTextPane();
        jScrollPane2 = new JScrollPane();
        txtTax = new JTextPane();
        jScrollPane3 = new JScrollPane();
        txtTot = new JTextPane();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        btnEnt = new JButton();
        btnCle = new JButton();
        btnExi = new JButton();
        jPanel1 = new JPanel();
        chkBow = new JCheckBox();
        chkBru = new JCheckBox();
        chkBed = new JCheckBox();
        jPanel2 = new JPanel();
        radDog = new JRadioButton();
        radCat = new JRadioButton();
        radRab = new JRadioButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Arial", 1, 60)); 
        jLabel1.setText("Pet Shop");

        jScrollPane1.setViewportView(txtSub);

        jScrollPane2.setViewportView(txtTax);

        jScrollPane3.setViewportView(txtTot);

        jLabel2.setFont(new Font("Tahoma", 1, 18)); 
        jLabel2.setText("Subtotal");

        jLabel3.setFont(new Font("Tahoma", 1, 18)); 
        jLabel3.setText("Tax");

        jLabel4.setFont(new Font("Tahoma", 1, 18)); 
        jLabel4.setText("Total");

        btnEnt.setFont(new Font("Tahoma", 1, 18)); 
        btnEnt.setText("Enter");
        btnEnt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEntActionPerformed(evt);
            }
        });

        btnCle.setFont(new Font("Tahoma", 1, 18)); 
        btnCle.setText("Clear");
        btnCle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCleActionPerformed(evt);
            }
        });

        btnExi.setFont(new Font("Tahoma", 1, 18)); 
        btnExi.setText("Exit");
        btnExi.setMaximumSize(new Dimension(69, 29));
        btnExi.setMinimumSize(new Dimension(69, 29));
        btnExi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnExiActionPerformed(evt);
            }
        });

        jPanel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        chkBow.setFont(new Font("Tahoma", 1, 18)); 
        chkBow.setText("Water and Food Bowls $17.59");

        chkBru.setFont(new Font("Tahoma", 1, 18)); 
        chkBru.setText("Pet Grooming Brush $14.99");
       
        chkBed.setFont(new Font("Tahoma", 1, 18)); 
        chkBed.setText("Pet Bed $14.60");

        jPanel1.setLayout(new GridLayout(3,1));
        jPanel1.add(chkBow);
        jPanel1.add(chkBru);
        jPanel1.add(chkBed);

        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        radDog.setFont(new Font("Tahoma", 1, 18)); 
        radDog.setText("Beagle Dog $550");
        radDog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radCoffeeActionPerformed(evt);
            }
        });

        radCat.setFont(new Font("Tahoma", 1, 18)); 
        radCat.setText("Persian Cat $1200");
        radCat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radCapActionPerformed(evt);
            }
        });

        radRab.setFont(new Font("Tahoma", 1, 18)); 
        radRab.setText("Mini Lop Rabbit $150");
        radRab.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radTeaActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new GridLayout(3,1));
        jPanel2.add(radDog);
        jPanel2.add(radCat);
        jPanel2.add(radRab);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnt, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnCle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, GroupLayout.Alignment.TRAILING))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCle, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnt, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExi, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap()));
        

        pack();
    }

    private void radCoffeeActionPerformed(ActionEvent evt) {
        // selects dog option
        if (radDog.isSelected()) {
            radCat.setSelected(false);
        }
        radRab.setSelected(false);

    }

    private void radCapActionPerformed(ActionEvent evt) {
        // select cat option
        if (radCat.isSelected()) {
            radDog.setSelected(false);
        }
        radRab.setSelected(false);
    }

    private void radTeaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_radTeaActionPerformed
        // selects rabbit option
        if (radRab.isSelected()) {
            radCat.setSelected(false);
        }
        radDog.setSelected(false);
    }

    private void btnEntActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnEntActionPerformed
        // TODO add your handling code here:

        DecimalFormat df = new DecimalFormat("0.00");
        double total;
        double subtotal = 0;
        final double TAXRATE = Math.abs(0.07);
        double tax;

        if (radDog.isSelected()) {
            subtotal = subtotal + 550;
        } else if (radCat.isSelected()) {
            subtotal = subtotal + 1200;
        } else if (radRab.isSelected()) {
            subtotal = subtotal + 150;
        }

        if (chkBow.isSelected()) {
            subtotal = subtotal + 17.59;
        }
        if (chkBru.isSelected()) {
            subtotal = subtotal + 14.99;
        }
        if (chkBed.isSelected()) {
            subtotal = subtotal + 14.60;
        }

        txtSub.setText(Double.toString(subtotal));

        subtotal = Double.parseDouble(txtSub.getText());
        tax = subtotal * TAXRATE;
        total = tax + subtotal;

        txtTax.setText(Double.toString(tax));
        txtTot.setText(Double.toString(total));

        txtTax.setText(df.format(tax));
        txtSub.setText(df.format(subtotal));
        txtTot.setText(df.format(total));

    }
    

    private void btnExiActionPerformed(ActionEvent evt) {
        // exit JFrame
        JFrame jFrame = new JFrame();
		jFrame.dispose();
		TestThankyou goodbye = new TestThankyou();
		TestThankyou.main(null);
    }

    private void btnCleActionPerformed(ActionEvent evt) {
        // Clears all fields

        radDog.setSelected(false);
        radRab.setSelected(false);
        radCat.setSelected(false);
        chkBow.setSelected(false);
        chkBed.setSelected(false);
        chkBru.setSelected(false);
        txtTot.setText("");
        txtSub.setText("");
        txtTax.setText("");
    }

    private JButton btnCle;
    public JButton btnEnt;
    private JButton btnExi;
    public JCheckBox chkBow;
    public JCheckBox chkBru;
    public JCheckBox chkBed;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    public JRadioButton radCat;
    public JRadioButton radDog;
    public JRadioButton radRab;
    public JTextPane txtSub;
    public JTextPane txtTax;
    public JTextPane txtTot;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
}