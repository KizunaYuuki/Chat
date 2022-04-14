package com.mycompany.multichat;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChatPanelMain extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JButton btnNewButton;
    private JLabel lblNewLabel;
    private JLabel lblHistory;
    private JTextArea textArea_1;
    
    
    // ______________________________
    Socket socket = null;
    String sender;
    String receiver;
    BufferedReader bf = null;
    DataOutputStream os = null;

    // Một phương thức run được implement từ lớp Runable với mục đích kiểm tra tin
    // nhắn đến
    @Override
    public void run() {
	while (true) {
	    try {
		if (socket != null) {
		    String msg = "";
		    while ((msg = bf.readLine()) != null) {
			// Nếu có tin nhắn đến thì ghi vào lịch sử
			textArea_1.append(msg + "\n");
		    }
		}
	    } catch (Exception e) {
		// Do not change this because it spawn try-catch many time while running thread!
	    }
	}
    }
    
    
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    
    public ChatPanelMain(Socket s, String sender, String receiver) {
	initComponents();
	socket = s;
	this.sender = sender;
	this.receiver = receiver;
	try {
            
            
            
            
            jPanel1 = new javax.swing.JPanel();
            jTextField1 = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jButtonStart = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jTabbedPane1 = new javax.swing.JTabbedPane();
            jPanel3 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            jPanel4 = new javax.swing.JPanel();
            jPanel5 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();

            







            jPanel2.setBackground(new java.awt.Color(255, 255, 250));

            jTabbedPane1.setName("Tab"); // NOI18N

            jPanel3.setBackground(new java.awt.Color(255, 255, 255));

            jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 0, 0));
            jLabel3.setText("Chờ Client kết nối");

            jPanel4.setBackground(new java.awt.Color(250, 255, 255));

            jPanel5.setBackground(new java.awt.Color(0, 102, 204));

            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Send");

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addContainerGap())
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap())
            );

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(jLabel3)
                    .addContainerGap(166, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jTabbedPane1.addTab("Start", jPanel3);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );

            jTabbedPane1.getAccessibleContext().setAccessibleName("Tab");


            
            
	    bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    os = new DataOutputStream(socket.getOutputStream());


	    (new Thread(this)).start();
	} catch (Exception e) {
	    System.out.println("Error while create Main Panel");
	}

    }

    private void initComponents() {
    }

    public JTextArea getTextArea() {
	if (textArea == null) {
	    textArea = new JTextArea();
	    textArea.setFont(new Font("Arial", Font.PLAIN, 26));
	}
	return textArea;
    }

    public JButton getBtnNewButton() {
	if (btnNewButton == null) {
	    btnNewButton = new JButton("SEND");
	    btnNewButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		    if (textArea.getText().isEmpty()) return;
		    try {
			os.writeBytes(sender + ": " + textArea.getText() + "\n");
			os.flush();
			textArea_1.append(sender + ": " + textArea.getText() + "\n");
			textArea.setText("");
		    } catch (Exception e) {
			System.out.println("Error while sendding messeger");
		    }
		}
	    });
	    btnNewButton.setBackground(Color.CYAN);
	    btnNewButton.setForeground(Color.RED);
	    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
	}
	return btnNewButton;
    }

    public JLabel getLblNewLabel() {
	if (lblNewLabel == null) {
	    lblNewLabel = new JLabel("Type the mess here to send");
	    lblNewLabel.setForeground(Color.WHITE);
	    lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
	}
	return lblNewLabel;
    }

    public JLabel getLblHistory() {
	if (lblHistory == null) {
	    lblHistory = new JLabel("History");
	    lblHistory.setForeground(Color.WHITE);
	    lblHistory.setFont(new Font("Tahoma", Font.ITALIC, 18));
	}
	return lblHistory;
    }

    public JTextArea getTextArea_1() {
	if (textArea_1 == null) {
	    textArea_1 = new JTextArea();
	    textArea_1.setFont(new Font("Arial", Font.PLAIN, 30));
	}
	return textArea_1;
    }
}
