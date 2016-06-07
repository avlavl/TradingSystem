/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author zhangxr
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form StockerView
     */
    public MainView() {
        initComponents();

        setLocationRelativeTo(null);
        final URL filename = this.getClass().getResource("resources/Livermore1.jpg");
        if (filename != null) {
            setIconImage(new ImageIcon(filename, "Icon").getImage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLabelStockName = new javax.swing.JLabel();
        jLabelStockCode = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePoint = new javax.swing.JTable();
        jPanelPrice = new javax.swing.JPanel();
        jLabelOpen = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelHigh = new javax.swing.JLabel();
        jLabelLow = new javax.swing.JLabel();
        jLabelMA1 = new javax.swing.JLabel();
        jLabelMA2 = new javax.swing.JLabel();
        jLabelMA3 = new javax.swing.JLabel();
        jLabelMA4 = new javax.swing.JLabel();
        jButtonImport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMain = new javax.swing.JTextArea();
        jPanelConfig = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTpoint1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTpoint2 = new javax.swing.JTextField();
        jCheckBoxVpoint = new javax.swing.JCheckBox();
        jTextFieldVpoint = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxMode = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldStartDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEndDate = new javax.swing.JTextField();
        jButtonTest = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemImport = new javax.swing.JMenuItem();
        jMenuAdd = new javax.swing.JMenu();
        jMenuTestSystem = new javax.swing.JMenu();
        jMenuItemMACD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("证券交易系统");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStockName.setFont(new java.awt.Font("华文行楷", 0, 18)); // NOI18N
        jLabelStockName.setForeground(new java.awt.Color(0, 0, 255));
        jLabelStockName.setText("上证指数");
        jLabelStockName.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanelMain.add(jLabelStockName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelStockCode.setFont(new java.awt.Font("黑体", 0, 16)); // NOI18N
        jLabelStockCode.setForeground(new java.awt.Color(0, 0, 255));
        jLabelStockCode.setText("(000001)");
        jPanelMain.add(jLabelStockCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabelStatus.setFont(new java.awt.Font("隶书", 1, 30)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStatus.setText("主上升!");
        jPanelMain.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabelDate.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabelDate.setText("日期：----/--/--");
        jPanelMain.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jTablePoint.getTableHeader().setFont(new java.awt.Font("微软雅黑", 0, 12));
        jTablePoint.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTablePoint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"净利润", null, "测试周期", ""},
                {"总盈利", null, "收益率", null},
                {"总亏损", null, "年化收益", ""},
                {"盈利次数", null, "最大盈利", null},
                {"亏损次数", null, "最大亏损", null},
                {"胜率(P)", null, "持仓时间比", ""},
                {"平均盈利", "", "平均持仓期", null},
                {"平均亏损", null, "平均盈利期", null},
                {"赔率(R)", "", "平均亏损期", null},
                {"数学期望", null, null, null}
            },
            new String [] {
                "统计指标", "全部交易", "统计指标", "全部交易"
            }
        ));
        jScrollPane1.setViewportView(jTablePoint);
        if (jTablePoint.getColumnModel().getColumnCount() > 0) {
            jTablePoint.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTablePoint.getColumnModel().getColumn(0).setMaxWidth(70);
            jTablePoint.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTablePoint.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jPanelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 330, 190));

        jPanelPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "行情", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 12))); // NOI18N
        jPanelPrice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOpen.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelOpen.setText("开盘：");
        jPanelPrice.add(jLabelOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelClose.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelClose.setText("收盘：");
        jPanelPrice.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabelHigh.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelHigh.setText("最高：");
        jPanelPrice.add(jLabelHigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabelLow.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelLow.setText("最低：");
        jPanelPrice.add(jLabelLow, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabelMA1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelMA1.setText("MA5：");
        jPanelPrice.add(jLabelMA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelMA2.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelMA2.setText("MA10：");
        jPanelPrice.add(jLabelMA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabelMA3.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelMA3.setText("MA20：");
        jPanelPrice.add(jLabelMA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelMA4.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelMA4.setText("MA60：");
        jPanelPrice.add(jLabelMA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jPanelMain.add(jPanelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 300, 110));

        jButtonImport.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jButtonImport.setText("导入");
        jButtonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTextAreaMain.setColumns(20);
        jTextAreaMain.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMain);

        jPanelMain.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 650, 80));

        jPanelConfig.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "配置", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 12))); // NOI18N
        jPanelConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel1.setText("起始状态：");
        jPanelConfig.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jComboBoxStatus.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "主上升", "主下降" }));
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });
        jPanelConfig.add(jComboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel2.setText("弹抽点：");
        jPanelConfig.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextFieldTpoint1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldTpoint1.setText("10");
        jPanelConfig.add(jTextFieldTpoint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 30, -1));

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel3.setText("反转点：");
        jPanelConfig.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jTextFieldTpoint2.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldTpoint2.setText("5");
        jPanelConfig.add(jTextFieldTpoint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 30, -1));

        jCheckBoxVpoint.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jCheckBoxVpoint.setText("使能V形反转");
        jPanelConfig.add(jCheckBoxVpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextFieldVpoint.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldVpoint.setText("20");
        jPanelConfig.add(jTextFieldVpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 30, -1));

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel9.setText("模式：");
        jPanelConfig.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboBoxMode.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jComboBoxMode.setMaximumRowCount(9);
        jComboBoxMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "收盘价", "2日均线", "3日均线", "5日均线", "K线实体", "K线引线" }));
        jPanelConfig.add(jComboBoxMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel7.setText("起始日期：");
        jPanelConfig.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextFieldStartDate.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldStartDate.setText("1990/05/14");
        jPanelConfig.add(jTextFieldStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 80, -1));

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel8.setText("结束日期：");
        jPanelConfig.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jTextFieldEndDate.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldEndDate.setText("2016/05/31");
        jPanelConfig.add(jTextFieldEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 80, -1));

        jButtonTest.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jButtonTest.setText("测试");
        jButtonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestActionPerformed(evt);
            }
        });
        jPanelConfig.add(jButtonTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jPanelMain.add(jPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 320, 170));

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        jMenuFile.setText("文件");

        jMenuItemImport.setText("导入...");
        jMenuItemImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImportActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemImport);

        jMenuBar.add(jMenuFile);

        jMenuAdd.setText("添加");
        jMenuBar.add(jMenuAdd);

        jMenuTestSystem.setText("测试系统");

        jMenuItemMACD.setText("MACD");
        jMenuItemMACD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMACDActionPerformed(evt);
            }
        });
        jMenuTestSystem.add(jMenuItemMACD);

        jMenuBar.add(jMenuTestSystem);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImportActionPerformed
        dataImport();
    }//GEN-LAST:event_jMenuItemImportActionPerformed

    private void jButtonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportActionPerformed
        dataImport();
    }//GEN-LAST:event_jButtonImportActionPerformed

    private void jButtonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestActionPerformed
        String line;
        String[] words = null;

        if ((jTextFieldEndDate.getText().compareTo(jTextFieldStartDate.getText()) < 0)) {
            JOptionPane.showMessageDialog(this, "起始日期必须早于结束日期！");
            return;
        }

        boolean status = (jComboBoxStatus.getSelectedIndex() == 0);
        int t1 = Integer.parseInt(jTextFieldTpoint1.getText());
        int t2 = Integer.parseInt(jTextFieldTpoint2.getText());
        Livermore lm = new Livermore(status, t1, t2);
        lm.vpointEnable = jCheckBoxVpoint.isSelected();
        lm.vpointValue = Integer.parseInt(jTextFieldVpoint.getText());
        BRM brm = new BRM(0);

        try {
            fileWriter = new FileWriter(fileOut);
            fileReader = new FileReader(fileIn);
            bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            bufferedReader.readLine();

            do {
                if ((line = bufferedReader.readLine()) != null) {
                    words = line.split("\t");
                    if ((words[0].compareTo(jTextFieldStartDate.getText()) >= 0) && (words[0].compareTo(jTextFieldEndDate.getText()) <= 0)) {
                        updateMarket(line);
                        doModeComputing(lm);
                        doLivermoreAnalysis(lm, brm);
                    }
                }
            } while (((line != null) && words[0].compareTo(jTextFieldEndDate.getText()) < 0));

            parseStatus(lm.Status);
            //updateTable(brm);

            bufferedReader.close();
            fileReader.close();
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jButtonTestActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        String status = (jComboBoxStatus.getSelectedIndex() == 0) ? "mainRiseStatus" : "mainFallStatus";
        parseStatus(status);
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jMenuItemMACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMACDActionPerformed
        String line;
        String[] words = null;

        MACD macd = new MACD(12, 26, 9);
        BRM brm = new BRM(0);
        Strategy strategy = new Strategy(this, brm);
        strategy.macd = macd;

        try {
            fileReader = new FileReader(fileIn);
            bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            bufferedReader.readLine();

            do {
                if ((line = bufferedReader.readLine()) != null) {
                    words = line.split("\t");
                    updateMarket(line);
                    double price = Double.parseDouble(strClose);
                    strategy.macdCrossTrade(price);
                }
            } while (((line != null) && words[0].compareTo(jTextFieldEndDate.getText()) < 0));

            updateTable(brm, strategy);
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemMACDActionPerformed

    protected void dataImport() {
        JFileChooser chooser = new JFileChooser("data/");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Stock Data File (*.txt)", "txt");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Select Stock Data File");
        int ret = chooser.showOpenDialog(this);
        if (ret == JFileChooser.APPROVE_OPTION) {
            fileIn = chooser.getSelectedFile().getPath();
            fileOut = fileIn.substring(0, fileIn.length() - 4) + "_out.txt";

            try {
                File file = new File(fileIn);
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "gbk");
                BufferedReader br = new BufferedReader(isr);
                String[] s = br.readLine().split("\t");
                jLabelStockCode.setText("(" + s[0].replaceAll("[\\pP\\p{Punct}]", "") + ")");
                jLabelStockName.setText(s[1]);
                br.close();
                isr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doModeComputing(Livermore lm) {
        double price;
        String msg = "";
        switch (jComboBoxMode.getSelectedIndex()) {
            case 0:
                price = Double.parseDouble(strClose);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                break;
            case 1:
                price = Double.parseDouble(strMA2);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                break;
            case 2:
                price = Double.parseDouble(strMA3);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                break;
            case 3:
                price = Double.parseDouble(strMA5);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                break;
            case 4:
                price = Double.parseDouble(strOpen);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                price = Double.parseDouble(strClose);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                break;
            case 5:
                price = Double.parseDouble(strClose.compareTo(strOpen) > 0 ? strLow : strHigh);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                price = Double.parseDouble(strClose.compareTo(strOpen) > 0 ? strHigh : strLow);
                msg = lm.arithmetic(price);
                statusRecord(lm, msg);
                break;
        }
    }

    protected void doLivermoreAnalysis(Livermore lm, BRM brm) {
        if (lm.Status.equals(lm.formerStatus) == false) {
            double price = Double.parseDouble(strClose);
            switch (lm.Status) {
                case "mainRiseStatus":
                    brm.quota(true, price);
                    msgLogger("买入价：" + price + "\t剩余款：" + (float) brm.asset);
                    lm.formerStatus = lm.Status;
                    break;
                case "normalFallUStatus":
                case "normalRiseUStatus":
                case "minorFallUStatus":
                case "minorRiseUStatus":
                    break;

                case "mainFallStatus":
                    brm.quota(false, price);
                    msgLogger("卖出价：" + price + "\t总资产：" + (float) brm.asset);
                    lm.formerStatus = lm.Status;
                    break;
                case "normalRiseDStatus":
                case "normalFallDStatus":
                case "minorRiseDStatus":
                case "minorFallDStatus":
                default:
                    break;
            }
        }
    }

    protected void parseStatus(String status) {
        switch (status) {
            case "mainRiseStatus":
                jLabelStatus.setText("主上升！");
                jLabelStatus.setForeground(new java.awt.Color(255, 0, 0));
                break;
            case "normalFallUStatus":
                jLabelStatus.setText("自然回撤");
                jLabelStatus.setForeground(new java.awt.Color(255, 51, 51));
                break;
            case "normalRiseUStatus":
                jLabelStatus.setText("自然回升");
                jLabelStatus.setForeground(new java.awt.Color(255, 51, 51));
                break;
            case "minorFallUStatus":
                jLabelStatus.setText("次级回撤");
                jLabelStatus.setForeground(new java.awt.Color(255, 153, 153));
                break;
            case "minorRiseUStatus":
                jLabelStatus.setText("次级回升");
                jLabelStatus.setForeground(new java.awt.Color(255, 153, 153));
                break;
            case "mainFallStatus":
                jLabelStatus.setText("主下降！");
                jLabelStatus.setForeground(new java.awt.Color(0, 153, 0));
                break;
            case "normalRiseDStatus":
                jLabelStatus.setText("自然回升");
                jLabelStatus.setForeground(new java.awt.Color(51, 255, 51));
                break;
            case "normalFallDStatus":
                jLabelStatus.setText("自然回撤");
                jLabelStatus.setForeground(new java.awt.Color(51, 255, 51));
                break;
            case "minorRiseDStatus":
                jLabelStatus.setText("次级回升");
                jLabelStatus.setForeground(new java.awt.Color(153, 255, 153));
                break;
            case "minorFallDStatus":
                jLabelStatus.setText("次级回撤");
                jLabelStatus.setForeground(new java.awt.Color(153, 255, 153));
                break;
            default:
                break;
        }
    }

    protected void updateMarket(String line) {
        String[] words = line.split("\t");
        int len = words.length;
        strDate = words[0];
        strOpen = words[1];
        strHigh = words[2];
        strLow = words[3];
        strClose = words[4];
        strMA2 = words[len - 6];
        strMA3 = words[len - 5];
        strMA5 = words[len - 4];
        strMA10 = words[len - 3];
        strMA20 = words[len - 2];
        strMA60 = words[len - 1];

        jLabelDate.setText("日期：" + strDate);
        jLabelOpen.setText("开盘：" + strOpen);
        jLabelHigh.setText("最高：" + strHigh);
        jLabelLow.setText("最低：" + strLow);
        jLabelClose.setText("收盘：" + strClose);
        jLabelMA1.setText("MA5：" + strMA5);
        jLabelMA2.setText("MA10：" + strMA10);
        jLabelMA3.setText("MA20：" + strMA20);
        jLabelMA4.setText("MA60：" + strMA60);
    }

    protected void updateTable(BRM brm, Strategy stg) {
        jTablePoint.setValueAt((float) brm.getNetProfit(), 0, 1);
        jTablePoint.setValueAt((float) brm.getGainProfit(), 1, 1);
        jTablePoint.setValueAt((float) brm.getLossProfit(), 2, 1);
        jTablePoint.setValueAt(brm.getGainTimes(), 3, 1);
        jTablePoint.setValueAt(brm.getLossTimes(), 4, 1);
        jTablePoint.setValueAt((float) brm.getWinRate(), 5, 1);
        jTablePoint.setValueAt((float) brm.getMeanGain(), 6, 1);
        jTablePoint.setValueAt((float) brm.getMeanLoss(), 7, 1);
        jTablePoint.setValueAt((float) brm.getOdds(), 8, 1);
        jTablePoint.setValueAt((float) brm.getExpectation(), 9, 1);

        jTablePoint.setValueAt((float) stg.cycleYears + "年", 0, 3);
        jTablePoint.setValueAt((float) brm.getEarningRate() + "%", 1, 3);
        jTablePoint.setValueAt((float) brm.getAnnualRate(stg.cycleYears) + "%", 2, 3);
        jTablePoint.setValueAt((float) brm.getMaxGain(), 3, 3);
        jTablePoint.setValueAt((float) brm.getMaxLoss(), 4, 3);
        jTablePoint.setValueAt((float) stg.getPositionDaysRate() + "%", 5, 3);
        jTablePoint.setValueAt((float) stg.getMeanPositionDays(brm) + "天", 6, 3);
        jTablePoint.setValueAt((float) stg.getMeanGainDays(brm) + "天", 7, 3);
        jTablePoint.setValueAt((float) stg.getMeanLossDays(brm) + "天", 8, 3);
    }

    protected void statusRecord(Livermore lm, String msg) {
        if (msg.equals("") != true) {
            msgLogger(msg);
            fileLogger("[" + strDate + "] " + msg);
            if (!msg.contains("趋势可能改变")) {
                fileLogger("上关键点：" + lm.riseKeyHead
                        + "\t\t上关键点：" + lm.fallKeyHead
                        + "\r\n下关键点：" + lm.riseKeyFoot
                        + "\t\t下关键点：" + lm.fallKeyFoot
                        + "\r\n主上升值：" + lm.mainRiseVal
                        + "\t\t主下降值：" + lm.mainFallVal
                        + "\r\n自然回撤：" + lm.normalFallUVal
                        + "\t\t自然回撤：" + lm.normalFallDVal
                        + "\r\n自然回升：" + lm.normalRiseUVal
                        + "\t\t自然回升：" + lm.normalRiseDVal
                        + "\r\n次级回撤：" + lm.minorFallUVal
                        + "\t\t次级回撤：" + lm.minorFallDVal
                        + "\r\n次级回升：" + lm.minorRiseUVal
                        + "\t\t次级回升：" + lm.minorRiseDVal);
            }
        }
    }

    public void msgLogger(String str) {
        jTextAreaMain.append("[" + strDate + "] " + str + System.getProperty("line.separator"));
    }

    public void fileLogger(String str) {
        if (fileWriter != null) {
            try {
                fileWriter.write(str + System.getProperty("line.separator"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private String strDate = "";
    private String strOpen = "";
    private String strClose = "";
    private String strHigh = "";
    private String strLow = "";
    private String strMA2 = "";
    private String strMA3 = "";
    private String strMA5 = "";
    private String strMA10 = "";
    private String strMA20 = "";
    private String strMA60 = "";

    private String fileIn = "data\\上证指数.txt";
    private String fileOut = "data\\上证指数_out.txt";
    public FileReader fileReader;
    public FileWriter fileWriter;
    public BufferedReader bufferedReader;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImport;
    private javax.swing.JButton jButtonTest;
    private javax.swing.JCheckBox jCheckBoxVpoint;
    private javax.swing.JComboBox<String> jComboBoxMode;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelHigh;
    private javax.swing.JLabel jLabelLow;
    private javax.swing.JLabel jLabelMA1;
    private javax.swing.JLabel jLabelMA2;
    private javax.swing.JLabel jLabelMA3;
    private javax.swing.JLabel jLabelMA4;
    private javax.swing.JLabel jLabelOpen;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStockCode;
    private javax.swing.JLabel jLabelStockName;
    private javax.swing.JMenu jMenuAdd;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemImport;
    private javax.swing.JMenuItem jMenuItemMACD;
    private javax.swing.JMenu jMenuTestSystem;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePoint;
    private javax.swing.JTextArea jTextAreaMain;
    private javax.swing.JTextField jTextFieldEndDate;
    private javax.swing.JTextField jTextFieldStartDate;
    private javax.swing.JTextField jTextFieldTpoint1;
    private javax.swing.JTextField jTextFieldTpoint2;
    private javax.swing.JTextField jTextFieldVpoint;
    // End of variables declaration//GEN-END:variables
}