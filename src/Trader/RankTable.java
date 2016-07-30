/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author zhangxr
 */
public class RankTable extends javax.swing.JDialog {

    /**
     * Creates new form RankTable
     */
    public RankTable(java.awt.Frame parent, boolean modal, ArrayList<SystemReport> list) {
        super(parent, modal);
        initComponents();

        SRList = list;
        updateTable();

        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public void updateTable() {
        int rows = (SRList.size() > 20) ? 20 : SRList.size();
        for (int i = 0; i < rows; i++) {
            jTableRank.setValueAt(SRList.get(i).parameter, i, 1);
            jTableRank.setValueAt(SRList.get(i).currentAsset, i, 2);
            jTableRank.setValueAt(SRList.get(i).annualRate, i, 3);
            jTableRank.setValueAt(SRList.get(i).positionDaysRate, i, 4);
            jTableRank.setValueAt(SRList.get(i).positionAnnualRate, i, 5);
            jTableRank.setValueAt(SRList.get(i).tradeTimes, i, 6);
            jTableRank.setValueAt(SRList.get(i).evenEarningRate, i, 7);
            jTableRank.setValueAt(SRList.get(i).expectation, i, 8);
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

        jScrollPaneTrade = new javax.swing.JScrollPane();
        jTableRank = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("交易系统排名");

        jScrollPaneTrade.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        jTableRank.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableRank.getTableHeader().setFont(new java.awt.Font("微软雅黑", 0, 12));
        jTableRank.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTableRank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null, null, null, null, null},
                {"2", null, null, null, null, null, null, null, null},
                {"3", null, null, null, null, null, null, null, null},
                {"4", null, null, null, null, null, null, null, null},
                {"5", null, null, null, null, null, null, null, null},
                {"6", null, null, null, null, null, null, null, null},
                {"7", null, null, null, null, null, null, null, null},
                {"8", null, null, null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null, null},
                {"16", null, null, null, null, null, null, null, null},
                {"17", null, null, null, null, null, null, null, null},
                {"18", null, null, null, null, null, null, null, null},
                {"19", null, null, null, null, null, null, null, null},
                {"20", null, null, null, null, null, null, null, null}
            },
            new String [] {
                "排名", "参数", "当前资产", "年化率", "持仓时间比", "持仓年化", "次数", "单次均收益", "数学期望"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRank.setRowHeight(20);
        jTableRank.getTableHeader().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRankHeaderMouseClicked(evt);
            }
        });
        jTableRank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRankMouseClicked(evt);
            }
        });
        jScrollPaneTrade.setViewportView(jTableRank);
        if (jTableRank.getColumnModel().getColumnCount() > 0) {
            jTableRank.getColumnModel().getColumn(0).setMaxWidth(38);
            jTableRank.getColumnModel().getColumn(1).setMaxWidth(80);
            jTableRank.getColumnModel().getColumn(2).setMaxWidth(70);
            jTableRank.getColumnModel().getColumn(6).setMaxWidth(40);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTrade, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableRankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRankMouseClicked
        jTableRank.setColumnSelectionAllowed(false);
        jTableRank.setRowSelectionAllowed(true);
    }//GEN-LAST:event_jTableRankMouseClicked

    private void jTableRankHeaderMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() > 1) {
            int index = jTableRank.columnAtPoint(evt.getPoint());
            jTableRank.setColumnSelectionAllowed(true);
            jTableRank.setRowSelectionAllowed(false);
            jTableRank.setColumnSelectionInterval(index, index);
            switch (index) {
                case 2:
                    Collections.sort(SRList, (SystemReport arg0, SystemReport arg1) -> new Float(arg1.currentAsset).compareTo(arg0.currentAsset));
                    break;
                case 3:
                    Collections.sort(SRList, (SystemReport arg0, SystemReport arg1) -> new Float(arg1.annualRate).compareTo(arg0.annualRate));
                    break;
                case 4:
                    Collections.sort(SRList, (SystemReport arg0, SystemReport arg1) -> new Float(arg0.positionDaysRate).compareTo(arg1.positionDaysRate));
                    break;
                case 5:
                    Collections.sort(SRList, (SystemReport arg0, SystemReport arg1) -> new Float(arg1.positionAnnualRate).compareTo(new Float(arg0.positionAnnualRate)));
                    break;
                case 6:
                    Collections.sort(SRList, (SystemReport arg0, SystemReport arg1) -> new Integer(arg0.tradeTimes).compareTo(arg1.tradeTimes));
                    break;
                case 7:
                    Collections.sort(SRList, (SystemReport arg0, SystemReport arg1) -> new Float(arg1.evenEarningRate).compareTo(arg0.evenEarningRate));
                    break;
                case 8:
                    Collections.sort(SRList, (SystemReport arg0, SystemReport arg1) -> new Float(arg1.expectation).compareTo(arg0.expectation));
                    break;
                default:
                    break;
            }

            updateTable();
        }
    }

    ArrayList<SystemReport> SRList;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPaneTrade;
    private javax.swing.JTable jTableRank;
    // End of variables declaration//GEN-END:variables
}
