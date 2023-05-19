/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author HP
 */


public class SaveCommand implements Comando {
    private Editor editor;
    
    public SaveCommand(Editor editor) {
        this.editor = editor;
    }
    
    @Override
    public void execute() {
        editor.save();
    }
}



