package gui.model;

import entity.Category;
import service.CategoryService;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LXX on 2019/1/14.
 * 下拉框
 */
public class CategoryComBoxModel implements ComboBoxModel<Category>{

    public List<Category> cs = new CategoryService().list();

    Category c;

    @Override
    public int getSize() {
        return cs.size();
    }

    @Override
    public Category getElementAt(int index) {
        return cs.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        // TODO Auto-generated method stub

    }

    /**
     * 当界面上选中了某一个下拉框项，就会调用这个方法
     * @param anItem
     */
    @Override
    public void setSelectedItem(Object anItem) {
        c = (Category) anItem;

    }

    @Override
    public Object getSelectedItem() {
        // TODO Auto-generated method stub
        return c;
    }
}
