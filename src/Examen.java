import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examen extends JFrame
{
    private JButton btnConvertir;
    private JTextField edtIngreso;
    private JLabel lblDias;
    private JLabel lblMinutos;
    private JLabel lblHoras;
    private JLabel lblSegundos;

    public Examen(String titulo)
    {
        this.setTitle(titulo);
        this.setResizable(false);
        this.setLayout(null);

        Container panelPrincipal = this.getContentPane();
        panelPrincipal.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblIngresar = new JLabel("Ingrese los segundos a convertir: ");
        lblIngresar.setBounds(10, 10, 200, 30);
        lblIngresar.setForeground(Color.CYAN);
        panelPrincipal.add(lblIngresar);

        edtIngreso = new JTextField();
        edtIngreso.setBounds(220, 10, 100, 30);
        panelPrincipal.add(edtIngreso);

        JLabel lblNota = new JLabel("NOTA:Los segundos a ingresar deben ser inferior a un millón si son mayor no se mostrar nada");
        lblNota.setBounds(0, 30, 600, 60);
        Font tlNota = new Font("Dialog", Font.ITALIC, 14);
        lblNota.setFont(tlNota);
        lblNota.setForeground(Color.RED);
        panelPrincipal.add(lblNota);

        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(220, 80, 100, 30);
        panelPrincipal.add(btnConvertir);

        JLabel lblEquivalencia = new JLabel("Equivalencia");
        lblEquivalencia.setBounds(220, 120, 100, 30);
        Font tlEquivalencia = new Font("Dialog", Font.ITALIC, 16);
        lblEquivalencia.setFont(tlEquivalencia);
        lblEquivalencia.setForeground(Color.MAGENTA);
        panelPrincipal.add(lblEquivalencia);

        lblDias=new JLabel("");
        lblDias.setBounds(10, 150, 100, 30);
        lblDias.setForeground(Color.CYAN);
        panelPrincipal.add(lblDias);

        JLabel lblDays=new JLabel("Días");
        lblDays.setBounds(40, 150, 100, 30);
        lblDays.setForeground(Color.CYAN);
        panelPrincipal.add(lblDays);

        lblHoras = new JLabel("");
        lblHoras.setBounds(10, 180, 100, 30);
        lblHoras.setForeground(Color.CYAN);
        panelPrincipal.add(lblHoras);

        JLabel lblHours=new JLabel("Horas");
        lblHours.setBounds(40, 180, 100, 30);
        lblHours.setForeground(Color.CYAN);
        panelPrincipal.add(lblHours);

        lblMinutos = new JLabel("");
        lblMinutos.setBounds(10, 210, 100, 30);
        lblMinutos.setForeground(Color.CYAN);
        panelPrincipal.add(lblMinutos);

        JLabel lblMinutes = new JLabel("Minutos");
        lblMinutes.setBounds(40, 210, 100, 30);
        lblMinutes.setForeground(Color.CYAN);
        panelPrincipal.add(lblMinutes);

        lblSegundos = new JLabel("");
        lblSegundos.setBounds(10, 240, 100, 30);
        lblSegundos.setForeground(Color.CYAN);
        panelPrincipal.add(lblSegundos);

        JLabel lblSeconds = new JLabel("Segundos");
        lblSeconds.setBounds(40, 240, 100, 30);
        lblSeconds.setForeground(Color.CYAN);
        panelPrincipal.add(lblSeconds);
        //Creación de oyentes
        AccionBoton oyenteBtnAceptar = new AccionBoton();
        //Vincular oyente al componente
        btnConvertir.addActionListener(oyenteBtnAceptar);
    }
    public static void main(String[] args)
    {
        Examen E = new Examen("Examen unidad 1");
        E.setSize(650,310);
        E.setLocation(240,100);
        E.setVisible(true);
    }

    class AccionBoton implements ActionListener
    {
        @Override
        //Método controlador del evento actionPerformed
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(btnConvertir)) {
                System.out.println("Presionaste un botón " + ((JButton) e.getSource()).getText());
                System.out.println("Botón presionado es Convertir");
                int n1 = Integer.parseInt(edtIngreso.getText());
                if(n1<1000000)
                {
                int days = n1 / 86400;
                String valorD = Integer.toString(days);
                lblDias.setText(valorD);

                int hours = n1 % 86400 / 3600;
                String valorH = Integer.toString(hours);
                lblHoras.setText(valorH);

                int minutes = n1 % 3600 / 60;
                String valorMin = Integer.toString(minutes);
                lblMinutos.setText(valorMin);

                int sec = n1 % 60;
                String valorSeg = Integer.toString(sec);
                lblSegundos.setText(valorSeg);
                }
            }
        }
    }
}