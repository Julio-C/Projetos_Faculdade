/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.view;

import javax.swing.JOptionPane;
import semeando_futuro.dao.AlunoDAO;
import semeando_futuro.dao.MaeDAO;
import semeando_futuro.dao.PaiDAO;
import semeando_futuro.modelo.Mae;
import semeando_futuro.modelo.Pai;

/**
 *
 * @author Thiago
 */
public class IFrm_CadPai extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrm_CadMae
     */
    public IFrm_CadPai() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        txt_Sobrenome = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_profissao = new javax.swing.JTextField();
        txt_empresa = new javax.swing.JTextField();
        txt_funcao = new javax.swing.JTextField();
        cb_Estado = new javax.swing.JComboBox();
        cb_estadocivil = new javax.swing.JComboBox();
        txt_cel = new javax.swing.JFormattedTextField();
        txt_tel = new javax.swing.JFormattedTextField();
        txt_cpf = new javax.swing.JFormattedTextField();
        txt_rg = new javax.swing.JFormattedTextField();
        txt_Cep = new javax.swing.JFormattedTextField();
        btn_cad = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txt_Nome1 = new javax.swing.JTextField();
        txt_Sobrenome1 = new javax.swing.JTextField();
        txt_endereco1 = new javax.swing.JTextField();
        txt_bairro1 = new javax.swing.JTextField();
        txt_cidade1 = new javax.swing.JTextField();
        txt_email1 = new javax.swing.JTextField();
        txt_profissao1 = new javax.swing.JTextField();
        txt_empresa1 = new javax.swing.JTextField();
        txt_funcao1 = new javax.swing.JTextField();
        cb_Estado1 = new javax.swing.JComboBox();
        cb_estadocivil1 = new javax.swing.JComboBox();
        txt_cel1 = new javax.swing.JFormattedTextField();
        txt_tel1 = new javax.swing.JFormattedTextField();
        txt_cpf1 = new javax.swing.JFormattedTextField();
        txt_rg1 = new javax.swing.JFormattedTextField();
        txt_Cep1 = new javax.swing.JFormattedTextField();
        btn_cad1 = new javax.swing.JButton();
        btn_novo1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro Pai");

        jPanel2.setForeground(new java.awt.Color(1, 108, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(1, 108, 78));
        jLabel19.setText("Nome:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(1, 108, 78));
        jLabel20.setText("Sobrenome:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(1, 108, 78));
        jLabel21.setText("Endereço:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 108, 78));
        jLabel23.setText("Bairro:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 108, 78));
        jLabel24.setText("Cidade:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(1, 108, 78));
        jLabel25.setText("Estado:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(1, 108, 78));
        jLabel26.setText("Cep:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(1, 108, 78));
        jLabel28.setText("Fone Residencial:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(1, 108, 78));
        jLabel29.setText("Celular:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(1, 108, 78));
        jLabel30.setText("Email:");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(1, 108, 78));
        jLabel31.setText("Profissão:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 108, 78));
        jLabel32.setText("Empresa em que trabalha:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(1, 108, 78));
        jLabel33.setText("Estado Civil:");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 108, 78));
        jLabel34.setText("Função:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(1, 108, 78));
        jLabel35.setText("RG:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(1, 108, 78));
        jLabel36.setText("CPF:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));
        jPanel2.add(txt_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));
        jPanel2.add(txt_Sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 290, -1));
        jPanel2.add(txt_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 330, -1));
        jPanel2.add(txt_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 150, -1));
        jPanel2.add(txt_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 210, -1));
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 200, -1));
        jPanel2.add(txt_profissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 190, -1));
        jPanel2.add(txt_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 170, -1));
        jPanel2.add(txt_funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 240, -1));

        cb_Estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC ", "AL ", "AP ", "AM ", "BA ", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG ", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS ", "RO ", "RR ", "SC ", "SP ", "SE ", "TO" }));
        jPanel2.add(cb_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, -1));

        cb_estadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro", "Casado", "Viúvo", "Divorciado" }));
        jPanel2.add(cb_estadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

        try {
            txt_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_cel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, -1));

        try {
            txt_tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, -1));

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 110, -1));

        try {
            txt_rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 110, -1));

        try {
            txt_Cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_Cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 150, -1));

        btn_cad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cad.setForeground(new java.awt.Color(0, 102, 102));
        btn_cad.setText("Cadastrar");
        btn_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadActionPerformed(evt);
            }
        });

        btn_novo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Cadastro Mãe");

        jPanel3.setForeground(new java.awt.Color(1, 108, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(1, 108, 78));
        jLabel22.setText("Nome:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(1, 108, 78));
        jLabel27.setText("Sobrenome:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel37.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(1, 108, 78));
        jLabel37.setText("Endereço:");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(1, 108, 78));
        jLabel38.setText("Bairro:");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(1, 108, 78));
        jLabel39.setText("Cidade:");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(1, 108, 78));
        jLabel40.setText("Estado:");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(1, 108, 78));
        jLabel41.setText("Cep:");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(1, 108, 78));
        jLabel42.setText("Fone Residencial:");
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(1, 108, 78));
        jLabel43.setText("Celular:");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(1, 108, 78));
        jLabel44.setText("Email:");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel45.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(1, 108, 78));
        jLabel45.setText("Profissão:");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel46.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(1, 108, 78));
        jLabel46.setText("Empresa em que trabalha:");
        jPanel3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel47.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(1, 108, 78));
        jLabel47.setText("Estado Civil:");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel48.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(1, 108, 78));
        jLabel48.setText("Função:");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel49.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(1, 108, 78));
        jLabel49.setText("RG:");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel50.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(1, 108, 78));
        jLabel50.setText("CPF:");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));
        jPanel3.add(txt_Nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));
        jPanel3.add(txt_Sobrenome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 290, -1));
        jPanel3.add(txt_endereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 330, -1));
        jPanel3.add(txt_bairro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 150, -1));
        jPanel3.add(txt_cidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 210, -1));
        jPanel3.add(txt_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 200, -1));
        jPanel3.add(txt_profissao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 190, -1));
        jPanel3.add(txt_empresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 170, -1));
        jPanel3.add(txt_funcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 240, -1));

        cb_Estado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC ", "AL ", "AP ", "AM ", "BA ", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG ", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS ", "RO ", "RR ", "SC ", "SP ", "SE ", "TO" }));
        jPanel3.add(cb_Estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, -1));

        cb_estadocivil1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteira", "Casada", "Viúva", "Divorciada" }));
        jPanel3.add(cb_estadocivil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

        try {
            txt_cel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txt_cel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, -1));

        try {
            txt_tel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txt_tel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, -1));

        try {
            txt_cpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txt_cpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 110, -1));

        try {
            txt_rg1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txt_rg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 110, -1));

        try {
            txt_Cep1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txt_Cep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 150, -1));

        btn_cad1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cad1.setForeground(new java.awt.Color(0, 102, 102));
        btn_cad1.setText("Cadastrar");
        btn_cad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad1ActionPerformed(evt);
            }
        });

        btn_novo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo1.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo1.setText("Novo");
        btn_novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_cad1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cad1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadActionPerformed
        Pai a = new Pai();

        if (txt_Nome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o nome corretamente");
        } else if (txt_Sobrenome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o sobrenome corretamente");
        }else if (txt_cidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite a Cidade corretamente");
        }else if (txt_bairro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o Bairro corretamente");
        }else if (txt_endereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o Endereço corretamente");
        }else if (txt_Cep.getText().equals("     -   ")) {
            JOptionPane.showMessageDialog(null, "Digite o sobrenome corretamente");
        }else if (txt_rg.getText().equals("  .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Digite o RG corretamente");
        }else if (txt_cpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Digite o CPF corretamente");
        } else {
            try {
                
                a.setNome(txt_Nome.getText());
                a.setSobrenome(txt_Sobrenome.getText());
                a.setEstado(cb_Estado.getSelectedItem().toString());
                a.setCidade(txt_cidade.getText());
                a.setBairro(txt_bairro.getText());
                a.setEndereco(txt_endereco.getText());
                a.setCEP(txt_Cep.getText());
                a.setTelefone(txt_tel.getText());
                a.setCelular(txt_cel.getText());
                a.setEmail(txt_email.getText());
                a.setEstado_Civil(cb_estadocivil.getSelectedItem().toString());
                a.setProfissao(txt_profissao.getText());
                a.setEmpresa_Trab(txt_empresa.getText());
                a.setFuncao_trab(txt_funcao.getText());
                a.setCPF(txt_cpf.getText());
                a.setRG(txt_rg.getText());

            } catch (Exception e) {

            }
            PaiDAO adao = new PaiDAO();
            adao.adciona(a);
            JOptionPane.showMessageDialog(null, "Pai Cadastrado com sucesso");
        }

    }//GEN-LAST:event_btn_cadActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        txt_Nome.setText(null);
        txt_Sobrenome.setText(null);
        txt_cidade.setText(null);
        txt_bairro.setText(null);
        txt_endereco.setText(null);
        txt_Cep.setText(null);
        txt_tel.setText(null);
        txt_cel.setText(null);
        txt_email.setText(null);
        txt_profissao.setText(null);
        txt_empresa.setText(null);
        txt_funcao.setText(null);
        txt_cpf.setText(null);
        txt_rg.setText(null);
        cb_Estado.setSelectedIndex(0);
        cb_estadocivil.setSelectedIndex(0);
        
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cad1ActionPerformed

    private void btn_novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_novo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cad;
    private javax.swing.JButton btn_cad1;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_novo1;
    private javax.swing.JComboBox cb_Estado;
    private javax.swing.JComboBox cb_Estado1;
    private javax.swing.JComboBox cb_estadocivil;
    private javax.swing.JComboBox cb_estadocivil1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JFormattedTextField txt_Cep;
    private javax.swing.JFormattedTextField txt_Cep1;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Nome1;
    private javax.swing.JTextField txt_Sobrenome;
    private javax.swing.JTextField txt_Sobrenome1;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_bairro1;
    private javax.swing.JFormattedTextField txt_cel;
    private javax.swing.JFormattedTextField txt_cel1;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_cidade1;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JFormattedTextField txt_cpf1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_email1;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_empresa1;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_endereco1;
    private javax.swing.JTextField txt_funcao;
    private javax.swing.JTextField txt_funcao1;
    private javax.swing.JTextField txt_profissao;
    private javax.swing.JTextField txt_profissao1;
    private javax.swing.JFormattedTextField txt_rg;
    private javax.swing.JFormattedTextField txt_rg1;
    private javax.swing.JFormattedTextField txt_tel;
    private javax.swing.JFormattedTextField txt_tel1;
    // End of variables declaration//GEN-END:variables
}