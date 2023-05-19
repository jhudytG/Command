/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package command;

/**
 *
 * @author HP
 */
public class Command {

    public static void main(String[] args) {
    
        
        Editor editor = new Editor();
        Invoker invoker = new Invoker();
        
        
        Comando openCommand = new OpenCommand(editor);
        Comando saveCommand = new SaveCommand(editor);
        Comando exitCommand = new ExitCommand(editor);
        
        // Configurar los comandos en el invocador
        invoker.setCommand(openCommand);
        invoker.executeCommand(); // Ejecutar el comando "Abrir"
        
        invoker.setCommand(saveCommand);
        invoker.executeCommand(); // Ejecutar el comando "Guardar"
        
        invoker.setCommand(exitCommand);
        invoker.executeCommand(); // Ejecutar el comando "Salir"
        
        
        
    }
    
}
