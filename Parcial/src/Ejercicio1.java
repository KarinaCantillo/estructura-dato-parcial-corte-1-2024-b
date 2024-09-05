import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        String cliente = "";
        String producto = "";
        double precio;
        int cantidad;
        String msj = "ingrese un dato positivo";
        double descuento;

        cliente = JOptionPane.showInputDialog(null, "escriba su nombre");
        producto = JOptionPane.showInputDialog(null, "escriba el nombre del producto");
        precio = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el precio del producto"));

        if (precio > 0) {

            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad a comprar"));

            if (cantidad > 0) {
                // operaciones

                if (cantidad <10){
                    JOptionPane.showMessageDialog(null, "NO TIENE DESCUNETO");

                }else{
                    if(cantidad>=10 && cantidad >=20) {
                        descuento = (precio * 0.05);
                    }else{
                        if (cantidad>20) {
                            descuento = (precio * 0.07);

                            JOptionPane.showMessageDialog(null,  cliente "compro" + producto + "su descuento es:"+ descuento );
                        }
                    }
                }



            }else{
                JOptionPane.showMessageDialog(null, msj);
            }

        }else{
            JOptionPane.showMessageDialog(null, msj);
        }
    }
}