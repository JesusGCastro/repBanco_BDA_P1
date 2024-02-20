
package com.itson.bdavanzadas.banco;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *Clase para crear una columna de botones en una tabla Swing que puede actuar como
 * editor de celda y renderizador de celda.
 * Esta clase extiende AbstractCellEditor e implementa TableCellRenderer y TableCellEditor
 * para proporcionar funcionalidad de renderizado y edición de celdas.
 * @author Equipo
 */
public class ButtonColumn extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {

    private final JButton renderButton;
    private final JButton editButton;
    private Object currentValue;

    /**
     * Constructor de la clase ButtonColumn.
     *
     * @param buttonText Texto que se muestra en los botones de la columna.
     * @param actionListener ActionListener que escucha los eventos de los botones.
     */    
    public ButtonColumn(String buttonText, ActionListener actionListener) {
        renderButton = new JButton(buttonText);
        renderButton.setFocusPainted(false);

        editButton = new JButton(buttonText);
        editButton.setFocusPainted(false);
        editButton.addActionListener(actionListener);
    }

    /**
     * Retorna el componente utilizado para renderizar una celda.
     *
     * @param table La tabla a la que pertenece la celda.
     * @param value El valor de la celda.
     * @param isSelected Verdadero si la celda está seleccionada.
     * @param hasFocus Verdadero si la celda tiene el foco.
     * @param row El índice de la fila de la celda.
     * @param column El índice de la columna de la celda.
     * @return El componente utilizado para renderizar la celda.
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (hasFocus) {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(table.getBackground());
        } else if (isSelected) {
            renderButton.setForeground(table.getSelectionForeground());
            renderButton.setBackground(table.getSelectionBackground());
        } else {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(table.getBackground());
        }

        renderButton.setText((value == null) ? "" : value.toString());
        return renderButton;
    }

    /**
     * Retorna el componente utilizado para editar una celda.
     *
     * @param table La tabla a la que pertenece la celda.
     * @param value El valor de la celda.
     * @param isSelected Verdadero si la celda está seleccionada.
     * @param row El índice de la fila de la celda.
     * @param column El índice de la columna de la celda.
     * @return El componente utilizado para editar la celda.
     */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        currentValue = value;
        editButton.setText((value == null) ? "" : value.toString());
        return editButton;
    }

    /**
     * Retorna el valor actual de la celda.
     *
     * @return El valor actual de la celda.
     */
    @Override
    public Object getCellEditorValue() {
        return currentValue;
    }

    /**
     * Establece el texto para los botones de la columna.
     *
     * @param text El texto a establecer en los botones de la columna.
     */
    public void setButtonText(String text) {
        renderButton.setText(text);
        editButton.setText(text);
    }
}