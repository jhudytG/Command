/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;


public class OpenCommand implements Comando{
    private Editor editor;
    
    public OpenCommand(Editor editor) {
        this.editor = editor;
        
    }
    
    @Override
    public void execute() {
        editor.open();
    }
}