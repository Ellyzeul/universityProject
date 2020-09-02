/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject.IU;

import universityproject.controlador.Controller;

/**
 *
 * @author leand
 */
public class IUPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
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

        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MI_relatorios = new javax.swing.JMenu();
        MI_geral = new javax.swing.JMenuItem();
        MI_departamentos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Universidade");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Cadastros");

        jMenuItem3.setText("Departamento");
        jMenu1.add(jMenuItem3);

        jMenuItem14.setText("Funcionario");
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem5.setText("Departamento Específico");
        jMenu2.add(jMenuItem5);

        jMenuItem4.setText("Departamentos com Gasto em Faixa Específica");
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator1);

        jMenuItem10.setText("Funcionário pelo Código");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Funcionário pelo Nome");
        jMenu2.add(jMenuItem11);

        jMenuItem2.setText("Funcionários com Salário em Faixa Específica");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        MI_relatorios.setText("Relatorios");

        MI_geral.setText("Geral");
        MI_geral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_geralActionPerformed(evt);
            }
        });
        MI_relatorios.add(MI_geral);

        MI_departamentos.setText("Departamentos");
        MI_departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_departamentosActionPerformed(evt);
            }
        });
        MI_relatorios.add(MI_departamentos);

        jMenu5.setText("Funcionarios");

        jMenuItem6.setText("Geral");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Técnicos");
        jMenu5.add(jMenuItem7);

        jMenu6.setText("Docentes");

        jMenuItem13.setText("Geral");
        jMenu6.add(jMenuItem13);

        jMenuItem8.setText("Efetivos");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Substitutos");
        jMenu6.add(jMenuItem9);

        jMenu5.add(jMenu6);

        MI_relatorios.add(jMenu5);

        jMenuBar1.add(MI_relatorios);

        jMenu4.setText("                                                         ");
        jMenuBar1.add(jMenu4);

        jMenu7.setText("Sair");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MI_departamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_departamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_departamentosActionPerformed

    private void MI_geralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_geralActionPerformed
        IURelatorio relatorio = new IURelatorio(this, false);
        Controller control = new Controller();
        relatorio.exibir("Relatório dos Departamentos", "Departamentos", control.allData());
    }//GEN-LAST:event_MI_geralActionPerformed

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
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Controller control = new Controller();
        control.addDepartment("Matemática e Computação", "1", 30);
        control.addDepartment("Física", "2", 30);
        control.addDepartment("Química", "3", 10);
        control.addDepartment("Geografia", "4", 20);
        
        control.addTechnician("1", "1", "Renan", 1002.25, "T1", "Manutenção de computadores");
        control.addTechnician("1", "2", "Jorge", 1500.25, "T2", "Manutenção de rede");
        control.addEffectiveTeacher("1", "3", "Livia", 15000.30, "D1", "Doutor", "Visão Computacional");

        control.addTechnician("2", "1", "Marcos", 1500.25, "T2", "Manutenção dos laborátorios");
        control.addSubstituteTeacher("2", "2", "Felipe", 2000.5, "S1", "Mestre", 5);
        
        
        control.addTechnician("3", "1", "Carol", 1002.25, "T1", "Manutenção dos laborátorios");
        control.addSubstituteTeacher("3", "2", "Gabriel", 2500.5, "S2", "Mestre", 2);
        
        control.addEffectiveTeacher("4", "1", "Joana", 8000.40, "D2", "Doutor", "Ecologia");
        
        String relatorio = control.allData();
        System.out.println(relatorio);
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MI_departamentos;
    private javax.swing.JMenuItem MI_geral;
    private javax.swing.JMenu MI_relatorios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
