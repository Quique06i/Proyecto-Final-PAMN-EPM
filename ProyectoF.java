/*Enrique Pérez Martinez	
  Proyecto Final PAMN
	Nombre del Proyecto: Tus Rolas
*/
import java.net.*;
import java.io.*;
import java.util.Scanner; 

public class ProyectoF extends javax.swing.JFrame{
	private javax.swing.JLabel jEtSaludo; //variable de texto
	private javax.swing.JButton jBtSaludo; //variable de boton
	
	public ProyectoF(){            //Constructor
		setSize(300, 200);   		 //tamaño de la ventana
	 	setTitle("Tus rolas");  //titulo de la ventana
	 	initComponents();			 //Inicia Componentes
	}

		private void initComponents(){//componentes de la aplicacion
			getContentPane().setLayout(null);
			jEtSaludo = new javax.swing.JLabel();
			jBtSaludo = new javax.swing.JButton();
			setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

			//Texto Aplcacion
			jEtSaludo.setText("Bienvenido :)");
			jEtSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jEtSaludo.setFont(new java.awt.Font("Dialog",1,18));
			getContentPane().add(jEtSaludo);
			jEtSaludo.setBounds(42, 36, 204, 30);

			//Boton
			jBtSaludo.setToolTipText("Boton");
			jBtSaludo.setMnemonic('c');
			jBtSaludo.setText("Presiona Aqui");
			getContentPane().add(jBtSaludo);
			jBtSaludo.setBounds(42, 90, 204, 30);

				//Accion Boton
				jBtSaludo.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						jBtSaludoActionPerformed(evt);
					}
				} );
		}

			//Codigo al presionar boton
			private void jBtSaludoActionPerformed(java.awt.event.ActionEvent evt){
			 	LeerCancion lc = new LeerCancion();	
				lc.lee();
            }

			public static void main(String args[]){
			new ProyectoF().setVisible(true);//valida la aplicacion
			}			
}
