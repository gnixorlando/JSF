/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import lombok.Getter;
import lombok.Setter;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulohenrique
 */

@Getter
@Setter
@ViewScoped
@ManagedBean
public class BeanController {
    private String name = "Aemon Rivers";
    private List<String> listNames = new ArrayList<>();
    private String message = "";

    public void initializer() {
        System.out.println("aplicação inicializada!");

        this.listNames.add("José Alves");
        this.listNames.add("Carlos André");
        this.listNames.add("Daniel Souza");
    }

    public void showAlertMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Alert",  message));
    }
}
