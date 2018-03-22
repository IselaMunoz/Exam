import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examen extends JFrame  {
    private JButton btnConvertir;
    private JTextField edtIngreso;

    public Examen(String titulo) {
        this.setTitle(titulo);
        this.setResizable(false);
        this.setLayout(null);

        Container panelPrinc = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblIngresar = new JLabel("Ingrese los segundos a convertir: ");
        lblIngresar.setBounds(10, 10, 200, 30);
        panelPrinc.add(lblIngresar);

        edtIngreso = new JTextField();
        edtIngreso.setBounds(220, 10, 100, 30);
        panelPrinc.add(edtIngreso);

        JLabel lblNota = new JLabel("NOTA:Los segundos a ingresar deben ser inferior a un millón ");
        lblNota.setBounds(0, 30, 400, 60);
        Font tipoLetra= new Font("Dialog", Font.ITALIC, 14);//Cambiar el tipo de letra y tama�o
        lblNota.setFont(tipoLetra);
        lblNota.setForeground(Color.RED);
        panelPrinc.add(lblNota);

        //Creación de objetos que generan eventos
        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(150, 80, 100, 30);
        panelPrinc.add(btnConvertir);

        JLabel lblEquivalencia = new JLabel("Equivalencia");
        lblEquivalencia.setBounds(150, 120, 100, 30);
        Font tipoLetra1= new Font("Dialog", Font.ITALIC, 16);//Cambiar el tipo de letra y tama�o
        lblEquivalencia.setFont(tipoLetra1);
        lblEquivalencia.setForeground(Color.MAGENTA);
        panelPrinc.add(lblEquivalencia);

        JLabel lblDias = new JLabel("Días");
        lblDias.setBounds(10, 150, 100, 30);
        panelPrinc.add(lblDias);

        JLabel lblHoras = new JLabel("Horas  ");
        lblHoras.setBounds(10, 180, 100, 30);
        panelPrinc.add(lblHoras);

        JLabel lblMinutos = new JLabel("Minutos");
        lblMinutos.setBounds(10, 210, 100, 30);
        panelPrinc.add(lblMinutos);

        JLabel lblSegundos = new JLabel("Segundos");
        lblSegundos.setBounds(10, 240, 100, 30);
        panelPrinc.add(lblSegundos);

        //Creación de oyentes
        AccionBoton oyenteBtnAceptar = new AccionBoton();

        //Vincular oyente al componente
        btnConvertir.addActionListener(oyenteBtnAceptar);
    }


    public static void main(String[] args)
    {
        Examen E = new Examen("Examen");
        E.setSize(400,350);
        E.setLocation(200,100);
        E.setVisible(true);
    }

    class AccionBoton implements ActionListener{

        @Override
        //Método controlador del evento actionPerformed
        public void actionPerformed(ActionEvent e) {
            System.out.println("Presionaste un botón " + ((JButton) e.getSource()).getText());
            System.out.println("Botón presionado es Convertir");
            }
        }
    }


