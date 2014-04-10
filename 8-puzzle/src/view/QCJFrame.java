/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MainBO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.Timer;
import view.QCJFrame.MyActionListener;

/**
 *
 * @author leandro
 */
public class QCJFrame extends javax.swing.JFrame {

    public MainBO controller;
    public final int LEFT = 37;
    public final int UP = 38;
    public final int RIGHT = 39;
    public final int DOWN = 40;
    private Color alert = new Color(255, 140, 0);
    public String busca;
    private Timer timer = null;

    public QCJFrame() {
        controller = new MainBO(this);
        initComponents();
        this.setLocation(420, 150);
        this.setResizable(false);
        this.mensagem.setText("");
        this.step_btn.setEnabled(false);
        this.play_btn.setEnabled(false);
        this.resolver_btn.setEnabled(true);
        this.resolver_btn.setEnabled(false);
    }

    public JLabel getTecla(int tc) {
        JLabel botao = jLabel0;
        switch (tc) {
            case 0:
                botao = jLabel0;
                break;
            case 1:
                botao = jLabel1;
                break;
            case 2:
                botao = jLabel2;
                break;
            case 3:
                botao = jLabel3;
                break;

            case 4:
                botao = jLabel4;
                break;
            case 5:
                botao = jLabel5;
                break;
            case 6:
                botao = jLabel6;
                break;
            case 7:
                botao = jLabel7;
                break;
            case 8:
                botao = jLabel8;
                break;
        }
        return botao;
    }

    public JLabel getLabelTempo() {
        return tempo;
    }

    public JLabel getLabelNumPasso() {
        return numero_passos;
    }

    public JLabel getPassoLabel() {
        return passoJLabel;
    }

    public JLabel getLabelMensagem() {
        return mensagem;
    }

    public JList getLista() {
        return passos_ls;
    }

    public JButton getBotaoResolver() {
        return resolver_btn;
    }

    public JButton getBotaoStep() {
        return step_btn;
    }

    public JButton getBotaoPlay() {
        return play_btn;
    }

    private void msg_carregando() {
        mensagem.setForeground(alert);
        mensagem.setText("Carregando...");
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
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tabuleiro = new javax.swing.JPanel();
        jLabel0 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mensagem = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        resolver_btn = new javax.swing.JButton();
        limpar_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        passos_ls = new javax.swing.JList();
        step_btn = new javax.swing.JButton();
        play_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        numero_passos = new javax.swing.JLabel();
        tempo = new javax.swing.JLabel();
        passoJLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setPreferredSize(new java.awt.Dimension(600, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(169, 164, 164));
        jLabel13.setText("Leandro Bezerra Marinho - leandrobezerramarinho@gmail.com");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tabuleiro.setBackground(new java.awt.Color(0, 0, 0));
        tabuleiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        tabuleiro.setPreferredSize(new java.awt.Dimension(258, 258));

        jLabel0.setBackground(new java.awt.Color(0, 0, 0));
        jLabel0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(1, 1, 1));
        jLabel0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0.setBorder(null);
        jLabel0.setOpaque(true);
        jLabel0.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel3.setBackground(new java.awt.Color(72, 201, 66));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel1.setBackground(new java.awt.Color(72, 201, 66));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel2.setBackground(new java.awt.Color(72, 201, 66));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel4.setBackground(new java.awt.Color(72, 201, 66));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel5.setBackground(new java.awt.Color(72, 201, 66));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel6.setBackground(new java.awt.Color(72, 201, 66));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel7.setBackground(new java.awt.Color(72, 201, 66));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(74, 74));

