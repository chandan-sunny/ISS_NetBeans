
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class newuser extends javax.swing.JFrame {

    /**
     * Creates new form newuser
     */
    public newuser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NEW USER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(38, 67, 54, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("user id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(38, 107, 54, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(38, 155, 62, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(38, 199, 62, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("phone number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 240, 97, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(195, 64, 132, 25);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(195, 107, 132, 25);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(200, 200, 132, 27);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(200, 240, 130, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 300, 110, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset8.png"))); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 300, 110, 50);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(200, 150, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String aa=jTextField1.getText();
        String bb=jTextField2.getText();
        String c=jPasswordField1.getText();
        String d;
        d = jTextField4.getText();
         String f;
        f = jTextField5.getText();
        
       String pass=c,rstring="",as,en="",we;
        String option[]= {"$","1","2","3","4","5","6","7","8","9","0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","@","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","#","*","!","%","^","&","(",")","_","-","+","=","~","?","/","[","]","{","}","|","`",":",";",",",".","<"};
        System.out.println((int)option.length);
        int spv=0,a=0,b=0,l=0,qw;
        int spacearr[]={2,3,4};
        int sp;
        int randomNumber;
        int pkey=(((int)pass.length())*(spv+1))-spv;
        System.out.println(pkey);
        Random k=new Random();
        randomNumber=k.nextInt(option.length);
        sp=k.nextInt(spacearr.length);
        spv=spacearr[sp];
        System.out.println(spv);
        System.out.println(option[randomNumber]);
        

        for(int i=0;i<(int)pass.length()-1;i++)
        {
            as="";
            for(int j=0;j<spv;j++)
            {
                Random r=new Random();
                randomNumber=r.nextInt(option.length);
                as=as+option[randomNumber];
            }
            rstring=rstring+pass.charAt(i)+as;
        } 
        rstring=rstring+pass.charAt((int)pass.length()-1);
        System.out.println(rstring);
        String df;
        for(int q=0;q<=(int)rstring.length()-1;q++)
        {
            
            qw=-1;
           l=0;

           for(int o=0;;o++)
           {
               qw++;
               df=option[qw];
               if(rstring.charAt(q)==df.charAt(0))
               {
                   break;
               }
           }
           
            l=qw*pkey;

            if(l==1 || l==2 || l==3 || l==5 || l==7 || l==11 || l==15 || l==17 || l==19)
            {
                for(int i=1;i<=l;i++)
                {
                    for(int j=1;j<=l;j++)
                    { 
                        if(l==(i*j))
                        {
                            a=i;
                            b=j;
                            break;
                        }
                    }
                }
            }
            else
            {
                
                    for(int i=2;i<=l;i++)
                    {
                        for(int j=2;j<=l;j++)
                        {
                            if(l==(i*j))
                            {
                                if(i<90 && j<90)
                        {
                                a=i;
                                b=j;
                                break;
                        }
                            }
                        }
                    }
                
            }
            System.out.println(l+"="+a+"*"+b);
            en=en+option[a]+option[b];  
        }
        en=en+option[pkey]+option[10+spv];
        System.out.println(en);

        try
        { Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
            Statement s = con.createStatement();
            String s1 = "insert into newusers(name,user_id,password,gmail,phone_number) values ('"+aa+"','"+bb+"','"+en+"','"+d+"','"+f+"');";
             //String s2 = "insert into newuser1(user_id,password) values ('"+b+"','"+c+"');";
            System.out.println("sucess");
            s.executeUpdate(s1);
            new login().setVisible(true);
            this.dispose();
         //   s.executeUpdate(s2);
        }catch(Exception e){System.out.println(e);} // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     jTextField1.setText("");
     jTextField2.setText("");
     jPasswordField1.setText("");
     jTextField4.setText("");
     jTextField5.setText("");
        











// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
