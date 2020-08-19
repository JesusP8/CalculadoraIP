package condicionales;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {
	
    
    private JLabel labeltitulo, labeltitulo2, labeltitulo3, labeltitulo4, labeltitulo5, labeltitulo6, labeltitulo7,labeltitulo8,labeltitulo9,labeltitulo10,labeltitulo11,labeltitulo12,labeltitulo13,labeltitulo14;
    private JButton buttonPanel1, buttonPanel2, buttonPanel3, buttonPanel4,buttonPanel5,buttonPanel6,buttonPanel7,buttonPanel8,buttonPanel9,buttonPanel10,buttonPanel11,buttonPanel12,buttonPanel13,buttonPanel14;
    private JTextArea textArea, textArea2, textArea3,textArea4,textArea5,textArea6,textArea7,textArea8;
    private JPanel panel1, panel2,panel3;
    private JTextField textField, textField2, textField3, textField4,textField5,textField6,textField7,textField8,textField9,textField10,textField11;
    public String[] aberIpv6;
    String texto2;
    String texto3 = "";
    String texto4;
    String texto5;
    String texto6;
    String texto7;
    String texto8;
    String texto9;
    String texto10;
    String texto11= "";
    String var1Ipv6;
    String var2Ipv6;
    String var3Ipv6;
    String var4Ipv6;
    String var5Ipv6;
    String var6Ipv6;
    String var7Ipv6;
    String var8Ipv6;
    
    public UI() {
    	
        setSize(560, 760);
        setTitle("Calculadora IP");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentes();
       
    }
    

    private void componentes() {
    	

    	 panel1 = new JPanel();
         panel1.setBounds(20, 10, 520, 760);
         panel1.setLayout(null);
         panel1.setVisible(true);
         panel2 = new JPanel();
         panel2.setBounds(20, 15, 520, 760);
         panel2.setLayout(null);
         panel2.setVisible(false);
         panel3 = new JPanel();
         panel3.setBounds(20, 15, 520, 760);
         panel3.setLayout(null);
         panel3.setVisible(false);
         
         
        textField = new JTextField();
        textField.setBounds(20, 40, 80, 20);
        labeltitulo = new JLabel("Direccion IP");
        labeltitulo.setBounds(40, 20, 120, 20);
        labeltitulo2 = new JLabel("Mascara de red");
        labeltitulo2.setBounds(40, 60, 120, 20);
        labeltitulo3 = new JLabel("Seleccione las opciones que desee");
        labeltitulo3.setBounds(40, 100, 210, 20);
        labeltitulo4 = new JLabel("Host");
        labeltitulo4.setBounds(400, 60, 210, 20);
        labeltitulo5 = new JLabel("Calculadora IP");
        labeltitulo5.setBounds(140, 5, 210, 20);
        labeltitulo6 = new JLabel("Ingresar Ipv6");
        labeltitulo6.setBounds(120, 40, 210, 20);
        labeltitulo7 = new JLabel("Mascara de red");
        labeltitulo7.setBounds(270, 40, 210, 20);
        labeltitulo8 = new JLabel("Operaciones");
        labeltitulo8.setBounds(60, 210, 210, 20);
        labeltitulo9 = new JLabel("IPs");
        labeltitulo9.setBounds(260, 210, 210, 20);
        labeltitulo10 = new JLabel("Mascaras de red");
        labeltitulo10.setBounds(400, 210, 210, 20);
        labeltitulo11 = new JLabel("Ips");
        labeltitulo11.setBounds(280, 130, 210, 20);
        labeltitulo12 = new JLabel("Mascaras de red");
        labeltitulo12.setBounds(410, 130, 210, 20);
        labeltitulo13 = new JLabel("Operaciones");
        labeltitulo13.setBounds(50, 130, 210, 20);
        labeltitulo14 = new JLabel("Historial General");
        labeltitulo14.setBounds(220, 50, 210, 20);
        textField2 = new JTextField();
        textField2.setBounds(110, 40, 80, 20);
       
        textField3 = new JTextField();
        textField3.setBounds(200, 40, 80, 20);
      
        textField4 = new JTextField();
        textField4.setBounds(290, 40, 80, 20);
        textField5 = new JTextField();
        textField5.setBounds(20, 80, 80, 20);
        textField6 = new JTextField();
        textField6.setBounds(110, 80, 80, 20);
        textField7 = new JTextField();
        textField7.setBounds(200, 80, 80, 20);
        textField8 = new JTextField();
        textField8.setBounds(290, 80, 80, 20);
        textField9 = new JTextField();
        textField9.setBounds(380, 80, 80, 20);
        textField11 = new JTextField("0:0:0:0:0:0:0:0");
        textField11.setBounds(100, 60, 120, 30);
        textField10 = new JTextField();
        textField10.setBounds(260, 60, 110, 20);
       
        
        buttonPanel1 = new JButton("Publico o privado");
        buttonPanel1.setBounds(20, 120, 140, 20);
        buttonPanel1.addActionListener(this);
        buttonPanel2 = new JButton("Clase");
        buttonPanel2.setBounds(170, 120, 110, 20);
        buttonPanel2.addActionListener(this);
        buttonPanel3 = new JButton("APIPA");
        buttonPanel3.setBounds(290, 120, 110, 20);
        buttonPanel3.addActionListener(this);
        buttonPanel4 = new JButton("Reservadas");
        buttonPanel4.setBounds(170, 150, 110, 20);
        buttonPanel4.addActionListener(this);
        buttonPanel5 = new JButton("Direccion de red");
        buttonPanel5.setBounds(20, 150, 140, 20);
        buttonPanel5.addActionListener(this);
        buttonPanel6 = new JButton("Cast");
        buttonPanel6.setBounds(410, 120, 90, 20);
        buttonPanel6.addActionListener(this);
        buttonPanel7 = new JButton("Broadcast");
        buttonPanel7.setBounds(290, 150, 110, 20);
        buttonPanel7.addActionListener(this);
        buttonPanel8 = new JButton("Gateway");
        buttonPanel8.setBounds(410, 150, 90, 20);
        buttonPanel8.addActionListener(this);
        buttonPanel9 = new JButton("Host");
        buttonPanel9.setBounds(250, 180, 110, 20);
        buttonPanel10 = new JButton("Rango");
        buttonPanel10.setBounds(130, 180, 110, 20);
        buttonPanel10.addActionListener(this);
        buttonPanel11 = new JButton("Vista principal");
        buttonPanel11.setBounds(420, 10, 120, 20);
        buttonPanel11.addActionListener(this);
        buttonPanel12 = new JButton("Ope. IPv6");
        buttonPanel12.setBounds(420, 40, 120, 20);
        buttonPanel12.addActionListener(this);
        buttonPanel13 = new JButton("IPV6");
        buttonPanel13.setBounds(100, 100, 120, 20);
        buttonPanel13.addActionListener(this);
        buttonPanel14 = new JButton("Historial");
        buttonPanel14.setBounds(295, 10, 120, 20);
        buttonPanel14.addActionListener(this);
        textArea3 = new JTextArea();
        textArea3.setBounds(190, 230, 160, 450);
        textArea = new JTextArea();
        textArea.setBounds(20, 230, 160, 450);
        textArea2 = new JTextArea();
        textArea2.setBounds(30, 240, 200, 450);
        textArea4 = new JTextArea();
        textArea4.setBounds(240, 240, 200, 450);
        textArea5 = new JTextArea();
        textArea5.setBounds(360, 230, 190, 450);
        textArea6 = new JTextArea();
        textArea6.setBounds(20, 150, 170, 550);
        textArea7 = new JTextArea();
        textArea7.setBounds(200, 150, 170, 550);
        textArea8 = new JTextArea();
        textArea8.setBounds(380, 150, 160, 550);
 
        panel1.add(textField);
        panel1.add(labeltitulo);
        panel1.add(labeltitulo4);
        panel1.add(labeltitulo5);
        panel1.add(labeltitulo8);
        panel1.add(labeltitulo9);
        panel1.add(labeltitulo10);
        panel1.add(textField2);
        panel1.add(textField3);
        panel1.add(textField4);
        panel1.add(textField5);
        panel1.add(textField6);
        panel1.add(textField7);
        panel1.add(textField8);
        panel1.add(textField9);
        panel1.add(textArea3);
        panel1.add(buttonPanel1);
        panel1.add(buttonPanel2);
        panel1.add(buttonPanel3);
        panel1.add(buttonPanel4);
        panel1.add(buttonPanel5);
        panel1.add(buttonPanel6);
        panel1.add(labeltitulo2);
        panel1.add(labeltitulo3);
        panel1.add(buttonPanel7);
        panel1.add(buttonPanel8);
        panel1.add(buttonPanel9);
        panel1.add(buttonPanel10);
        add(buttonPanel11);
        add(buttonPanel12);
        add(buttonPanel14);
        panel2.add(buttonPanel13);
        panel1.add(textArea);
        panel1.add(textArea3);
        panel1.add(textArea5);
        panel2.add(textArea2);
        panel2.add(textArea4);
        panel2.add(textField11);
        panel2.add(labeltitulo6);
        panel2.add(labeltitulo7);
        panel2.add(textField10);
        panel3.add(textArea6);
        panel3.add(textArea7);
        panel3.add(labeltitulo11);
        panel3.add(labeltitulo12);
        panel3.add(labeltitulo13);
        panel3.add(labeltitulo14);
        panel3.add(textArea8);
        add(panel1);
        add(panel2);
        add(panel3);
        
        buttonPanel1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	
            	if((octeto1==10)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255)) {
                 	
                 	textArea.append("\nPrivado");
                 	textArea6.append("\nPrivado");
                 		
                }
                 	else 
                 		if((octeto1==172)&&(octeto2>=16)&&(octeto2<=31)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nPrivado");
                 			textArea6.append("\nPrivado");
                 		
                     	
                 		}
                 		else if((octeto1==192)&&(octeto2==168)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nPrivado");
                 			textArea6.append("\nPrivado");
                 			
                         	
                 		}
                 		else
                 		{
                 			textArea.append("\nPublico");
            				textArea6.append("\nPublico");
                 		}	
            				
            				
                 	
            		texto3 += "// " + textField.getText() + ".";
            		texto3 += textField2.getText() + ".";
            		texto3 += textField3.getText() + ".";
            		texto3 += textField4.getText() + "\n";
            		textArea3.setText(texto3);
            		textArea7.setText(texto3);
         }
            
            		
        
        
    });
        
        buttonPanel2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	
            	if((octeto1>=0)&&(octeto1<=127)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255)) {
                 	
            		textArea.append("\nA");
            		textArea6.append("\nA");
                 		
                }
                 	else 
                 		if((octeto1>=128)&&(octeto1<=191)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nB");
                 			textArea6.append("\nB");
                 		
                     	
                 		}
                 		else if((octeto1>=192)&&(octeto1<=223)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nC");
                 			textArea6.append("\nC");
                 			
                         	
                 		}
                 		else if ((octeto1>=224)&&(octeto1<=239)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nD");
                 			textArea6.append("\nD");
                 		}
                 		else if ((octeto1>=240)&&(octeto1<=255)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nF");
                 			textArea6.append("\nF");
                 		}	
                		
                 		else
                 		{
                 			textArea.append("\nNo pert. a ninguna clase");
            				textArea6.append("\nNo pert. a ninguna clase");
                 		}
                 	
            		texto3 += "// " + textField.getText() + ".";
            		texto3 += textField2.getText() + ".";
            		texto3 += textField3.getText() + ".";
            		texto3 += textField4.getText() + "\n";
            		textArea3.setText(texto3);
            		textArea7.setText(texto3);
         }
            
            		
        
        
    });
        
        buttonPanel3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	
            	if((octeto1==169)&&(octeto2==254)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=1)&&(octeto4<=254)) {
                 	
            		textArea.append("\nEs APIPA");
            		textArea6.append("\nEs APIPA");
                 		
                }
                 		else
                 		{
                 			textArea.append("\nNo es APIPA");
            				textArea6.append("\nNo es APIPA");
                 		}
                 	
            		texto3 += "// " + textField.getText() + ".";
            		texto3 += textField2.getText() + ".";
            		texto3 += textField3.getText() + ".";
            		texto3 += textField4.getText() + "\n";
            		textArea3.setText(texto3);
            		textArea7.setText(texto3);
         }
            
            		
        
        
    });
        
        buttonPanel4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	
            	if((octeto1==0)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255)) {
                 	
            		textArea.append("\nSoftware");
            		textArea6.append("\nSoftware");
                 		
                }
                 	else 
                 		if((octeto1==10)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nRed Privada");
                 			textArea6.append("\nRed Privada");
                 		
                 		}
                 		else if((octeto1==100)&&(octeto2>=64)&&(octeto2<=127)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nRed Privada");
                 			textArea6.append("\nRed Privada");
                 			
                 		}
                 		else if ((octeto1==127)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nHost");
                 			textArea6.append("\nHost");
                 		}
                 		else if ((octeto1==169)&&(octeto2==254)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nSubnet");
                 			textArea6.append("\nSubnet");
                 		}	
                 		else if ((octeto1==172)&&(octeto2>=16)&&(octeto2<=31)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nRed Privada");
                 			textArea6.append("\nRed Privada");
                 		}
                 		else if ((octeto1==192)&&(octeto2==0)&&(octeto3==0)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nRed Privada");
                 			textArea6.append("\nRed Privada");
                 		}
                 		else if ((octeto1==192)&&(octeto2==0)&&(octeto3==2)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nDocumentacion");
                 			textArea6.append("\nDocumentacion");
                 		}
                 		else if ((octeto1==192)&&(octeto2==88)&&(octeto3==99)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nInternet");
                 			textArea6.append("\nInternet");
                 		}
                 		else if ((octeto1==192)&&(octeto2==168)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nRed Privada");
                 			textArea6.append("\nRed Privada");
                 		}
                 		else if ((octeto1==198)&&(octeto2>=18)&&(octeto2<=19)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nRed Privada");
                 			textArea6.append("\nRed Privada");
                 		}
                 		else if ((octeto1==198)&&(octeto2==51)&&(octeto3==100)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nDocumentacion");
                 			textArea6.append("\nDocumentacion");
                 		}
                 		else if ((octeto1==203)&&(octeto2==0)&&(octeto3==113)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nDocummentacion");
                 			textArea6.append("\nDocummentacion");
                 		}
                 		else if ((octeto1>=224)&&(octeto1<=239)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
                 		{
                 			textArea.append("\nInternet");
                 			textArea6.append("\nInternet");
                 		}
                 		else if ((octeto1>=240)&&(octeto1<=255)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=254))
                 		{
                 			textArea.append("\nInternet");
                 			textArea6.append("\nInternet");
                 		}
                 		else if ((octeto1==255)&&(octeto2==255)&&(octeto3==255)&&(octeto4==255))
                 		{
                 			textArea.append("\nSubnet limited broadcast");
                 			textArea6.append("\nSubnet limited broadcast");
                 		}
                 		else
                 		{
                 			textArea.append("\nNo pert. a ninguna reservada");
            				textArea6.append("\nNo pert. a ninguna reservada");
                 		}
                 	
            		texto3 += "// " + textField.getText() + ".";
            		texto3 += textField2.getText() + ".";
            		texto3 += textField3.getText() + ".";
            		texto3 += textField4.getText() + "\n";
            		textArea3.setText(texto3);
            		textArea7.setText(texto3);
         }
            
            		
        
        
    });
        
        buttonPanel5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	int octeto5=Integer.parseInt(textField5.getText());
            	int octeto6=Integer.parseInt(textField6.getText());
            	int octeto7=Integer.parseInt(textField7.getText());
            	int octeto8=Integer.parseInt(textField8.getText());
            	
            	 int p=octeto1 & octeto5;
            	 texto6="\n" + p +".";
            	 int x=octeto2 & octeto6;
            	 texto7=x+".";
            	 int h=octeto3 & octeto7;
            	 texto8=h+".";
            	 int n=octeto4 & octeto8;
            	 texto9=n+"";

            	 textArea.append(texto6);
            	 textArea.append(texto7);
            	 textArea.append(texto8);
            	 textArea.append(texto9);
            	 textArea6.append(texto6);
            	 textArea6.append(texto7);
            	 textArea6.append(texto8);
            	 textArea6.append(texto9);
            	
                 	
            	texto3 += "// " + textField.getText() + ".";
         		texto3 += textField2.getText() + ".";
         		texto3 += textField3.getText() + ".";
         		texto3 += textField4.getText() + "\n";
         		texto11 += "//" + textField5.getText() + ".";
         		texto11 += textField6.getText() + ".";
         		texto11 += textField7.getText() + ".";
         		texto11 += textField8.getText() + "\n";
         		textArea3.setText(texto3);
         		textArea7.setText(texto3);
         		textArea5.setText(texto11);
         		textArea8.setText(texto11);
            	 
            	 
            	
         }
            
            		
        
        
    });
        
        buttonPanel6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	int octeto5=Integer.parseInt(textField5.getText());
            	int octeto6=Integer.parseInt(textField6.getText());
            	int octeto7=Integer.parseInt(textField7.getText());
            	int octeto8=Integer.parseInt(textField8.getText());
            	
            	int g1= ~octeto5 & 0xff;
            	int g2= ~octeto6 & 0xff;
            	int g3= ~octeto7 & 0xff;
            	int g4= ~octeto8 & 0xff;
            	
            	int u1=octeto1 | g1;
            	int u2=octeto2 | g2;
            	int u3=octeto3 | g3;
            	int u4=octeto4 | g4;
            	
            	texto6="\n" + u1 +".";
            	texto7=u2+".";
            	texto8=u3+".";
            	texto9=u4+"";
            	
            	 
            	 if((octeto1==u1)&&(octeto2==u2)&&(octeto3==u3)&&(octeto4==u4))
            	 	{
            		 textArea.append("\nEs Broadcast");
            		 textArea6.append("\nEs Broadcast");
            	 	}else if ((octeto1==169)&&(octeto2==254)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=1)&&(octeto4<=254))
             		{
                    	textArea.append("\nEs Unicast");
                    	textArea6.append("\nEs Unicast");
             		}else if ((octeto1>=224)&&(octeto1<=239)&&(octeto2>=0)&&(octeto2<=255)&&(octeto3>=0)&&(octeto3<=255)&&(octeto4>=0)&&(octeto4<=255))
             		{
             			textArea.append("\nEs Multicast");
             			textArea6.append("\nEs Multicast");
             		}
                     		else
                     		{
                     			textArea.append("\nNo pertenece");
                     			textArea6.append("\nNo pertenece");
                     		}
                 		
               
                 	
            	 texto3 += "// " + textField.getText() + ".";
          		texto3 += textField2.getText() + ".";
          		texto3 += textField3.getText() + ".";
          		texto3 += textField4.getText() + "\n";
          		texto11 += "//" + textField5.getText() + ".";
          		texto11 += textField6.getText() + ".";
          		texto11 += textField7.getText() + ".";
          		texto11 += textField8.getText() + "\n";
          		textArea3.setText(texto3);
         		textArea7.setText(texto3);
         		textArea5.setText(texto11);
         		textArea8.setText(texto11);
         }
            
            		
        
        
    });
        
        buttonPanel7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	int octeto5=Integer.parseInt(textField5.getText());
            	int octeto6=Integer.parseInt(textField6.getText());
            	int octeto7=Integer.parseInt(textField7.getText());
            	int octeto8=Integer.parseInt(textField8.getText());
            	
            	int f1= ~octeto5 & 0xff;
            	int f2= ~octeto6 & 0xff;
            	int f3= ~octeto7 & 0xff;
            	int f4= ~octeto8 & 0xff;
            	
            	int w1=octeto1 | f1;
            	int w2=octeto2 | f2;
            	int w3=octeto3 | f3;
            	int w4=octeto4 | f4;
            	
            	texto6="\n" + w1 +".";
            	texto7=w2+".";
            	texto8=w3+".";
            	texto9=w4+"";
            	
            	 textArea.append(texto6);
            	 textArea.append(texto7);
            	 textArea.append(texto8);
            	 textArea.append(texto9);
            	 textArea6.append(texto6);
            	 textArea6.append(texto7);
            	 textArea6.append(texto8);
            	 textArea6.append(texto9);
            	
                 	
            	 texto3 += "// " + textField.getText() + ".";
          		texto3 += textField2.getText() + ".";
          		texto3 += textField3.getText() + ".";
          		texto3 += textField4.getText() + "\n";
          		texto11 += "//" + textField5.getText() + ".";
          		texto11 += textField6.getText() + ".";
          		texto11 += textField7.getText() + ".";
          		texto11 += textField8.getText() + "\n";
          		textArea3.setText(texto3);
         		textArea7.setText(texto3);
         		textArea5.setText(texto11);
         		textArea8.setText(texto11);
            	
         }
              
    });
       
        buttonPanel8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	int octeto5=Integer.parseInt(textField5.getText());
            	int octeto6=Integer.parseInt(textField6.getText());
            	int octeto7=Integer.parseInt(textField7.getText());
            	int octeto8=Integer.parseInt(textField8.getText());
            	
            	 int b=octeto1 & octeto5;
            	 texto6="\n" + b +".";
            	 int s=octeto2 & octeto6;
            	 texto7=s+".";
            	 int h=octeto3 & octeto7;
            	 texto8=h+".";
            	 int l=octeto4 & octeto8;
            	 texto9=l+1+"";

            	 textArea.append(texto6);
            	 textArea.append(texto7);
            	 textArea.append(texto8);
            	 textArea.append(texto9);
            	 textArea6.append(texto6);
            	 textArea6.append(texto7);
            	 textArea6.append(texto8);
            	 textArea6.append(texto9);
            	
                 	
            	 texto3 += "// " + textField.getText() + ".";
          		texto3 += textField2.getText() + ".";
          		texto3 += textField3.getText() + ".";
          		texto3 += textField4.getText() + "\n";
          		texto11 += "//" + textField5.getText() + ".";
          		texto11 += textField6.getText() + ".";
          		texto11 += textField7.getText() + ".";
          		texto11 += textField8.getText() + "\n";
          		textArea3.setText(texto3);
         		textArea7.setText(texto3);
         		textArea5.setText(texto11);
         		textArea8.setText(texto11);
            	
         }
            
        
    });
        
        buttonPanel9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField9.getText());
            	
            	int d =(int)((-Math.log10(octeto1+2)/Math.log10(2))+32);
            	
            	if((d>=24)&&(d<=30)) {
            		textArea.append("\n"+"192.168.0.0/"+d);
            		textArea6.append("\n"+"192.168.0.0/"+d);
            	}else 
            		if((d>=16)&&(d<24)) {
            			
            			textArea.append("\n"+"172.16.0.0/"+d);
            			textArea6.append("\n"+"172.16.0.0/"+d);
 
            	}else 
            		if((d>=8)&&(d<16)) {
            			
            			textArea.append("\n"+"10.0.0.0/"+d);
            			textArea6.append("\n"+"10.0.0.0/"+d);
            	
            		}else {
            			textArea.append("\n"+"Error");
            			textArea6.append("\n"+"10.0.0.0/"+d);
            	 
            		}
                 	
            	 texto3 += "// " + textField.getText() + ".";
            	 texto3 += textField2.getText() +".";
            	 texto3 += textField3.getText() +".";
            	 texto3 += textField4.getText() +"\n";
            	 texto3 += "//"+ textField9.getText() +"\n";
            	 textArea3.setText(texto3);
            	 textArea7.setText(texto3);
         }
            
        
    });
        
        buttonPanel10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int octeto1=Integer.parseInt(textField.getText());
            	int octeto2=Integer.parseInt(textField2.getText());
            	int octeto3=Integer.parseInt(textField3.getText());
            	int octeto4=Integer.parseInt(textField4.getText());
            	int octeto5=Integer.parseInt(textField5.getText());
            	int octeto6=Integer.parseInt(textField6.getText());
            	int octeto7=Integer.parseInt(textField7.getText());
            	int octeto8=Integer.parseInt(textField8.getText());
            	
            	 int u=octeto1 & octeto5;
            	 texto2="\n" + u +".";
            	 int q=octeto2 & octeto6;
            	 texto4=q+".";
            	 int j=octeto3 & octeto7;
            	 texto5=j+".";
            	 int n=octeto4 & octeto8;
            	 texto10=n+1+"";
            	 
            	int o1= ~octeto5 & 0xff;
             	int o2= ~octeto6 & 0xff;
             	int o3= ~octeto7 & 0xff;
             	int o4= ~octeto8 & 0xff;
             	
             	int k1=octeto1 | o1;
             	int k2=octeto2 | o2;
             	int k3=octeto3 | o3;
             	int k4=octeto4 | o4;
             	
             	
             	texto6="\n" + k1 +".";
             	texto7=k2+".";
             	texto8=k3+".";
             	texto9=k4-1 +"";
             	
             	
             	 textArea.append(texto2);
            	 textArea.append(texto4);
            	 textArea.append(texto5);
            	 textArea.append(texto10);
            	 textArea.append("\n"+"hasta");
            	 textArea.append(texto6);
            	 textArea.append(texto7);
            	 textArea.append(texto8);
            	 textArea.append(texto9);
            	 textArea6.append(texto2);
            	 textArea6.append(texto4);
            	 textArea6.append(texto5);
            	 textArea6.append(texto10);
            	 textArea6.append("\n"+"hasta");
            	 textArea6.append(texto6);
            	 textArea6.append(texto7);
            	 textArea6.append(texto8);
            	 textArea6.append(texto9);
            	 

                 	
            	 texto3 += "// " + textField.getText() + ".";
          		texto3 += textField2.getText() + ".";
          		texto3 += textField3.getText() + ".";
          		texto3 += textField4.getText() + "\n";
          		texto11 += "//" + textField5.getText() + ".";
          		texto11 += textField6.getText() + ".";
          		texto11 += textField7.getText() + ".";
          		texto11 += textField8.getText() + "\n";
          		textArea3.setText(texto3);
         		textArea7.setText(texto3);
         		textArea5.setText(texto11);
         		textArea8.setText(texto11);
          		
            	
         }
            
        
    });
        
        buttonPanel13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        

            	String ip = textField11.getText();
            	aberIpv6 =ip.split("[:]",ip.length() );
            	String variable = ip;
            	variable=variable.replace("::", ":");
            	StringBuilder variable2= new StringBuilder(variable);
            	int al = ip.indexOf("::");
            	if(al>0&&al<ip.length()) {
            	for(int i=0;i<8-(aberIpv6.length-1);i++) {
            		variable2.insert(al, ":0000");
            		
            	}
            	variable =variable2.toString();
            	}
            	
   
            	String DefIpv6[]= variable.split("[:]",8);
            	var1Ipv6 = DefIpv6[0];
            	var2Ipv6 = DefIpv6[1];
            	var3Ipv6 = DefIpv6[2];
            	var4Ipv6 = DefIpv6[3];
            	var5Ipv6 = DefIpv6[4];
            	var6Ipv6 = DefIpv6[5];
            	var7Ipv6 = DefIpv6[6];
            	var8Ipv6 = DefIpv6[7];
   
   
   textArea4.append(var1Ipv6+":"+var2Ipv6+":"+var3Ipv6+":"+var4Ipv6+":"+var5Ipv6+":"+var6Ipv6+":"+var7Ipv6+":"+var8Ipv6+"\n");
   textArea7.append(var1Ipv6+":"+var2Ipv6+":"+var3Ipv6+":"+var4Ipv6+":"+var5Ipv6+":"+var6Ipv6+":"+var7Ipv6+":"+var8Ipv6+"\n");
   String a1 =var1Ipv6;
  
   int s1 = Integer.parseInt(a1,16);
   String a2 =var2Ipv6;
   
   int s2 = Integer.parseInt(a2,16);
   String a3 =var3Ipv6;
   
   int s3 = Integer.parseInt(a3,16);
   String a4 =var4Ipv6;
   
   int s4 = Integer.parseInt(a4,16);
   String a5 =var5Ipv6;
   
   int s5 = Integer.parseInt(a5,16);
   String a6 =var6Ipv6;
   int s6 = Integer.parseInt(a6,16);
   String a7 =var7Ipv6;
   
   int s7 = Integer.parseInt(a7,16);
   String a8 =var8Ipv6;
   
   int s8 = Integer.parseInt(a8,16);
   
   int octeto8=Integer.parseInt(textField10.getText());
   
   if((s1>=65152)&&(s1<=65215)&&(s2>=0)&&(s2<=65535)&&(s3>=0)&&(s3<=65535)&&(s4>=0)&&(s4<=65535)&&(s5>=0)&&(s5<=65535)&&(s6>=0)&&(s6<=65535)&&(s7>=0)&&(s7<=65535)&&(s8>=0)&&(s8<=65535)) {
    textArea2.append("Unicast: link local\n");
    textArea6.append("\nUnicast: link local\n");
   }else 
    if((s1>=64512)&&(s1<=65023)&&(s2>=0)&&(s2<=65535)&&(s3>=0)&&(s3<=65535)&&(s4>=0)&&(s4<=65535)&&(s5>=0)&&(s5<=65535)&&(s6>=0)&&(s6<=65535)&&(s7>=0)&&(s7<=65535)&&(s8>=0)&&(s8<=65535)) {
     textArea2.append("Unicast: unique local\n");
     textArea6.append("Unicast: unique local\n");
    }else
     if((s1>=8192)&&(s1<=16383)&&(s2>=0)&&(s2<=65535)&&(s3>=0)&&(s3<=65535)&&(s4>=0)&&(s4<=65535)&&(s5>=0)&&(s5<=65535)&&(s6>=0)&&(s6<=65535)&&(s7>=0)&&(s7<=65535)&&(s8>=0)&&(s8<=65535)) {
      textArea2.append("Global de unicast y anycast\n");
      textArea6.append("Global de unicast y anycast\n");
     }else 
      if((s1>=65280)&&(s1<=65295)&&(s2>=0)&&(s2<=65535)&&(s3>=0)&&(s3<=65535)&&(s4>=0)&&(s4<=65535)&&(s5>=0)&&(s5<=65535)&&(s6>=0)&&(s6<=65535)&&(s7>=0)&&(s7<=65535)&&(s8>=0)&&(s8<=65535)) {
    	 textArea2.append("Multicast: Well-Known\n");
    	 textArea6.append("Multicast: Well-Known\n");
      }else 
    	  if ((s1>=65296)&&(s1<=65311)&&(s2>=0)&&(s2<=65535)&&(s3>=0)&&(s3<=65535)&&(s4>=0)&&(s4<=65535)&&(s5>=0)&&(s5<=65535)&&(s6>=0)&&(s6<=65535)&&(s7>=0)&&(s7<=65535)&&(s8>=0)&&(s8<=65535)) {
    		  textArea2.append("Multicas: Transient\n");
    		  textArea6.append("Multicas: Transient\n");
    	  }else 
    		  if ((s1==65282)&&(s2==0)&&(s3==0)&&(s4==0)&&(s5==0)&&(s6==1)&&(s7>=65280)&&(s7<=65535)&&(s8>=0)&&(s8<=65535)) {
    			  textArea2.append("Multicast: Solicited-Node\n");
    			  textArea6.append("Multicast: Solicited-Node\n");
    		  }else 
    			  if((octeto8==128)) {
    				  textArea2.append("Unicast: Loopback\n");
    				  textArea6.append("Unicast: Loopback\n");
    				  
    			  }else {
    				  textArea2.append("No es nada\n");
    				  textArea6.append("No es nada\n");
    			  }
    		  }
            
        
    });
        
}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == buttonPanel11) {
            panel1.setVisible(true);
            panel2.setVisible(false);
            panel3.setVisible(false);
        }
            if (e.getSource() == buttonPanel12) {
            panel1.setVisible(false);
            panel2.setVisible(true);
            panel3.setVisible(false);
        }
            if (e.getSource() == buttonPanel14) {
               panel1.setVisible(false);
               panel2.setVisible(false);
               panel3.setVisible(true);
	}   

}  
}

    

