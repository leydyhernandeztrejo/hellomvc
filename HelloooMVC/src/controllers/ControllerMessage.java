/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMessage;
import views.ViewMessage;

/**
 *
 * @author morenita
 */
public class ControllerMessage implements ActionListener{
    
    ModelMessage modelMessage;
    ViewMessage viewMessage;

    public ControllerMessage(ModelMessage modelMessage, ViewMessage viewMessage) {
        this.modelMessage = modelMessage;
        this.viewMessage = viewMessage;
        this.viewMessage.jb_say_hello.addActionListener(this);
        initComponets();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewMessage.jb_say_hello){
            jb_say_hello_action_performed();
        
        }
    }
    
    public void jb_say_hello_action_performed(){
        modelMessage.setName(viewMessage.jtf_name.getText());
        viewMessage.jl_message.setText("Hello " + modelMessage.getName());
        
    }
    public void initComponets(){
        viewMessage.setVisible(true);
        viewMessage.jtf_name.setText(modelMessage.getName());
    }
   

}