        jLabel8.setBackground(new java.awt.Color(72, 201, 66));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(74, 74));

        javax.swing.GroupLayout tabuleiroLayout = new javax.swing.GroupLayout(tabuleiro);
        tabuleiro.setLayout(tabuleiroLayout);
        tabuleiroLayout.setHorizontalGroup(
            tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabuleiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabuleiroLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tabuleiroLayout.createSequentialGroup()
                            .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabuleiroLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tabuleiroLayout.setVerticalGroup(
            tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabuleiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(tabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mensagem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagem.setForeground(new java.awt.Color(0, 102, 0));
        mensagem.setText("Sucesso!");
        mensagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 135, 135)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Busca:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "A*", "Largura", "Profundidade", "Gulosa" }));
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        resolver_btn.setBackground(new java.awt.Color(0, 255, 51));
        resolver_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resolver_btn.setForeground(new java.awt.Color(255, 255, 255));
        resolver_btn.setText("Resolver");
        resolver_btn.setFocusable(false);
        resolver_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resolver_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resolver_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resolver_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resolver_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                resolver_btnMouseReleased(evt);
            }
        });
        resolver_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolver_btnActionPerformed(evt);
            }
        });

        limpar_btn.setBackground(new java.awt.Color(255, 204, 51));
        limpar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        limpar_btn.setForeground(new java.awt.Color(255, 255, 255));
        limpar_btn.setText("Resetar");
        limpar_btn.setFocusable(false);
        limpar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_btnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tempo (ms): ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Número de passos: ");

        passos_ls.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        passos_ls.setFocusable(false);
        jScrollPane1.setViewportView(passos_ls);

        step_btn.setBackground(new java.awt.Color(0, 255, 51));
        step_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        step_btn.setForeground(new java.awt.Color(255, 255, 255));
        step_btn.setText(">");
        step_btn.setFocusable(false);
        step_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step_btnActionPerformed(evt);
            }
        });

        play_btn.setBackground(new java.awt.Color(0, 255, 51));
        play_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        play_btn.setForeground(new java.awt.Color(255, 255, 255));
        play_btn.setText(">|");
        play_btn.setFocusable(false);
        play_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_btnActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        numero_passos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numero_passos.setForeground(new java.awt.Color(255, 255, 255));
        numero_passos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        tempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tempo.setForeground(new java.awt.Color(255, 255, 255));
        tempo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        passoJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passoJLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(resolver_btn)
                        .addGap(29, 29, 29)
                        .addComponent(limpar_btn)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(step_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(passoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(play_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numero_passos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resolver_btn)
                            .addComponent(limpar_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero_passos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(step_btn)
                            .addComponent(play_btn)
                            .addComponent(passoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(628, 108));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(52, 152, 30));
        jLabel16.setText("Prof.: Ajalmar");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(52, 152, 30));
        jLabel14.setText("Inteligência Artificial");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(52, 152, 30));
        jLabel18.setText("Quebra-cabeça de 8 peças");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        busca = this.jComboBox1.getModel().getSelectedItem().toString();
        if (!"-".equals(busca)) {
            this.resolver_btn.setEnabled(true);
        } else {
            this.controller.resetar();
            this.resolver_btn.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    class MyActionListener implements ActionListener {

        private int counter = 10;
        private QCJFrame view;

        public MyActionListener(QCJFrame view) {
            this.view = view;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = String.valueOf(counter);

            this.view.controller.acao();

        }
    }
    
    private void resolver_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolver_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_resolver_btnMouseClicked

    private void resolver_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolver_btnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_resolver_btnMouseEntered

    private void resolver_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolver_btnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_resolver_btnMouseExited

    private void resolver_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolver_btnMousePressed
        // TODO add your handling code here:
        msg_carregando();
    }//GEN-LAST:event_resolver_btnMousePressed

    private void resolver_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolver_btnMouseReleased
        // TODO add your handling code here:
        this.controller.resolve(busca);
        if (timer != null) {
            timer.stop();
        }
        this.step_btn.setEnabled(true);
        this.play_btn.setEnabled(true);
    }//GEN-LAST:event_resolver_btnMouseReleased

    private void resolver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolver_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resolver_btnActionPerformed

    private void limpar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_btnActionPerformed
        this.controller.resetar();
        if (timer != null) {
            timer.stop();
        }
    }//GEN-LAST:event_limpar_btnActionPerformed

    private void step_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step_btnActionPerformed
        // TODO add your handling code here:
        this.controller.acao();
    }//GEN-LAST:event_step_btnActionPerformed

    private void play_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_btnActionPerformed
        // TODO add your handling code here:

        timer = new Timer(1000, new MyActionListener(this));

        timer.setInitialDelay(0);
        timer.start();
    }//GEN-LAST:event_play_btnActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int tecla = evt.getKeyCode();

        if (tecla == DOWN || tecla == UP || tecla == RIGHT || tecla == LEFT) {
            this.controller.alteraEstado(tecla);

            this.controller.limpar();
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(QCJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QCJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QCJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QCJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QCJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpar_btn;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel numero_passos;
    private javax.swing.JLabel passoJLabel;
    private javax.swing.JList passos_ls;
    private javax.swing.JButton play_btn;
    private javax.swing.JButton resolver_btn;
    private javax.swing.JButton step_btn;
    private javax.swing.JPanel tabuleiro;
    private javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables
}
