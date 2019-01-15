package gui.panel;

import entity.Category;
import gui.listener.CategoryListener;
import gui.model.CategoryTableModel;
import service.CategoryService;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

/**
 * Created by LXX on 2019/1/14.
 */
public class CategoryPanel extends WorkingPanel {
    static {
        GUIUtil.useLNF();
    }
    public static CategoryPanel instance = new CategoryPanel();

    public JButton bAdd = new JButton("新增");
    public JButton bEdit = new JButton("编辑");
    public JButton bDelete = new JButton("删除");
    String columnNames[] = new String[]{"分类名称","消费次数"};

    public CategoryTableModel ctm = new CategoryTableModel();
    public JTable t =new JTable(ctm);

    public CategoryPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bAdd,bEdit,bDelete);
        JScrollPane sp =new JScrollPane(t);
        JPanel pSubmit = new JPanel();
        pSubmit.add(bAdd);
        pSubmit.add(bEdit);
        pSubmit.add(bDelete);

        this.setLayout(new BorderLayout());
        this.add(sp,BorderLayout.CENTER);
        this.add(pSubmit,BorderLayout.SOUTH);

        addListener();
    }

    /**
     * 为CategoryPanel新增加一个getSelectedCategory，方便获取JTable上当前选中的Category对象
     * @return
     */
    public Category getSelectedCategory(){
        int index = t.getSelectedRow();
        return ctm.cs.get(index);
    }

    /**
     * 在增加，删除，和修改之后，更新表格中的信息，并默认选中第一行。
     除此之外，还进行判断，如果表格里没有数据，删除和修改按钮不可使用。
     */
    public void updateData(){
        ctm.cs = new CategoryService().list();
        t.updateUI();
        t.getSelectionModel().setSelectionInterval(0,0);
        if (0 == ctm.cs.size()){
            bEdit.setEnabled(false);
            bDelete.setEnabled(false);
        }else {
            bEdit.setEnabled(true);
            bDelete.setEnabled(true);
        }
    }

    public void addListener(){
        CategoryListener l = new CategoryListener();
        bEdit.addActionListener(l);
        bAdd.addActionListener(l);
        bDelete.addActionListener(l);
    }
    public static void main(String[] args) {
        GUIUtil.showPanel(CategoryPanel.instance);
    }
}
