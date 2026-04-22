package com.alx.libreriaedex;
 
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route()
public class MainView extends VerticalLayout {

    public MainView() {
        Image logo = new Image("images/libreria-edex-logo.png", "Logo de la aplicación");
        logo.setHeight("180px");
        logo.setWidth("180px");
        logo.getStyle().set("margin-bottom", "20px");

        H1 titulo = new H1("Inicio de Sesión");

        TextField usuario = new TextField("Usuario *");
        PasswordField contrasena = new PasswordField("Contraseña *");

        Button botonIngresar = new Button("Ingresar");
        Anchor enlaceOlvido = new Anchor("#", "¿Olvidaste tu contraseña?");
        Button botonRegistro = new Button("Registrarse");

        VerticalLayout formulario = new VerticalLayout(logo, titulo, usuario, contrasena, botonIngresar, enlaceOlvido, botonRegistro);
        formulario.setAlignItems(Alignment.CENTER);
        formulario.setSpacing(true);
        formulario.getStyle().set("border", "1px solid #dcdcdc")
                .set("border-radius", "12px")
                .set("padding", "30px")
                .set("box-shadow", "0 4px 12px rgba(0,0,0,0.15)")
                .set("background-color", "#ffffff");

        add(formulario);

        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
    }
    
}
