/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramir
 */
public class envio extends javax.swing.JFrame {

    /**
     * Creates new form envio
     */
    public envio() {
        initComponents();
        //Se inicializan los componentes
        this.setLocationRelativeTo(null);
        //centraliza la ventana
        this.setTitle("SISTEMA DE ENVIOS");
        //titulo de la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        destino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        envia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        origen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        transp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emple = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sumini = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Envio de Paquetes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de paquete: ");

        tipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Peso (Kg): ");

        peso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción: ");

        descripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Destino: ");

        destino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Envia: ");

        envia.setEditable(false);
        envia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Origen: ");

        origen.setEditable(false);
        origen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Transporte: ");

        transp.setEditable(false);
        transp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Empleados: ");

        emple.setEditable(false);
        emple.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Suministros: ");

        sumini.setEditable(false);
        sumini.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        enviar.setBackground(new java.awt.Color(51, 102, 255));
        enviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enviar.setText("ENVIAR");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(enviar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(destino, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(envia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(origen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(transp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emple, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sumini, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tipo)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(envia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(sumini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(enviar)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Se definen las variables que se usaran para registrar los envios
    String tip = "", pes = "", descrip = "", dest = "", env = "", org = "";
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        tip = tipo.getText();
        //trae el valor que se ingreso en el formularo que corresponde al tipo de paquete a enviar
        pes = peso.getText();
        //trae el valor que se ingreso en el formularo que corresponde al peso del paquete a enviar
        descrip = descripcion.getText();
        //trae el valor que se ingreso en el formularo que corresponde a la descripción del paquete a enviar
        dest = destino.getText();
        //trae el valor que se ingreso en el formularo que corresponde a destino del paquete a enviar
        env = envia.getText();
        //trae el valor que se ingreso en el formularo que corresponde al nombre del usuario que envia el paquete
        org = origen.getText();
        //trae el valor que se ingreso en el formularo que corresponde a la ciudad de origen del usuario que va a enviar el paquete
        
        //con estos datos comparamos la ciudad de origen y se ejecuta el método correspondiente a cada una
        if(org.equals("bogota")){
            Bogota bog = new Bogota(tip, pes, descrip, dest, env, org);
            //se crea un objeto a la clase correspondiente a la cual se le envian los datos que requiere el constructor de la misma          
            bog.enviarPaquete("Camión", "2", "50000");
            //a travez del objeto creado se ejecuta el método enviarPaquete() que está en dicha clase
        }else if(org.equals("medellin")){
            Medellin medellin1 = new Medellin(tip, pes, descrip, dest, env, org);
            //se crea un objeto a la clase correspondiente a la cual se le envian los datos que requiere el constructor de la misma
            medellin1.enviarPaquete("Camioneta", "2", "30000");
            //a travez del objeto creado se ejecuta el método enviarPaquete() que heredó de la clase Bogota
        }else if(org.equals("barranquilla")){
            Barranquilla barranquilla1 = new Barranquilla(tip, pes, descrip, dest, env, org);
            //se crea un objeto a la clase correspondiente a la cual se le envian los datos que requiere el constructor de la misma
            barranquilla1.enviarPaquete("Camioneta", "2", "30000");
            //a travez del objeto creado se ejecuta el método enviarPaquete() que heredó de la clase Bogota
        }else if(org.equals("envigado")){
            Envigado envigado1 = new Envigado(tip, pes, descrip, dest, env, org);
            //se crea un objeto a la clase correspondiente a la cual se le envian los datos que requiere el constructor de la misma
            envigado1.enviarPaquete("Moto", "1", "10000");
            //a travez del objeto creado se ejecuta el método enviarPaquete() que heredó de la clase Medellin
        }else if(org.equals("apartado")){
            Apartado apartado1 = new Apartado(tip, pes, descrip, dest, env, org);
            //se crea un objeto a la clase correspondiente a la cual se le envian los datos que requiere el constructor de la misma
            apartado1.enviarPaquete("Moto", "1", "10000");
            //a travez del objeto creado se ejecuta el método enviarPaquete() que heredó de la clase Medellin
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

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
            java.util.logging.Logger.getLogger(envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new envio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField destino;
    public javax.swing.JTextField emple;
    public javax.swing.JTextField envia;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField origen;
    private javax.swing.JTextField peso;
    public javax.swing.JTextField sumini;
    private javax.swing.JTextField tipo;
    public javax.swing.JTextField transp;
    // End of variables declaration//GEN-END:variables
}