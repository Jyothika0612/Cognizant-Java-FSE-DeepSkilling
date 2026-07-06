import javax.swing.*;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("Loading image from remote server: " + fileName);
    }

    @Override
    public void display() {
        JFrame frame = new JFrame("Image Viewer");
        ImageIcon icon = new ImageIcon(fileName);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}