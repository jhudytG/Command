/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author HP
 */
public class Invoker {
    private Comando command;
    
    public void setCommand(Comando command) {
        this.command = command;
    }
    
    public void executeCommand() {
        command.execute();
    }
}

