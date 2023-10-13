import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've choosen:" + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
/**
 * Nếu người dùng chọn "Cancel" trong JOptionPane.showConfirmDialog, nó sẽ trả
 * về JOptionPane.CANCEL_OPTION
 * import javax.swing.JOptionPane;
 * 
 * public class ChoosingOptionYesNo {
 * public static void main(String[] args) {
 * // Customize options as "Yes" and "No"
 * String[] options1 = { "Yes", "No" };
 * int option1 = JOptionPane.showOptionDialog(
 * null,
 * "Do you want to change to the first class ticket?",
 * "Customized Options",
 * JOptionPane.YES_NO_OPTION,
 * JOptionPane.QUESTION_MESSAGE,
 * null,
 * options1,
 * options1[0]);
 * String result1 = (option1 == JOptionPane.YES_OPTION) ? "Yes" : "No";
 * 
 * JOptionPane.showMessageDialog(null, "You've chosen: " + result1);
 * System.exit(0);
 * }
 * }
 */
