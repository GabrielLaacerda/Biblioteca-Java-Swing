
package biblioteca;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Biblioteca extends javax.swing.JFrame {

    public Biblioteca() {
        initComponents();
    }
    //Arrays de cada classe
    
    public static ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Emprestimo> empre = new ArrayList<>();
    public static ArrayList<Usuario> us = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BuscarUsuario = new javax.swing.JButton();
        BuscarLivro = new javax.swing.JButton();
        BuscarEmprestimo = new javax.swing.JButton();
        CadastrarUsuario = new javax.swing.JButton();
        CadastrarLivro = new javax.swing.JButton();
        CadastrarEmprestimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        MenuCadastroUsuario = new javax.swing.JMenuItem();
        MenuConsultaUsuario = new javax.swing.JMenuItem();
        MenuExclusaoUsuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuLivros = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuCadastroLivros = new javax.swing.JMenuItem();
        MenuConsultaLivros = new javax.swing.JMenuItem();
        MenuExclusaoLivros = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuEmprestimos = new javax.swing.JMenu();
        MenuCadastroEmprestimo = new javax.swing.JMenuItem();
        MenuConsultaEmprestimo = new javax.swing.JMenuItem();
        MenuExclusaoEmprestimo = new javax.swing.JMenuItem();
        RelatorioGeral = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BuscarUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/Konfest-PNG-JPG-Image-Pic-Photo-Free-Download-Royalty-Unlimited-clip-art-sticker-icons-search-symbol-find-magnifying-glass-41 (1).png"))); // NOI18N
        BuscarUsuario.setText("Buscar Usuario ");
        BuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarUsuarioActionPerformed(evt);
            }
        });

        BuscarLivro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BuscarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/Konfest-PNG-JPG-Image-Pic-Photo-Free-Download-Royalty-Unlimited-clip-art-sticker-icons-search-symbol-find-magnifying-glass-41 (1).png"))); // NOI18N
        BuscarLivro.setText("Buscar Livro");
        BuscarLivro.setMaximumSize(new java.awt.Dimension(129, 27));
        BuscarLivro.setMinimumSize(new java.awt.Dimension(129, 27));
        BuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarLivroActionPerformed(evt);
            }
        });

        BuscarEmprestimo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BuscarEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/Konfest-PNG-JPG-Image-Pic-Photo-Free-Download-Royalty-Unlimited-clip-art-sticker-icons-search-symbol-find-magnifying-glass-41 (1).png"))); // NOI18N
        BuscarEmprestimo.setText("Buscar Empréstimo");
        BuscarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEmprestimoActionPerformed(evt);
            }
        });

        CadastrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CadastrarUsuario.setText("Cadastrar");
        CadastrarUsuario.setMaximumSize(new java.awt.Dimension(129, 127));
        CadastrarUsuario.setMinimumSize(new java.awt.Dimension(129, 127));
        CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarUsuarioActionPerformed(evt);
            }
        });

        CadastrarLivro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CadastrarLivro.setText("Cadastrar");
        CadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarLivroActionPerformed(evt);
            }
        });

        CadastrarEmprestimo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CadastrarEmprestimo.setText("Cadastrar");
        CadastrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarEmprestimoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/note-512 (1).png"))); // NOI18N
        jLabel2.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/41-512 (1).png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/127-1278907_marketing-clipart-city-manager-manager-flat-icon-png (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Usuários");

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Livros");

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Empréstimos");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gerenciamento de dados Biblioteca ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(CadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel5.setBackground(new java.awt.Color(0, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/library (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/Folder-Archive-icon (1).png"))); // NOI18N
        Menu.setText("Arquivo");

        MenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        Menu.add(MenuSair);

        MenuPrincipal.add(Menu);

        MenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/user-08-512 (3).png"))); // NOI18N
        MenuUsuario.setText("Opçoes usuário");
        MenuUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MenuUsuarioMouseMoved(evt);
            }
        });

        MenuCadastroUsuario.setBackground(new java.awt.Color(255, 255, 255));
        MenuCadastroUsuario.setText("Cadastro");
        MenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuCadastroUsuario);

        MenuConsultaUsuario.setText("Consulta");
        MenuConsultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuConsultaUsuario);

        MenuExclusaoUsuario.setText("Exclusão");
        MenuExclusaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExclusaoUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuExclusaoUsuario);

        jMenuItem1.setText("Alteração");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuUsuario.add(jMenuItem1);

        MenuPrincipal.add(MenuUsuario);

        MenuLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/d6f3a5e664513affed0021b66a69b986 (1).jpg"))); // NOI18N
        MenuLivros.setText("Opçoes Livros");
        MenuLivros.add(jSeparator1);

        MenuCadastroLivros.setText("Cadastro");
        MenuCadastroLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroLivrosActionPerformed(evt);
            }
        });
        MenuLivros.add(MenuCadastroLivros);

        MenuConsultaLivros.setText("Consulta");
        MenuConsultaLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaLivrosActionPerformed(evt);
            }
        });
        MenuLivros.add(MenuConsultaLivros);

        MenuExclusaoLivros.setText("Exclusão");
        MenuExclusaoLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExclusaoLivrosActionPerformed(evt);
            }
        });
        MenuLivros.add(MenuExclusaoLivros);

        jMenuItem2.setText("Alteração");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuLivros.add(jMenuItem2);

        MenuPrincipal.add(MenuLivros);

        MenuEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/Business_Professional-16-512 (3).png"))); // NOI18N
        MenuEmprestimos.setText("Opções Empréstimos");

        MenuCadastroEmprestimo.setText("Cadastro");
        MenuCadastroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroEmprestimoActionPerformed(evt);
            }
        });
        MenuEmprestimos.add(MenuCadastroEmprestimo);

        MenuConsultaEmprestimo.setText("Consulta");
        MenuConsultaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaEmprestimoActionPerformed(evt);
            }
        });
        MenuEmprestimos.add(MenuConsultaEmprestimo);

        MenuExclusaoEmprestimo.setText("Exclusão");
        MenuExclusaoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExclusaoEmprestimoActionPerformed(evt);
            }
        });
        MenuEmprestimos.add(MenuExclusaoEmprestimo);

        MenuPrincipal.add(MenuEmprestimos);

        RelatorioGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgens/43-512 (1) (2).png"))); // NOI18N
        RelatorioGeral.setText("Relatório Geral");
        RelatorioGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelatorioGeralMouseClicked(evt);
            }
        });
        RelatorioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioGeralActionPerformed(evt);
            }
        });
        MenuPrincipal.add(RelatorioGeral);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroUsuarioActionPerformed
        Cadastro c1 = new Cadastro(us);
        c1.setVisible(true);

    }//GEN-LAST:event_MenuCadastroUsuarioActionPerformed

    private void MenuConsultaLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaLivrosActionPerformed
        ConsultarLivros consultar = new ConsultarLivros(livros);
        consultar.setVisible(true);
    }//GEN-LAST:event_MenuConsultaLivrosActionPerformed

    private void MenuConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaUsuarioActionPerformed
        Consultar c1 = new Consultar(us);
        c1.setVisible(true);
    }//GEN-LAST:event_MenuConsultaUsuarioActionPerformed

    private void MenuExclusaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExclusaoUsuarioActionPerformed
        Exclusao ex = new Exclusao(us, empre);
        ex.setVisible(true);
    }//GEN-LAST:event_MenuExclusaoUsuarioActionPerformed

    private void MenuCadastroLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroLivrosActionPerformed
        CadastroLivros cad = new CadastroLivros(livros);
        cad.setVisible(true);
    }//GEN-LAST:event_MenuCadastroLivrosActionPerformed

    private void MenuExclusaoLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExclusaoLivrosActionPerformed
        ExclusaoLivro ex = new ExclusaoLivro(livros, empre);
        ex.setVisible(true);
    }//GEN-LAST:event_MenuExclusaoLivrosActionPerformed

    private void BuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLivroActionPerformed
        ConsultarLivros consultar = new ConsultarLivros(livros);
        consultar.setVisible(true);
    }//GEN-LAST:event_BuscarLivroActionPerformed

    private void CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarUsuarioActionPerformed
        Cadastro c1 = new Cadastro(us);
        c1.setVisible(true);
    }//GEN-LAST:event_CadastrarUsuarioActionPerformed

    private void BuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarUsuarioActionPerformed
        Consultar c1 = new Consultar(us);
        c1.setVisible(true);
           
     
    }//GEN-LAST:event_BuscarUsuarioActionPerformed

    private void CadastrarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarEmprestimoActionPerformed
        CadastroEmprestimo cad = new CadastroEmprestimo(empre);
        cad.setVisible(true);
    }//GEN-LAST:event_CadastrarEmprestimoActionPerformed

    private void MenuCadastroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroEmprestimoActionPerformed
        CadastroEmprestimo cad = new CadastroEmprestimo(empre);
        cad.setVisible(true);
    }//GEN-LAST:event_MenuCadastroEmprestimoActionPerformed

    private void MenuConsultaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaEmprestimoActionPerformed
        ConsultaEmprestimo cons = new ConsultaEmprestimo(empre);
        cons.setVisible(true);

    }//GEN-LAST:event_MenuConsultaEmprestimoActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuSairActionPerformed

    private void BuscarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEmprestimoActionPerformed
        ConsultaEmprestimo ce = new ConsultaEmprestimo(empre);
        ce.setVisible(true);
    }//GEN-LAST:event_BuscarEmprestimoActionPerformed

    private void MenuExclusaoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExclusaoEmprestimoActionPerformed
        ExclusaoEmprestimo ex = new ExclusaoEmprestimo(empre);
        ex.setVisible(true);

    }//GEN-LAST:event_MenuExclusaoEmprestimoActionPerformed

    private void CadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarLivroActionPerformed
        CadastroLivros cad = new CadastroLivros(livros);
        cad.setVisible(true);
    }//GEN-LAST:event_CadastrarLivroActionPerformed

    private void RelatorioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioGeralActionPerformed

    }//GEN-LAST:event_RelatorioGeralActionPerformed

    private void RelatorioGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelatorioGeralMouseClicked
        RelatorioGeral r1 = new RelatorioGeral(livros, empre, us);
        r1.setVisible(true);
    }//GEN-LAST:event_RelatorioGeralMouseClicked

    private void MenuUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUsuarioMouseMoved

    }//GEN-LAST:event_MenuUsuarioMouseMoved

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      AlteraçaoUsuario alt = new AlteraçaoUsuario(us);
      alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       AlteraçaoLivro alt = new AlteraçaoLivro(livros);
       alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarEmprestimo;
    private javax.swing.JButton BuscarLivro;
    private javax.swing.JButton BuscarUsuario;
    private javax.swing.JButton CadastrarEmprestimo;
    private javax.swing.JButton CadastrarLivro;
    private javax.swing.JButton CadastrarUsuario;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem MenuCadastroEmprestimo;
    private javax.swing.JMenuItem MenuCadastroLivros;
    private javax.swing.JMenuItem MenuCadastroUsuario;
    private javax.swing.JMenuItem MenuConsultaEmprestimo;
    private javax.swing.JMenuItem MenuConsultaLivros;
    private javax.swing.JMenuItem MenuConsultaUsuario;
    private javax.swing.JMenu MenuEmprestimos;
    private javax.swing.JMenuItem MenuExclusaoEmprestimo;
    private javax.swing.JMenuItem MenuExclusaoLivros;
    private javax.swing.JMenuItem MenuExclusaoUsuario;
    private javax.swing.JMenu MenuLivros;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenu RelatorioGeral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
