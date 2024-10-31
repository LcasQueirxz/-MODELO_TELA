package project; 

import javax.swing.*; // Importando classes Swing
import java.awt.*; // Importando classes AWT

public class AWTTesteSwing {
    public static void main(String[] args) {
        // Instanciando a classe JFrame para criar a janela principal
        JFrame frame = new JFrame("AWT Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Método para realizar a ação de fechar a janela
        frame.setSize(400, 200); // Definindo o tamanho da janela
        frame.setLayout(new BorderLayout()); // Definindo o layout da janela

        // Instanciando a classe JLabel para criar um rótulo
        JLabel label1 = new JLabel("Label1");
        // Instanciando a classe JTextField para criar um campo de texto
        JTextField textField1 = new JTextField(15);
        
        // Instanciando a classe JPanel para criar um painel superior
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout()); // Definindo o layout do painel superior
        topPanel.add(label1); // Adicionando o rótulo ao painel superior
        topPanel.add(textField1); // Adicionando o campo de texto ao painel superior

        // Instanciando a classe JButton para criar botões
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        
        // Instanciando a classe JPanel para criar um painel de botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // Definindo o layout do painel de botões
        buttonPanel.add(button1); // Adicionando o botão 1 ao painel de botões
        buttonPanel.add(button2); // Adicionando o botão 2 ao painel de botões
        buttonPanel.add(button3); // Adicionando o botão 3 ao painel de botões

        // Adicionando o painel superior à parte norte da janela
        frame.add(topPanel, BorderLayout.NORTH);
        // Adicionando o painel de botões à parte central da janela
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true); // Método para realizar a ação de tornar a janela visível
    }
}
