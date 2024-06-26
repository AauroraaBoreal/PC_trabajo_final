/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tf_pc;

import Objetos.Grafo;
import Objetos.ProgramadorHorarios;

/**
 *
 * @author Dayana
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Grafo grafoPrincipal;
    public Principal() {
        initComponents();
        grafoPrincipal = new Grafo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        aulasPanel = new javax.swing.JPanel();
        datosAulasComboBox = new javax.swing.JComboBox<>();
        nombreAulaLabel = new javax.swing.JLabel();
        nombreAulaTextArea = new javax.swing.JTextField();
        eliminaraAulaButton = new javax.swing.JButton();
        registrarAulaButton = new javax.swing.JLabel();
        nombreRegistroAulaLabel = new javax.swing.JLabel();
        nombreRegistroAulaTextArea = new javax.swing.JTextField();
        capacidadRegistroAulaLabel = new javax.swing.JLabel();
        capacidadRegistroAulaTextArea = new javax.swing.JTextField();
        registroAulaButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        profesoresPanel = new javax.swing.JPanel();
        datosProfesoresComboBox = new javax.swing.JComboBox<>();
        nombreProfesorLabel = new javax.swing.JLabel();
        códigoProfesorLabel = new javax.swing.JLabel();
        editarProfesorButton = new javax.swing.JButton();
        eliminarProfesorButton = new javax.swing.JButton();
        asignarCursosLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregarCursoProfesorButton = new javax.swing.JButton();
        eliminiarCursoProfesorButton = new javax.swing.JButton();
        codCursoTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreRegistroProfesorTextArea = new javax.swing.JTextField();
        codigoRegistroProfesorTextArea = new javax.swing.JTextField();
        registrarProfesorButton = new javax.swing.JButton();
        nombreProfesorTextArea = new javax.swing.JTextField();
        codigoProfesorTextArea = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        codigoRegistroProfesorTextArea3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        codigoRegistroProfesorTextArea4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        codigoRegistroProfesorTextArea5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        codigoRegistroProfesorTextArea6 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        horariosPanel = new javax.swing.JPanel();
        GenerarHorarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aulasPanel.setPreferredSize(new java.awt.Dimension(314, 483));

        datosAulasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula1", "Aula2", "Aula3" }));

        nombreAulaLabel.setText("Nombre");

        eliminaraAulaButton.setText("Eliminar");

        registrarAulaButton.setText("Registrar Aula");

        nombreRegistroAulaLabel.setText("Nombre");

        capacidadRegistroAulaLabel.setText("Codigo");

        registroAulaButton.setText("Registrar");
        registroAulaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroAulaButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout aulasPanelLayout = new javax.swing.GroupLayout(aulasPanel);
        aulasPanel.setLayout(aulasPanelLayout);
        aulasPanelLayout.setHorizontalGroup(
            aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aulasPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(aulasPanelLayout.createSequentialGroup()
                        .addComponent(nombreAulaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nombreAulaTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addComponent(datosAulasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminaraAulaButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aulasPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aulasPanelLayout.createSequentialGroup()
                                .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreRegistroAulaLabel)
                                    .addComponent(capacidadRegistroAulaLabel))
                                .addGap(18, 18, 18)
                                .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreRegistroAulaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(capacidadRegistroAulaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(registrarAulaButton)))
                    .addGroup(aulasPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(registroAulaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        aulasPanelLayout.setVerticalGroup(
            aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aulasPanelLayout.createSequentialGroup()
                .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aulasPanelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(registrarAulaButton)
                        .addGap(18, 18, 18)
                        .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreRegistroAulaLabel)
                            .addComponent(nombreRegistroAulaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capacidadRegistroAulaLabel)
                            .addComponent(capacidadRegistroAulaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(registroAulaButton))
                    .addGroup(aulasPanelLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(datosAulasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(aulasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreAulaLabel)
                            .addComponent(nombreAulaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(eliminaraAulaButton))
                    .addGroup(aulasPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Aulas", aulasPanel);

        datosProfesoresComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof 1", "Prof 2", "Prof 3", "Prof 4" }));

        nombreProfesorLabel.setText("Nombre");

        códigoProfesorLabel.setText("Código");

        editarProfesorButton.setText("Editar");

        eliminarProfesorButton.setText("Eliminar");

        asignarCursosLabel.setText("Asignar cursos al profesor");

        jLabel4.setText("Codigo Aula");

        agregarCursoProfesorButton.setText("Agregar");

        eliminiarCursoProfesorButton.setText("Eliminar");

        jLabel5.setText("Registrar Profesor");

        jLabel7.setText("Nombre");

        jLabel8.setText("Código");

        registrarProfesorButton.setText("Registrar");
        registrarProfesorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProfesorButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Capacitado para dar los cursos");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane12.setViewportView(jTextArea2);

        jLabel9.setText("Turno");

        jLabel11.setText("Turno");

        jLabel12.setText("Hora inicio");

        jLabel13.setText("Bloques disponibles");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mañana", "tarde", "noche" }));

        jLabel14.setText("Hora inicio");

        jLabel15.setText("Bloques disponibles");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mañana", "tarde", "noche" }));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout profesoresPanelLayout = new javax.swing.GroupLayout(profesoresPanel);
        profesoresPanel.setLayout(profesoresPanelLayout);
        profesoresPanelLayout.setHorizontalGroup(
            profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profesoresPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profesoresPanelLayout.createSequentialGroup()
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profesoresPanelLayout.createSequentialGroup()
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(datosProfesoresComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesoresPanelLayout.createSequentialGroup()
                                        .addComponent(editarProfesorButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(eliminarProfesorButton))
                                    .addGroup(profesoresPanelLayout.createSequentialGroup()
                                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreProfesorLabel)
                                            .addComponent(códigoProfesorLabel)
                                            .addComponent(jLabel11))
                                        .addGap(18, 74, Short.MAX_VALUE)
                                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(codigoProfesorTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(nombreProfesorTextArea))))
                                .addGap(0, 34, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesoresPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(profesoresPanelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(agregarCursoProfesorButton)
                                        .addGap(26, 26, 26)
                                        .addComponent(eliminiarCursoProfesorButton))
                                    .addGroup(profesoresPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(codCursoTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(asignarCursosLabel))))
                        .addGap(18, 18, 18)
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(profesoresPanelLayout.createSequentialGroup()
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(profesoresPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoRegistroProfesorTextArea6))
                            .addGroup(profesoresPanelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoRegistroProfesorTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(profesoresPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(registrarProfesorButton)
                                        .addComponent(codigoRegistroProfesorTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesoresPanelLayout.createSequentialGroup()
                                    .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(codigoRegistroProfesorTextArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombreRegistroProfesorTextArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(profesoresPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(60, 60, 60)
                                .addComponent(codigoRegistroProfesorTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(73, 73, 73))
        );
        profesoresPanelLayout.setVerticalGroup(
            profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profesoresPanelLayout.createSequentialGroup()
                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profesoresPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesoresPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(nombreRegistroProfesorTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(codigoRegistroProfesorTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesoresPanelLayout.createSequentialGroup()
                                .addComponent(datosProfesoresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreProfesorLabel)
                                    .addComponent(nombreProfesorTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(códigoProfesorLabel)
                                    .addComponent(codigoProfesorTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)))
                        .addGap(18, 18, 18)
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profesoresPanelLayout.createSequentialGroup()
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(codigoRegistroProfesorTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(codigoRegistroProfesorTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(profesoresPanelLayout.createSequentialGroup()
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(codigoRegistroProfesorTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(codigoRegistroProfesorTextArea6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrarProfesorButton)
                            .addComponent(eliminarProfesorButton)
                            .addComponent(editarProfesorButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesoresPanelLayout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profesoresPanelLayout.createSequentialGroup()
                        .addComponent(asignarCursosLabel)
                        .addGap(18, 18, 18)
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(codCursoTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(profesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarCursoProfesorButton)
                            .addComponent(eliminiarCursoProfesorButton)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jTabbedPane2.addTab("Profesores", profesoresPanel);

        GenerarHorarios.setText("Generar Horario");
        GenerarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarHorariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout horariosPanelLayout = new javax.swing.GroupLayout(horariosPanel);
        horariosPanel.setLayout(horariosPanelLayout);
        horariosPanelLayout.setHorizontalGroup(
            horariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horariosPanelLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(GenerarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        horariosPanelLayout.setVerticalGroup(
            horariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horariosPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(GenerarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Horarios", horariosPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroAulaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroAulaButtonActionPerformed
        // TODO add your handling code here:
        int idAula = Integer.parseInt(capacidadRegistroAulaTextArea.getText());
        grafoPrincipal.agregarAula(idAula);
    }//GEN-LAST:event_registroAulaButtonActionPerformed

    private void GenerarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarHorariosActionPerformed
        // TODO add your handling code here:
        ProgramadorHorarios.colorearAristas(grafoPrincipal);
        ProgramadorHorarios.imprimirHorario(grafoPrincipal);
    }//GEN-LAST:event_GenerarHorariosActionPerformed

    private void registrarProfesorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProfesorButtonActionPerformed
        // TODO add your handling code here:
        int idProfesor = Integer.parseInt(codigoRegistroProfesorTextArea.getText());
        String turno = (String) jComboBox1.getSelectedItem();
        int horaInicio = Integer.parseInt(codigoRegistroProfesorTextArea3.getText()) ;
        int bloquesDisponibles = Integer.parseInt(codigoRegistroProfesorTextArea4.getText());

        grafoPrincipal.agregarProfesor(idProfesor, turno, horaInicio, bloquesDisponibles);
    }//GEN-LAST:event_registrarProfesorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarHorarios;
    private javax.swing.JButton agregarCursoProfesorButton;
    private javax.swing.JLabel asignarCursosLabel;
    private javax.swing.JPanel aulasPanel;
    private javax.swing.JLabel capacidadRegistroAulaLabel;
    private javax.swing.JTextField capacidadRegistroAulaTextArea;
    private javax.swing.JTextField codCursoTextArea;
    private javax.swing.JTextField codigoProfesorTextArea;
    private javax.swing.JTextField codigoRegistroProfesorTextArea;
    private javax.swing.JTextField codigoRegistroProfesorTextArea3;
    private javax.swing.JTextField codigoRegistroProfesorTextArea4;
    private javax.swing.JTextField codigoRegistroProfesorTextArea5;
    private javax.swing.JTextField codigoRegistroProfesorTextArea6;
    private javax.swing.JLabel códigoProfesorLabel;
    private javax.swing.JComboBox<String> datosAulasComboBox;
    private javax.swing.JComboBox<String> datosProfesoresComboBox;
    private javax.swing.JButton editarProfesorButton;
    private javax.swing.JButton eliminarProfesorButton;
    private javax.swing.JButton eliminaraAulaButton;
    private javax.swing.JButton eliminiarCursoProfesorButton;
    private javax.swing.JPanel horariosPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel nombreAulaLabel;
    private javax.swing.JTextField nombreAulaTextArea;
    private javax.swing.JLabel nombreProfesorLabel;
    private javax.swing.JTextField nombreProfesorTextArea;
    private javax.swing.JLabel nombreRegistroAulaLabel;
    private javax.swing.JTextField nombreRegistroAulaTextArea;
    private javax.swing.JTextField nombreRegistroProfesorTextArea;
    private javax.swing.JPanel profesoresPanel;
    private javax.swing.JLabel registrarAulaButton;
    private javax.swing.JButton registrarProfesorButton;
    private javax.swing.JButton registroAulaButton;
    // End of variables declaration//GEN-END:variables
}
