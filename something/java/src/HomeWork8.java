import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Words extends JFrame {
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    String wordGuessed = chooseWord();
    StringBuffer currentHint = new StringBuffer("###############");

    public Words () {
        setTitle("Игра в слова");
        setLocation(460,180);
        setSize(450,450);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Угадай какое слово я загадал?");
        label.setBounds(122,100,400,30);
        add(label);
        JLabel labelW = new JLabel("Жду ответа");
        labelW.setBounds(122,200,400,30);
        add(labelW);
        JTextField field = new JTextField();
        field.setBounds(96, 150, 250, 30);
        add(field);
        JButton button = new JButton("Ответить!");
        button.setBounds(170, 250, 100, 30);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button.getText().equals("Ответить!")) {
                    String wordPassed = field.getText();
                    if (compareWords(wordPassed)) {
                        labelW.setText("Ура! Ты угадал! Сыграем ещё?");
                        button.setText("Повторить!");
                    } else {
                        labelW.setText("Не совсем! Твоя подсказка: " + currentHint);
                    }
                } else if (button.getText().equals("Повторить!")) {
                    labelW.setText("Жду ответа");
                    button.setText("Ответить!");
                    wordGuessed = chooseWord();
                    currentHint = new StringBuffer("###############");
                }
            }
        });

        setVisible(true);
    }

    public String chooseWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }

    public boolean compareWords(String wordPassed) {
        int shortestLength = Math.min(wordPassed.length(), wordGuessed.length());
        for (int i = 0; i < shortestLength; i++) {
            if (wordPassed.charAt(i) == wordGuessed.charAt(i)) {
                currentHint = currentHint.replace(i, i + 1, String.valueOf(wordPassed.charAt(i)));
            }
        }
        return wordPassed.equals(wordGuessed);
    }
}
