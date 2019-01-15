package gui.panel;

import gui.listener.RecordListener;
import gui.listener.RecoverListener;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;

/**
 * Created by LXX on 2019/1/14.
 */
public class RecoverPanel extends WorkingPanel {

    static{
        GUIUtil.useLNF();
    }
    public static RecoverPanel instance = new RecoverPanel();

    JButton bRecover =new JButton("恢复");

    public RecoverPanel() {

        GUIUtil.setColor(ColorUtil.blueColor, bRecover);
        this.add(bRecover);
        addListener();
    }

    @Override
    public void addListener() {
        RecoverListener l = new RecoverListener();
        bRecover.addActionListener(l);
    }

    @Override
    public void updateData() {

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecoverPanel.instance);
    }
}
