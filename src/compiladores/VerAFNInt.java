package compiladores;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JTextArea;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class VerAFNInt extends javax.swing.JFrame {

    static Object menu(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  
    //analizador anali = new analizador();
     String palabra = "Hola";
     Funciones fun = new Funciones();


    /*public VerAFNInt(analizador analis) {
        anali = analis;
        palabra = anali.publicar();
        initComponents();
    }*/

    public VerAFNInt() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonSalir1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        botonSalir2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imprimirAFN2 = new javax.swing.JTextArea();
        MenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        crearAFNB = new javax.swing.JMenuItem();
        subMenuModifAFN = new javax.swing.JMenu();
        cerrPos = new javax.swing.JMenuItem();
        cerrKleen = new javax.swing.JMenuItem();
        opcional = new javax.swing.JMenuItem();
        Unir = new javax.swing.JMenuItem();
        concatenar = new javax.swing.JMenuItem();
        creaAFNEsp = new javax.swing.JMenuItem();
        creaAFD = new javax.swing.JMenuItem();
        creaAFNconER = new javax.swing.JMenuItem();
        analizadorLexico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemAnalizSint = new javax.swing.JMenuItem();
        DescensoRec = new javax.swing.JMenu();
        calculadora = new javax.swing.JMenuItem();
        matrices = new javax.swing.JMenuItem();
        analizaConLL1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jPanel1.setBackground(new java.awt.Color(25, 79, 132));

        jLabel1.setBackground(new java.awt.Color(25, 79, 132));
        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por");

        jLabel2.setBackground(new java.awt.Color(25, 79, 132));
        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Campos Lechuga Gabriela      Dávalos Antonio Guillermo     Domínguez Colmenares Daniel");

        jLabel3.setBackground(new java.awt.Color(25, 79, 132));
        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compiladores 5CM1");

        botonSalir.setBackground(new java.awt.Color(204, 204, 255));
        botonSalir.setText("Salir");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(379, 379, 379))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 170, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)))
                .addComponent(botonSalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(44, 40, 91));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(25, 79, 132));

        jLabel4.setBackground(new java.awt.Color(25, 79, 132));
        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Por");

        jLabel7.setBackground(new java.awt.Color(25, 79, 132));
        jLabel7.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Campos Lechuga Gabriela      Dávalos Antonio Guillermo     Domínguez Colmenares Daniel");

        jLabel8.setBackground(new java.awt.Color(25, 79, 132));
        jLabel8.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Compiladores 5CM1");

        botonSalir1.setBackground(new java.awt.Color(204, 204, 255));
        botonSalir1.setText("Salir");
        botonSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(379, 379, 379))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 285, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)))
                .addComponent(botonSalir1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSalir1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(44, 40, 91));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>Bienvenidos al<p>"
            + " Analizador Léxico y Sintáctico<html>");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        jLabel11.setBackground(new java.awt.Color(25, 79, 132));
        jLabel11.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Compiladores 5CM1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(44, 40, 91));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(25, 79, 132));

        jLabel12.setBackground(new java.awt.Color(25, 79, 132));
        jLabel12.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Por");

        jLabel13.setBackground(new java.awt.Color(25, 79, 132));
        jLabel13.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Campos Lechuga Gabriela      Dávalos Antonio Guillermo     Domínguez Colmenares Daniel");

        jLabel14.setBackground(new java.awt.Color(25, 79, 132));
        jLabel14.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Compiladores 5CM1");

        botonSalir2.setBackground(new java.awt.Color(204, 204, 255));
        botonSalir2.setText("Salir");
        botonSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(379, 379, 379))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 265, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)))
                .addComponent(botonSalir2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSalir2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imprimirAFN2.setColumns(20);
        imprimirAFN2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        imprimirAFN2.setRows(5);
        imprimirAFN2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imprimirAFN2.setSelectionColor(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(imprimirAFN2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        MenuBar1.setBorderPainted(false);
        MenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuBar1.setFocusable(false);
        MenuBar1.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        MenuBar1.setOpaque(true);

        jMenu1.setBackground(new java.awt.Color(21, 25, 36));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Analizador Léxico");
        jMenu1.setBorderPainted(false);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        jMenu1.setOpaque(true);

        crearAFNB.setBackground(new java.awt.Color(31, 72, 92));
        crearAFNB.setForeground(new java.awt.Color(255, 255, 255));
        crearAFNB.setText("Crear AFN Básico");
        crearAFNB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearAFNB.setOpaque(true);
        crearAFNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAFNBActionPerformed(evt);
            }
        });
        jMenu1.add(crearAFNB);

        subMenuModifAFN.setBackground(new java.awt.Color(31, 72, 92));
        subMenuModifAFN.setForeground(new java.awt.Color(255, 255, 255));
        subMenuModifAFN.setText("Modificar un AFN");
        subMenuModifAFN.setOpaque(true);

        cerrPos.setBackground(new java.awt.Color(31, 72, 92));
        cerrPos.setForeground(new java.awt.Color(255, 255, 255));
        cerrPos.setText("Cerradura Positiva (+)");
        cerrPos.setOpaque(true);
        cerrPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrPosActionPerformed(evt);
            }
        });
        subMenuModifAFN.add(cerrPos);

        cerrKleen.setBackground(new java.awt.Color(31, 72, 92));
        cerrKleen.setForeground(new java.awt.Color(255, 255, 255));
        cerrKleen.setText("Cerradura Kleen (*)");
        cerrKleen.setOpaque(true);
        cerrKleen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrKleenActionPerformed(evt);
            }
        });
        subMenuModifAFN.add(cerrKleen);

        opcional.setBackground(new java.awt.Color(31, 72, 92));
        opcional.setForeground(new java.awt.Color(255, 255, 255));
        opcional.setText("Opcional (?)");
        opcional.setOpaque(true);
        opcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionalActionPerformed(evt);
            }
        });
        subMenuModifAFN.add(opcional);

        Unir.setBackground(new java.awt.Color(31, 72, 92));
        Unir.setForeground(new java.awt.Color(255, 255, 255));
        Unir.setText("Unir");
        Unir.setOpaque(true);
        Unir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnirActionPerformed(evt);
            }
        });
        subMenuModifAFN.add(Unir);

        concatenar.setBackground(new java.awt.Color(31, 72, 92));
        concatenar.setForeground(new java.awt.Color(255, 255, 255));
        concatenar.setText("Concatenar");
        concatenar.setOpaque(true);
        concatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concatenarActionPerformed(evt);
            }
        });
        subMenuModifAFN.add(concatenar);

        jMenu1.add(subMenuModifAFN);

        creaAFNEsp.setBackground(new java.awt.Color(31, 72, 92));
        creaAFNEsp.setForeground(new java.awt.Color(255, 255, 255));
        creaAFNEsp.setText("Crear AFN Especial");
        creaAFNEsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creaAFNEsp.setOpaque(true);
        creaAFNEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaAFNEspActionPerformed(evt);
            }
        });
        jMenu1.add(creaAFNEsp);

        creaAFD.setBackground(new java.awt.Color(31, 72, 92));
        creaAFD.setForeground(new java.awt.Color(255, 255, 255));
        creaAFD.setText("Crear AFD");
        creaAFD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creaAFD.setOpaque(true);
        creaAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaAFDActionPerformed(evt);
            }
        });
        jMenu1.add(creaAFD);

        creaAFNconER.setBackground(new java.awt.Color(31, 72, 92));
        creaAFNconER.setForeground(new java.awt.Color(255, 255, 255));
        creaAFNconER.setText("Crear AFN con ER");
        creaAFNconER.setOpaque(true);
        creaAFNconER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaAFNconERActionPerformed(evt);
            }
        });
        jMenu1.add(creaAFNconER);

        analizadorLexico.setBackground(new java.awt.Color(31, 72, 92));
        analizadorLexico.setForeground(new java.awt.Color(255, 255, 255));
        analizadorLexico.setText("Analizador Léxico");
        analizadorLexico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analizadorLexico.setOpaque(true);
        analizadorLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizadorLexicoActionPerformed(evt);
            }
        });
        jMenu1.add(analizadorLexico);

        MenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(21, 25, 36));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Analizador Sintáctico");
        jMenu2.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        jMenu2.setOpaque(true);

        itemAnalizSint.setBackground(new java.awt.Color(31, 72, 92));
        itemAnalizSint.setForeground(new java.awt.Color(255, 255, 255));
        itemAnalizSint.setText("Analizador Sintáctico");
        itemAnalizSint.setOpaque(true);
        itemAnalizSint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnalizSintActionPerformed(evt);
            }
        });
        jMenu2.add(itemAnalizSint);

        DescensoRec.setBackground(new java.awt.Color(31, 72, 92));
        DescensoRec.setForeground(new java.awt.Color(255, 255, 255));
        DescensoRec.setText("Descenso Recursivo");
        DescensoRec.setOpaque(true);

        calculadora.setBackground(new java.awt.Color(31, 72, 92));
        calculadora.setForeground(new java.awt.Color(255, 255, 255));
        calculadora.setText("Calculadora");
        calculadora.setOpaque(true);
        calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraActionPerformed(evt);
            }
        });
        DescensoRec.add(calculadora);

        jMenu2.add(DescensoRec);

        matrices.setBackground(new java.awt.Color(31, 72, 92));
        matrices.setForeground(new java.awt.Color(255, 255, 255));
        matrices.setText("Aritmética Matrices");
        matrices.setOpaque(true);
        matrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricesActionPerformed(evt);
            }
        });
        jMenu2.add(matrices);

        analizaConLL1.setBackground(new java.awt.Color(31, 72, 92));
        analizaConLL1.setForeground(new java.awt.Color(255, 255, 255));
        analizaConLL1.setText("Tabla LL1");
        analizaConLL1.setOpaque(true);
        analizaConLL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizaConLL1ActionPerformed(evt);
            }
        });
        jMenu2.add(analizaConLL1);

        MenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(21, 25, 36));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("     EMPIEZA A UTILIZAR EL ANALIZADOR LÉXICO Y SINTÁCTICO");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.setFont(new java.awt.Font("VCR OSD Mono", 1, 14)); // NOI18N
        jMenu3.setMaximumSize(new java.awt.Dimension(800, 32767));
        jMenu3.setOpaque(true);
        MenuBar1.add(jMenu3);

        setJMenuBar(MenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearAFNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAFNBActionPerformed

        fun.menu(1);

    }//GEN-LAST:event_crearAFNBActionPerformed

    private void creaAFNEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaAFNEspActionPerformed
        fun.menu(8);
    }//GEN-LAST:event_creaAFNEspActionPerformed

    private void creaAFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaAFDActionPerformed
        fun.menu(9);
    }//GEN-LAST:event_creaAFDActionPerformed

    private void analizadorLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizadorLexicoActionPerformed
        fun.menu(10);
        String ap = fun.publicar();
        imprimirAFN2.setText(ap);
    }//GEN-LAST:event_analizadorLexicoActionPerformed

    private void itemAnalizSintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnalizSintActionPerformed
        fun.menu(12);
        String ap = fun.publicar();
        System.out.println(ap);
        imprimirAFN2.setText("\n Gramatica :");
        imprimirAFN2.setText(ap);
    }//GEN-LAST:event_itemAnalizSintActionPerformed

    private void calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraActionPerformed
        // TODO add your handling code here:
     /*     anali.menu(2);
        String ap = anali.publicar();
     imprimirAFN2.setText(ap);*/
    }//GEN-LAST:event_calculadoraActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalir1ActionPerformed

      private void areaTexto2 (java.awt.event.ActionEvent evt) {                                         
     
    }  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var abrir = new VerAFNInt ();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalir2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalir2ActionPerformed

    private void creaAFNconERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaAFNconERActionPerformed
        fun.menu(7);
        /*String ap = anali.publicar();
        imprimirAFN2.setText(ap);*/
    }//GEN-LAST:event_creaAFNconERActionPerformed

    private void cerrPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrPosActionPerformed
        fun.menu(4);
   
    }//GEN-LAST:event_cerrPosActionPerformed

    private void cerrKleenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrKleenActionPerformed
        // TODO add your handling code here:
        fun.menu(5);
    }//GEN-LAST:event_cerrKleenActionPerformed

    private void opcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionalActionPerformed
        // TODO add your handling code here:
        fun.menu(6);
    }//GEN-LAST:event_opcionalActionPerformed

    private void UnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnirActionPerformed
        // TODO add your handling code here:
        fun.menu(2);
    }//GEN-LAST:event_UnirActionPerformed

    private void concatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatenarActionPerformed
        fun.menu(3);
    }//GEN-LAST:event_concatenarActionPerformed

    private void matricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricesActionPerformed
        fun.menu(11);
     /*
        String ap = anali.publicar();
     imprimirAFN2.setText(ap);*/
    }//GEN-LAST:event_matricesActionPerformed

    private void analizaConLL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizaConLL1ActionPerformed
        fun.menu(13);
    }//GEN-LAST:event_analizaConLL1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerAFNInt().setVisible(true);
            }
        });
    }

    void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu DescensoRec;
    private javax.swing.JMenuBar MenuBar1;
    private javax.swing.JMenuItem Unir;
    private javax.swing.JMenuItem analizaConLL1;
    private javax.swing.JMenuItem analizadorLexico;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSalir1;
    private javax.swing.JButton botonSalir2;
    private javax.swing.JMenuItem calculadora;
    private javax.swing.JMenuItem cerrKleen;
    private javax.swing.JMenuItem cerrPos;
    private javax.swing.JMenuItem concatenar;
    private javax.swing.JMenuItem creaAFD;
    private javax.swing.JMenuItem creaAFNEsp;
    private javax.swing.JMenuItem creaAFNconER;
    public static javax.swing.JMenuItem crearAFNB;
    private javax.swing.JTextArea imprimirAFN2;
    private javax.swing.JMenuItem itemAnalizSint;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem matrices;
    private javax.swing.JMenuItem opcional;
    private javax.swing.JMenu subMenuModifAFN;
    // End of variables declaration//GEN-END:variables

    private void append(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
