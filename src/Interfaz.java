import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    //Creo la ventana
    JFrame ventana = new JFrame("Registro de eventos");
    // Un panel para agregar los componentes
    JPanel panel = new JPanel();

    //textos
    JLabel nombreTexto = new JLabel("Nombre: ");
    JLabel apellidoTexto = new JLabel("Apellido: ");
    JLabel emailTexto = new JLabel("Email: ");
    JLabel telefonoTexto = new JLabel("Teléfono: ");
    JLabel eventoTexto = new JLabel("Seleccionar Evento: ");
    JLabel comidaTexto = new JLabel("Preferencia de comida: ");
    JLabel generoTexto = new JLabel("Género: ");




    // Campos de texto para los datos
    JTextField nombre = new JTextField(20);
    JTextField apellido = new JTextField(20);
    JTextField email = new JTextField(20);
    JTextField telefono = new JTextField(20);

    //caja de opciones para seleccionar los eventos
    JComboBox<String> eventosCombo = new JComboBox<>(new String[]{"Charla", "Taller", "Presentación"});
    //caja de opciones para la seleccion de la comida
    JComboBox<String> comidaCombo = new JComboBox<>(new String[]{"Vegetariano", "Vegano","Sin Gluten", "Sin preferencia"});

    //casilla de verificacion para necesidades especiales
    JCheckBox accesibilidadCheck = new JCheckBox("Accesibilidad para discapacitados");
    JCheckBox traductorCheck = new JCheckBox("Necesidad de traducción");

    //botones tipo radio para seleccionar los sexos
    JRadioButton masculinoRad = new JRadioButton("Masculino");
    JRadioButton femeninoRad = new JRadioButton("Femenino");
    //agrupar botones
    ButtonGroup generoGrupo = new ButtonGroup();

    //Boton de registro
    JButton registro = new JButton("Registro");


    public Interfaz(){
        //configuración de la ventana
        ventana.setSize(400, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //configuración del panel
        panel.setLayout(new GridLayout(0,2,10,10));

        //agrego los componentes al panel
        panel.add(nombreTexto);
        panel.add(nombre);

        panel.add(apellidoTexto);
        panel.add(apellido);

        panel.add(emailTexto);
        panel.add(email);

        panel.add(telefonoTexto);
        panel.add(telefono);

        panel.add(eventoTexto);
        panel.add(eventosCombo);

        panel.add(comidaTexto);
        panel.add(comidaCombo);

        panel.add(accesibilidadCheck);
        panel.add(traductorCheck);

        panel.add(generoTexto);

        generoGrupo.add(masculinoRad);
        generoGrupo.add(femeninoRad);
        panel.add(masculinoRad);
        panel.add(femeninoRad);

        panel.add(new JLabel(""));
        panel.add(registro);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Hacer visible la ventana
        ventana.setVisible(true);

        //Acción al presionar el botón registrar

        registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtener datos ingresados
                String nombreObtenido = nombre.getText();
                String apellidoObtenido = apellido.getText();
                String emailObtenido = email.getText();
                String telefonoObtenido = telefono.getText();
                String eventoObtenido = (String) eventosCombo.getSelectedItem();
                String comidaObtenido = (String) comidaCombo.getSelectedItem();
                boolean accesibilidadObtenida = accesibilidadCheck.isSelected();
                boolean traductorObtenido = traductorCheck.isSelected();
                String generoObtenido = masculinoRad.isSelected() ? "masculino" : "femenino";

                //motrar los datos obtenidos en la consola
                System.out.println("Nombre: " + nombreObtenido);
                System.out.println("Apellido: " + apellidoObtenido);
                System.out.println("Correo electrónico: " + emailObtenido);
                System.out.println("Número de teléfono: " + telefonoObtenido);
                System.out.println("Evento seleccionado: " + eventoObtenido);
                System.out.println("Preferencia de comida: " + comidaObtenido);
                System.out.println("Accesibilidad: " + accesibilidadObtenida);
                System.out.println("Traducción: " + traductorObtenido);
                System.out.println("Género: " + generoObtenido);


            }
        });

    }

}
