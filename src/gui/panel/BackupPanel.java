package gui.panel;

import gui.listener.BackupListener;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;

/**
 * Created by LXX on 2019/1/14.
 */
public class BackupPanel extends WorkingPanel {
    static{
        GUIUtil.useLNF();
    }

    public static BackupPanel instance = new BackupPanel();
    JButton bBackup =new JButton("备份");

    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bBackup);
        this.add(bBackup);
        addListener();
    }

    @Override
    public void addListener() {
        BackupListener l = new BackupListener();
        bBackup.addActionListener(l);
    }

    @Override
    public void updateData() {

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }
}
